// autogenerated using string template disenumpart1.txt

package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * This <code>enum</code> type is generated from XML,
 *  UID 165,
 * marshal size 8;
 * TransmitterInputSource has 15 enumerations total.
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum TransmitterInputSource 
{
    // autogenerated using string template disenumfootnotecomment.txt

    /** Other */
    // autogenerated using string template disenumpart2.txt
    OTHER (0, "Other"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Pilot */
    // autogenerated using string template disenumpart2.txt
    PILOT (1, "Pilot"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Copilot */
    // autogenerated using string template disenumpart2.txt
    COPILOT (2, "Copilot"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** First Officer */
    // autogenerated using string template disenumpart2.txt
    FIRST_OFFICER (3, "First Officer"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Driver */
    // autogenerated using string template disenumpart2.txt
    DRIVER (4, "Driver"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Loader */
    // autogenerated using string template disenumpart2.txt
    LOADER (5, "Loader"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Gunner */
    // autogenerated using string template disenumpart2.txt
    GUNNER (6, "Gunner"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Commander */
    // autogenerated using string template disenumpart2.txt
    COMMANDER (7, "Commander"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Digital Data Device */
    // autogenerated using string template disenumpart2.txt
    DIGITAL_DATA_DEVICE (8, "Digital Data Device"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Intercom */
    // autogenerated using string template disenumpart2.txt
    INTERCOM (9, "Intercom"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Audio Jammer */
    // autogenerated using string template disenumpart2.txt
    AUDIO_JAMMER (10, "Audio Jammer"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Data Jammer */
    // autogenerated using string template disenumpart2.txt
    DATA_JAMMER (11, "Data Jammer"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** GPS Jammer */
    // autogenerated using string template disenumpart2.txt
    GPS_JAMMER (12, "GPS Jammer"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** GPS Meaconer */
    // autogenerated using string template disenumpart2.txt
    GPS_MEACONER (13, "GPS Meaconer"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** SATCOM Uplink Jammer */
    // autogenerated using string template disenumpart2.txt
    SATCOM_UPLINK_JAMMER (14, "SATCOM Uplink Jammer"),;

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    TransmitterInputSource(int value, String description)
    {
        this.value = value;
        this.description = description;
    }
    /** Provide enumeration value
      * @return integer value */
    public int getValue()
    {
        return value;
    }

    /** Provide enumeration description
     * @return description
     */
    public String getDescription()
    {
        return description;
    }

    /** bit width for this enumeration
     * @return number of bits wide
     */
    public static int getEnumBitWidth()
    {
      return 8;
    }

    /** 
     * Provide enumeration for a given value
     * @param value integer value of interest
     * @return enumeration corresponding to numeric value
     */
    public static TransmitterInputSource getEnumForValue(int value)
    {
       for (TransmitterInputSource nextEnum : TransmitterInputSource.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum TransmitterInputSource");
       System.err.flush(); // ensure contiguous console outputs
       return null;
    }

    // autogenerated using string template disenumpart3_8.txt

    private boolean TRACE = false;

    /** Set tracing on/off for this object 
     * @param value whether tracing is on or off */
    public void setTRACE (boolean value)
    {
        TRACE = value;
    }

    /** Whether tracing is on or off for this object
     * @return whether tracing is on or off */
    public boolean getTRACE ()
    {
        return TRACE;
    }

    /** Marshal value to DataOutputStream
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param dos DataOutputStream for output
     * @throws IOException input-output error */
    public void marshal(DataOutputStream dos) throws IOException
    {
        dos.writeByte(getValue());
    }
    
    /** Marshal value to ByteBuffer
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param byteBuffer ByteBuffer for output
     * @throws IOException input-output error */
    public void marshal(ByteBuffer byteBuffer) throws Exception
    {
        byteBuffer.put((byte)getValue());
    }

    /** Unmarshal value to DataInputStream
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param dis DataInputStream for input
     * @throws Exception unmarshalling input-output error
     * @return enumeration of interest */
    public static TransmitterInputSource unmarshalEnum (DataInputStream dis) throws Exception
    {
       /* try {
            value = dis.readUnsignedByte();
        }
        catch(IOException ex) {
            showError(ex);
        } */
        
        return getEnumForValue(dis.readByte());
    } 

    /** Unmarshal enumeration value to ByteBuffer
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param byteBuffer ByteBuffer for input
     * @throws Exception unmarshalling input-output error
     * @return enumeration of interest */
    public static TransmitterInputSource unmarshalEnum(ByteBuffer byteBuffer) throws Exception
    {
        /*
        try {
            value = (int)byteBuffer.get();
        }
        catch(Exception ex) {
            showError(ex);
        }
        */
        return getEnumForValue(byteBuffer.get());
    }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
    public int getMarshalledSize()
    {
        return 1; // 8 bits
    }
    
  /**
   * Provide simple identifier
   * @return class name, value and name
   */
    @Override
    public String toString()
    {
        String padding = new String();
        if (this.getClass().getName().endsWith("DisPduType") && (getValue() < 10))
            padding = "0"; // leading zero for column spacing
        String result = this.getClass().getSimpleName() + " " + padding + getValue() + " " + name();
        if (getTRACE())
            System.out.println ("*** enum " + this.getClass().getSimpleName() + " name=" + name() + ", value=" + getValue() + "; " +
               result); // debug diagnostic
        return result;
    }
}
