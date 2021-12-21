package edu.nps.moves.dis7.utilities.stream;

import com.google.common.primitives.Longs;
import edu.nps.moves.dis7.enumerations.DisPduType;
import edu.nps.moves.dis7.pdus.Pdu;
import edu.nps.moves.dis7.utilities.DisThreadedNetworkInterface;
import edu.nps.moves.dis7.utilities.PduFactory;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FilenameUtils;

/** Utility to save PDUs received over the network to disk
 * 
 * @author Mike Bailey, jmbailey@nps.edu
 */
public class PduRecorder implements PduReceiver
{
    /** Default multicast group address <code>239.1.2.3</code> for send and receive connections.
     * @see <a href="https://en.wikipedia.org/wiki/Multicast_address">https://en.wikipedia.org/wiki/Multicast_address</a>  */
    public static String DEFAULT_DIS_ADDRESS = DisThreadedNetworkInterface.DEFAULT_DIS_ADDRESS;

    /** Default socket port  <code>3000</code>, matches Wireshark DIS capture default
     * @see <a href="https://en.wikipedia.org/wiki/Port_(computer_networking)">https://en.wikipedia.org/wiki/Port_(computer_networking)</a> */
    public static int DEFAULT_DIS_PORT = DisThreadedNetworkInterface.DEFAULT_DIS_PORT;
    
    private String disAddress = DEFAULT_DIS_ADDRESS;
    private int    disPort    = DEFAULT_DIS_PORT;
  
    private boolean verbose         = true;
    private boolean verboseReceipt  = true;
    private boolean verboseSending  = true;
    private boolean verboseIncludesTimestamp = false;
    
    /** Character sentinel indicating remainder of line is a comment */
    public static final String COMMENT_MARKER = "#";

    static final String OUTPUT_DIRECTORY_DEFAULT = "./pduLog";
                 private String outputDirectory          = OUTPUT_DIRECTORY_DEFAULT;
                 private Path   outputDirectoryPath;
    static final String DEFAULT_FILE_PREFIX      = "PduCaptureLog";
    static final String DISLOG_FILE_EXTENSION    = ".dislog";
    static final String DEFAULT_FILE_NAME        = DEFAULT_FILE_PREFIX + DISLOG_FILE_EXTENSION;

    static final String START_COMMENT_MARKER           = COMMENT_MARKER + " Start, ";
    static final String FINISH_COMMENT_MARKER          = COMMENT_MARKER + " Finish, ";
    
    static final String ENCODING_BASE64                = "ENCODING_BASE64";
    static final String ENCODING_PLAINTEXT             = "ENCODING_PLAINTEXT";
                     // not yet implemented
    static final String ENCODING_BINARY                = "ENCODING_BINARY";  // TODO likely requires different code path
    static final String ENCODING_XML                   = "ENCODING_XML";     // TODO, repeat Open-DIS version 4 effort
    static final String ENCODING_CDIS                  = "ENCODING_CDIS";    // future work based on new SISO standard
    static final String ENCODING_EXI                   = "ENCODING_EXI";     // TODO, use Exificient or Nagasena libraries
    static final String ENCODING_JSON                  = "ENCODING_JSON";    // TODO, repeat Open-DIS version 4 effort
    static final String ENCODING_MAK_DATA_LOGGER       = "ENCODING_MAK_DATA_LOGGER";       // verbose pretty-print. perhaps output only (MAK format itself is binary)
    static final String ENCODING_WIRESHARK_DATA_LOGGER = "ENCODING_WIRESHARK_DATA_LOGGER"; // 
    
    static final List<String> ENCODING_OPTIONS_LIST = new ArrayList<>();
    static final List<String> ENCODING_OPTIONS_TODO = new ArrayList<>();

    private static String encodingPduLog = ENCODING_PLAINTEXT; // default

    private String TRACE_PREFIX = ("[pduRecorder " + getDescriptor()).trim() + "] ";
    private String  descriptor      = new String();

    private Writer logFileWriter;
    private File   logFile;
    private String logFileName = DEFAULT_FILE_NAME;
    private DisThreadedNetworkInterface                disThreadedNetworkInterface;
    private DisThreadedNetworkInterface.RawPduListener disRawPduListener;

