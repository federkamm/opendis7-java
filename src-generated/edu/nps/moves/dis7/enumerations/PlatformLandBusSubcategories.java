// autogenerated using string template disenumpart1withfootnote.txt

package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * This <code>enum</code> type is generated from XML,
 *  UID 429, marshal size 8;
 * PlatformLandBusSubcategories has 19 enumerations total.
 * Subcategories for Land Platform Category 82
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum PlatformLandBusSubcategories 
{

    // autogenerated using string template disenumfootnotecomment.txt

    /** Other */
    // autogenerated using string template disenumpart2.txt
    OTHER (0, "Other"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Commuter (Flat Nose) */
    // autogenerated using string template disenumpart2.txt
    COMMUTER_FLAT_NOSE (1, "Commuter (Flat Nose)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Commuter (Snout Nose) */
    // autogenerated using string template disenumpart2.txt
    COMMUTER_SNOUT_NOSE (2, "Commuter (Snout Nose)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Shuttle */
    // autogenerated using string template disenumpart2.txt
    SHUTTLE (3, "Shuttle"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Double Decker */
    // autogenerated using string template disenumpart2.txt
    DOUBLE_DECKER (4, "Double Decker"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Guided */
    // autogenerated using string template disenumpart2.txt
    GUIDED (5, "Guided"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Kneeling */
    // autogenerated using string template disenumpart2.txt
    KNEELING (6, "Kneeling"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Midibus */
    // autogenerated using string template disenumpart2.txt
    MIDIBUS (7, "Midibus"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Minibus */
    // autogenerated using string template disenumpart2.txt
    MINIBUS (8, "Minibus"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Mini Wheelchair */
    // autogenerated using string template disenumpart2.txt
    MINI_WHEELCHAIR (9, "Mini Wheelchair"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Motorcoach */
    // autogenerated using string template disenumpart2.txt
    MOTORCOACH (10, "Motorcoach"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Prison Bus */
    // autogenerated using string template disenumpart2.txt
    PRISON_BUS (11, "Prison Bus"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Schoolbus */
    // autogenerated using string template disenumpart2.txt
    SCHOOLBUS (12, "Schoolbus"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** School Wheelchair */
    // autogenerated using string template disenumpart2.txt
    SCHOOL_WHEELCHAIR (13, "School Wheelchair"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Tour */
    // autogenerated using string template disenumpart2.txt
    TOUR (14, "Tour"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Tram Parking Lot */
    // autogenerated using string template disenumpart2.txt
    TRAM_PARKING_LOT (15, "Tram Parking Lot"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Trolley */
    // autogenerated using string template disenumpart2.txt
    TROLLEY (16, "Trolley"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Airport Transport */
    // autogenerated using string template disenumpart2.txt
    AIRPORT_TRANSPORT (17, "Airport Transport"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Articulated (Multi-Unit) */
    // autogenerated using string template disenumpart2.txt
    ARTICULATED_MULTI_UNIT (18, "Articulated (Multi-Unit)"),;

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    PlatformLandBusSubcategories(int value, String description)
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
    public static PlatformLandBusSubcategories getEnumForValue(int value)
    {
       for (PlatformLandBusSubcategories nextEnum : PlatformLandBusSubcategories.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum PlatformLandBusSubcategories");
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
    public static PlatformLandBusSubcategories unmarshalEnum (DataInputStream dis) throws Exception
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
    public static PlatformLandBusSubcategories unmarshalEnum(ByteBuffer byteBuffer) throws Exception
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