    private Long      startNanoTime = null;
    private final  StringBuilder sb = new StringBuilder();
    private final  Base64.Encoder base64Encoder = Base64.getEncoder();
    private final  int     pduCount = 0;    // debug
    private boolean headerWritten   = false;
    private boolean running         = true; // starts recording by default
    
    private void initialize()
    {
        if (ENCODING_OPTIONS_LIST.isEmpty())
        {
            ENCODING_OPTIONS_LIST.add(ENCODING_PLAINTEXT            );
            ENCODING_OPTIONS_LIST.add(ENCODING_BASE64               );
            // not yet implemented
            ENCODING_OPTIONS_TODO.add(ENCODING_BINARY               ); // IEEE DIS format
            ENCODING_OPTIONS_TODO.add(ENCODING_XML                  );
            ENCODING_OPTIONS_TODO.add(ENCODING_CDIS                 );
            ENCODING_OPTIONS_TODO.add(ENCODING_EXI                  );
            ENCODING_OPTIONS_TODO.add(ENCODING_JSON                 );
            ENCODING_OPTIONS_TODO.add(ENCODING_MAK_DATA_LOGGER      );
            ENCODING_OPTIONS_TODO.add(ENCODING_WIRESHARK_DATA_LOGGER);
        }
    }
  
    /**
     * Default constructor that uses default values for output directory, DIS address and port.
     * Each instance must invoke start() to begin operations, pause() to suspend operations, 
     * resume() to continue operations, and stop() to terminate operations.
     * @throws IOException if something goes wrong during instantiation
     */
    public PduRecorder() throws IOException
    {
        this (OUTPUT_DIRECTORY_DEFAULT, DEFAULT_DIS_ADDRESS, DEFAULT_DIS_PORT);
    }

    /**
     * Constructor to let the use specify an output directory.
     * Uses default values for multicast address and port.
     * Each instance must invoke start() to begin operations, pause() to suspend operations, 
     * resume() to continue operations, and stop() to terminate operations.
     * 
     * @param initialOutputDirectory the directory to write log files to
     * @throws IOException if something goes wrong during instantiation
     */
    public PduRecorder(String initialOutputDirectory) throws IOException
    {
        this(initialOutputDirectory, DEFAULT_DIS_ADDRESS, DEFAULT_DIS_PORT);
    }

    /** Constructor to let the user specify all required parameters.
     * Each instance must invoke start() to begin operations, pause() to suspend operations, 
     * resume() to continue operations, and stop() to terminate operations..
     * 
     * @param initialOutputDirectory local path for directory where the log files are written
     * @param initialAddress multicast group address to receive data from (TODO allow unicast UDP)
     * @param initialPort UDP port to listen for data
     */
    @SuppressWarnings("Convert2Lambda")
    public PduRecorder(String initialOutputDirectory, String initialAddress, int initialPort)
    {
        initialize();
        outputDirectoryPath = new File(initialOutputDirectory).toPath();
        setDescriptor("PduRecorder"); // default
        setAddress(initialAddress);
        setPort   (initialPort);
    }

      /**
       * TODO change this to enumeration type for strictness
       *
       * @return the pduLogEncoding
       */
      public static String getEncodingPduLog()
      {
          return encodingPduLog;
      }

      /**
       * @param newEncodingPduLog the pduLogEncoding to set
       */
      public void setEncodingPduLog(String newEncodingPduLog)
      {
          newEncodingPduLog = newEncodingPduLog.trim();
          String errorMessage = "*** setEncodingPduLog(" + newEncodingPduLog + ") ";
          if (ENCODING_OPTIONS_LIST.contains(newEncodingPduLog))
          {
              encodingPduLog = newEncodingPduLog;
              return;
          }
          else if (ENCODING_OPTIONS_TODO.contains(newEncodingPduLog))
          {
              errorMessage += " is not yet a supported encoding";
          }
          else
          {
              errorMessage += " is not yet a recognizeded encoding";
          }
          errorMessage += ", encodingPduLog=" + encodingPduLog + " is unchanged";
          System.err.println (errorMessage);
          System.err.flush(); // since network threads may be occurring
          // return
      }

    /** Resume instance operation
     * @see start()
     * @see stop()
     * @see pause() */
    public void resume()
    {
      if  (disThreadedNetworkInterface == null)
      {
           System.out.println("** Warning, PduRecorder resume() failed to find running disThreadedNetworkInterface, repeating start()");
           start(); // start me up
      }
      else running = true;
    }

    /** Start instance operation, resetting network interface and file recording
     * @see stop()
     * @see pause()
     * @see resume()
     */
    public void start()
    {
        try {
            logFile         = createUniquePduLogFile(getOutputDirectoryPath(), getLogFileName());
            logFileWriter   = new PrintWriter(new BufferedWriter(new FileWriter(logFile)));
        }
        catch (IOException ex)
        {
          System.err.println("Exception when creating log file in directory=" + getOutputDirectoryPath().toAbsolutePath() + "\n" +
                              "   " + ex.getClass().getSimpleName() + ": " + ex.getLocalizedMessage());
        }
        if (disThreadedNetworkInterface == null)
        {
            disThreadedNetworkInterface = new DisThreadedNetworkInterface(getAddress(), getPort());
            disThreadedNetworkInterface.setDescriptor (getDescriptor()); // pass it along
            disThreadedNetworkInterface.setVerbose(verbose);

            disRawPduListener = new DisThreadedNetworkInterface.RawPduListener() {
                @Override
                public void incomingPdu(DisThreadedNetworkInterface.ByteArrayBufferAndLength bAndL) {
                    receivePdu(bAndL.bufferByteArray, bAndL.length);
                }
            };
            disThreadedNetworkInterface.addRawListener(disRawPduListener);
            System.out.println("[" + (getClass().getSimpleName() + " " + getDescriptor()).trim() + "] listening to IP address " + getAddress() + " on port " + getPort());
        }
        running = true;
    }
    /** Pause operation of this instance
     * @see start()
     * @see stop()
     * @see resume()
     */
    public void pause()
    {
      running = false;
    }
    /** End operation of this instance, removing interfaces
      * @return recorder logFile
     * @see start()
     * @see pause()
     * @see resume() */
    public File stop()
    {
      running = false;
      if (disThreadedNetworkInterface != null)
      {
          disThreadedNetworkInterface.removeRawListener(disRawPduListener);
          disThreadedNetworkInterface.setKillSentinel();
          disThreadedNetworkInterface = null; // ensure reset upon re-start
      }

      writeFooter();
      headerWritten = false; // reset for another run
      try {
          System.out.println();
          System.out.println("Closing recorder log file: " + logFile.getCanonicalPath());
          logFileWriter.close(); // a flush occurs first during a close
      } 
      catch (IOException ex) {
          Logger.getLogger(PduRecorder.class.getName()).log(Level.SEVERE, null, ex);
      }
      return logFile;
    }

    byte[] oldBuffer;

    /** receivePdu from DIS data stream
     * @param newBuffer byte array for receiving data
     * @param newLength length of byte array
     */
    @Override
    public void receivePdu(byte[] newBuffer, int newLength)
    {
      if (java.util.Arrays.equals(newBuffer, oldBuffer))
          System.err.println ("PduRecorder warning: PDU newBuffer equals PDU oldBuffer"); // debug

      if(!isRunning())
        return;

      long packetRcvNanoTime = System.nanoTime();
      if (startNanoTime == null)
          startNanoTime = packetRcvNanoTime;

      byte[] timeByteArray = Longs.toByteArray(packetRcvNanoTime - startNanoTime);
      //System.out.println("wrote time "+(packetRcvNanoTime - startNanoTime));

      byte[] buffsized = Arrays.copyOf(newBuffer, newLength);
      DisPduType pduType;

      switch (encodingPduLog)
      {
          case ENCODING_BASE64:
              sb.append(base64Encoder.encodeToString(timeByteArray));
              sb.append(',');
              sb.append(base64Encoder.encodeToString(buffsized)); 
              break;

          case ENCODING_PLAINTEXT:
              // by Tobias Brennenstuhl Spring 2020
              sb.append(Arrays.toString(timeByteArray).replace(" ", ""));
              sb.append(',');
              sb.append(Arrays.toString(buffsized).replace(" ", ""));
              sb.append(" # ");
              pduType = DisPduType.getEnumForValue(Byte.toUnsignedInt(buffsized[2])); // 3rd byte
              sb.append(pduType);
              break;

          default:
              System.err.println ("Encoding " + encodingPduLog + " not recognized or supported");
      }
      if (!headerWritten) {
        writeHeader();
        headerWritten = true;
      }
      try {
        logFileWriter.write(sb.toString());
        ((PrintWriter)logFileWriter).println();
      }
      catch (IOException ex) {
        throw new RuntimeException("Fatal exception writing DIS log file in PduRecorder thread: " + ex);
      }
      //System.out.println("Recorder: "+ ++pduCount);

      sb.setLength(0);
    }

    /** Retrieve the path to the log file
     * 
     * @return the path to the log file
     */
    public String getLogFilePath()
    {
      return logFile.getAbsolutePath();
    }

      /**
       * Deprecated, use getDisThreadedNetworkInterface() instead
       * @see getDisThreadedNetworkInterface()
       * @return an instance of this DisThreadedNetworkInterface
       */
      @Deprecated
      public DisThreadedNetworkInterface getDisThreadedNetIF() {
          return getDisThreadedNetworkInterface();
      }

      /**
       * @return an instance of this DisThreadedNetworkInterface
       */
      public DisThreadedNetworkInterface getDisThreadedNetworkInterface() {
          return disThreadedNetworkInterface;
      }

    private void writeHeader()
    {
        String timeStamp = getTimeStamp();

        try
        {
            logFileWriter.write(START_COMMENT_MARKER + encodingPduLog + ", " + TRACE_PREFIX + timeStamp + ", DIS capture file, " + logFile.getPath());
            ((PrintWriter) logFileWriter).println();
        } 
        catch (IOException ex)
        {
            Logger.getLogger(PduRecorder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void writeFooter()
    {   
        String timeStamp = getTimeStamp();

        try
        {
            logFileWriter.write(FINISH_COMMENT_MARKER + encodingPduLog + ", " + TRACE_PREFIX + timeStamp + ", DIS capture file, " + logFile.getPath());
            ((PrintWriter) logFileWriter).println();
        } 
        catch (IOException ex)
        {
            Logger.getLogger(PduRecorder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String getTimeStamp() {
        // https://stackoverflow.com/questions/5175728/how-to-get-the-current-date-time-in-java
        return new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()); 
    }

    /**
     * Rotates through file names so that no present file get overwritten.
     * 
     * @param outputDir the directory to place the log file
     * @param filename the name of the file w/ extension
     * @return a File reference to the log file
     * @throws IOException if something goes awry
     */
    private File createUniquePduLogFile(Path outputDir, String filename) throws IOException
    {
      String baseName  = FilenameUtils.getBaseName(filename);
      String extension = FilenameUtils.getExtension(filename);

      Integer fileCounter = null;
      File    newFile;
      boolean fileExists;
      outputDir.toFile().mkdirs();
      do {
        String nextFileName = baseName + (fileCounter == null ? "" : fileCounter) + "." + extension;
        newFile = new File(outputDir.toFile(), nextFileName);
        fileExists = newFile.exists();
        if (fileCounter == null)
          fileCounter = 1;
        else
          fileCounter++;
      } while (fileExists);

      if (newFile.createNewFile()) 
      {
          System.out.println("Recorder log file open: " + newFile.getCanonicalPath());
      }
      else
      {
        System.out.println("Cannot create dis log file at " + newFile.getAbsolutePath());
        throw new RuntimeException("File creation error");
      }
      return newFile;
    }

    /**
     * @return the pduRecorderRunning
     */
    public boolean isRunning()
    {
        return running;
    }
  
    /**
     * Entry point invocation, runs selfTest().
     *
     * @param args none supported, TODO offer path/filename
     */
    public static void main(String[] args)
    {
        try
        {
            PduRecorder pduRecorder = new PduRecorder();
            pduRecorder.selfTest(args);
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
  
  /** This selfTest() method saves a PDU output log to project pduLog/ directory. 
   *  Separately Invoking the edu.nps.moves.dis7.examples.PduReaderPlayer will playback all logs 
   *  written to that log directory
   * 
   * @param args none supported, TODO offer path/filename
   */
  public void selfTest(String[] args)
  {
    initialize();
    System.out.println("dis7.utilities.stream.PduRecorder main() performs self-test by sending full set of PDUs");
    
                     PduFactory factory = new PduFactory(); // default appid, country, etc.
                    PduRecorder pduRecorder;
    DisThreadedNetworkInterface disNetworkInterface;
    try 
    {
        pduRecorder = new PduRecorder(); // default address, port, output directory path
    } 
    catch(IOException ex) 
    {
      System.err.println("Exception creating PduRecorder: " + ex.getLocalizedMessage());
      System.err.println(ex.getStackTrace());
      return;
    }
    DisPduType allPDUTypesArray[] = DisPduType.values();
    System.out.println("dis7.utilities.stream.PduRecorder allPDUTypesArray created, length=" + allPDUTypesArray.length + " ...");
    System.out.flush(); // ensure all output sent
    
    for (String currentEncoding : ENCODING_OPTIONS_LIST)
    {
        System.out.println("=================================================");
        System.out.println("Test PduRecorder encoding " + currentEncoding);
        pduRecorder.setEncodingPduLog(currentEncoding);
        pduRecorder.setDescriptor("PduRecorder main() self test");
//      pduRecorder.setPort(1); // option to avoid listening to other PDU streams during self test
        pduRecorder.setLogFileName("PduRecorderSelfTest" + currentEncoding + "_" + DEFAULT_FILE_PREFIX + DISLOG_FILE_EXTENSION);
        pduRecorder.start();
        disNetworkInterface = pduRecorder.getDisThreadedNetworkInterface(); // must reinitialize after each start
        System.out.println("dis7.utilities.stream.PduRecorder pduRecorder started... isRunning()=" + pduRecorder.isRunning());

        for (int i=1; i < allPDUTypesArray.length; i = i + 1)
        {
          DisPduType pduTypeValue = allPDUTypesArray[i];
          if (pduTypeValue != DisPduType.OTHER) 
          {
            try {
                Pdu nextPdu = factory.createPdu(allPDUTypesArray[i]);
                disNetworkInterface.send(nextPdu);
                Thread.sleep (50L); // let send/receive threads and streams catch up
            }
            catch (InterruptedException ex) {
              System.err.println("Exception sending Pdu " + pduTypeValue + ": " + ex.getLocalizedMessage());
            }
          }
          else 
          {
              System.err.println("Found pduTypeValue=DisPduType.OTHER=" + pduTypeValue);
          }
        };
        System.out.flush();
        System.err.flush(); // ensure all output sent
        pduRecorder.stop();
        System.out.println("dis7.utilities.stream.PduRecorder pduRecorder complete... isRunning()=" + pduRecorder.isRunning());
    }
    // end of loop ENCODING_OPTIONS_LIST
  }
    /**
     * Get current multicast (or unicast) network address for send and receive connections.
     * @see <a href="https://en.wikipedia.org/wiki/Multicast_address">https://en.wikipedia.org/wiki/Multicast_address</a> 
     * @return current multicast address value
     */
    public String getAddress()
    {
        return this.disAddress;
    }
    /**
     * Network address for send and receive connections.
     * @see <a href="https://en.wikipedia.org/wiki/Multicast_address">https://en.wikipedia.org/wiki/Multicast_address</a> 
     * @param newAddress the new network address to set
     */
    public void setAddress(String newAddress) {
        if (isRunning() && (this.disAddress != newAddress))
            System.out.println(TRACE_PREFIX + "*** warning, attempting to change network address while running...");
        // TODO warn if netIF already created
        this.disAddress = newAddress;
    }
    /** Get network port used, multicast or unicast.
     * @see <a href="https://en.wikipedia.org/wiki/Port_(computer_networking)">https://en.wikipedia.org/wiki/Port_(computer_networking)</a> 
     * @return current port value
     */
    public int getPort()
    {
        return this.disPort;
    }
    /**
    /** Set network port used, multicast or unicast.
     * @see <a href="https://en.wikipedia.org/wiki/Port_(computer_networking)">https://en.wikipedia.org/wiki/Port_(computer_networking)</a> 
     * @param newPortValue the disPort value to set
     */
    public void setPort(int newPortValue)
    {
        if (isRunning() && (this.disPort != newPortValue))
            System.out.println(TRACE_PREFIX + "*** warning, attempting to change network port while running...");
        // TODO warn if netIF already created
        this.disPort = newPortValue;
    }
    /**
     * Get simple descriptor (such as parent class name) for this network interface, used in trace statements
     * @return simple descriptor name
     */
    public String getDescriptor() {
        return descriptor;
    }

    /**
     * Set new simple descriptor (such as parent class name) for this network interface, used in trace statements
     * @param newDescriptor simple descriptor name
     */
    public void setDescriptor(String newDescriptor) 
    {
        this.descriptor = newDescriptor;
        TRACE_PREFIX = "[" + (DisThreadedNetworkInterface.class.getSimpleName() + " " + descriptor).trim() + "] ";
    }
    /**
     * Set whether or not trace statements are provided when packets are sent or received.
     * @param newValue the verbose status to set, also resets verboseReceipt and verboseSending to match.
     * @see verboseReceipt
     * @see verboseSending
     */
    public void setVerbose(boolean newValue)
    {
        this.verbose   = newValue;
        verboseReceipt = verbose;
        verboseSending = verbose;
        if (disThreadedNetworkInterface != null)
        {
            disThreadedNetworkInterface.setVerbose(newValue);
        }
    }
    /**
     * Whether or not trace statements are provided when packets are sent or received.
     * @return the verbose status
     * @see verboseReceipt
     * @see verboseSending
     */
    public boolean hasVerboseOutput()
    {
        return verbose;
    }
    /**
     * Set whether or not trace statements are provided when packets are received.
     * @param newValue the verboseReceipt status to set
     * @see verbose
     * @see verboseSending
     */
    public void setVerboseReceipt(boolean newValue)
    {
        this.verboseReceipt = newValue;
        verbose = (verboseReceipt || verboseSending);
        if (disThreadedNetworkInterface != null)
        {
            disThreadedNetworkInterface.setVerboseReceipt(newValue);
        }
    }
    /**
     * Whether or not trace statements are provided when packets are received.
     * @return the verboseReceipt status
     */
    public boolean hasVerboseReceipt()
    {
        return verboseReceipt;
    }

    /**
     * Set whether or not trace statements are provided when packets are sent.
     * @param newValue the verboseSending status to set
     * @see verbose
     * @see verboseReceipt
     */
    public void setVerboseSending(boolean newValue)
    {
        this.verboseSending = newValue;
        verbose = (verboseReceipt || verboseSending);
        if (disThreadedNetworkInterface != null)
        {
            disThreadedNetworkInterface.setVerboseSending(newValue);
        }
    }
    /**
     * Whether or not trace statements are provided when packets are sent.
     * @return the verboseSending status
     */
    public boolean hasVerboseSending()
    {
        return verboseSending;
    }

    /**
     * Whether or not trace statements include timestamp values.
     * @return the verboseIncludesTimestamp value
     */
    public boolean hasVerboseOutputIncludesTimestamp()
    {
        return verboseIncludesTimestamp;
    }

    /**
     * Set whether or not trace statements include timestamp values.
     * @param verboseIncludesTimestamp the value to set
     */
    public void setVerboseIncludesTimestamp(boolean verboseIncludesTimestamp)
    {
        this.verboseIncludesTimestamp = verboseIncludesTimestamp;
        if (disThreadedNetworkInterface != null)
        {
            disThreadedNetworkInterface.setVerboseIncludesTimestamp(verboseIncludesTimestamp);
        }
    }

    /**
     * @return the logFileName
     */
    public String getLogFileName() {
        return logFileName;
    }

    /**
     * @param logFileName the logFileName to set
     */
    public void setLogFileName(String logFileName) {
        this.logFileName = logFileName;
    }

    /**
     * Get output directory for this PduRecorder
     * @return the outputDirectory
     */
    public String getOutputDirectory() {
        return outputDirectory;
    }

    /**
     * Set output directory for this PduRecorder
     * @param outputDirectory the outputDirectory to set
     */
    public void setOutputDirectory(String outputDirectory) {
        this.outputDirectory = outputDirectory;
        outputDirectoryPath = new File(outputDirectory).toPath();
    }

    /**
     * Get output directory path for this PduRecorder.
     * To change outputDirectoryPath, invoke setOutputDirectory().
     * @see setOutputDirectory(String)
     * @return the outputDirectoryPath
     */
    public Path getOutputDirectoryPath() {
        return outputDirectoryPath;
    }
}
