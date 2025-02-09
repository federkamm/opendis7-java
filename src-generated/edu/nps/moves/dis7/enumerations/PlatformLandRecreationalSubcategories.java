// autogenerated using string template disenumpart1withfootnote.txt

package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * This <code>enum</code> type is generated from XML,
 *  UID 437, marshal size 8;
 * PlatformLandRecreationalSubcategories has 15 enumerations total.
 * Subcategories for Land Platform Category 90
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum PlatformLandRecreationalSubcategories implements SubCategory
{

    // autogenerated using string template disenumfootnotecomment.txt

    /** Other */
    // autogenerated using string template disenumpart2.txt
    OTHER (0, "Other"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** ATV, 2X4 */
    // autogenerated using string template disenumpart2.txt
    ATV_2X4 (1, "ATV, 2X4"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** ATV, 4X4 */
    // autogenerated using string template disenumpart2.txt
    ATV_4X4 (2, "ATV, 4X4"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** ATV, 6X6 */
    // autogenerated using string template disenumpart2.txt
    ATV_6X6 (3, "ATV, 6X6"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** ATV, 3-wheeled */
    // autogenerated using string template disenumpart2.txt
    ATV_3_WHEELED (4, "ATV, 3-wheeled"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Toy, Other */
    // autogenerated using string template disenumpart2.txt
    TOY_OTHER (5, "Toy, Other"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Toy, Car */
    // autogenerated using string template disenumpart2.txt
    TOY_CAR (6, "Toy, Car"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Toy, ATV */
    // autogenerated using string template disenumpart2.txt
    TOY_ATV (7, "Toy, ATV"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Golf Cart */
    // autogenerated using string template disenumpart2.txt
    GOLF_CART (8, "Golf Cart"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Snowmobile */
    // autogenerated using string template disenumpart2.txt
    SNOWMOBILE (9, "Snowmobile"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Recreational Vehicle */
    // autogenerated using string template disenumpart2.txt
    RECREATIONAL_VEHICLE (10, "Recreational Vehicle"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Recreational Vehicle, Type A Motorhome */
    // autogenerated using string template disenumpart2.txt
    RECREATIONAL_VEHICLE_TYPE_A_MOTORHOME (11, "Recreational Vehicle, Type A Motorhome"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Recreational Vehicle, Type B Motorhome */
    // autogenerated using string template disenumpart2.txt
    RECREATIONAL_VEHICLE_TYPE_B_MOTORHOME (12, "Recreational Vehicle, Type B Motorhome"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Recreational Vehicle, Type C Motorhome */
    // autogenerated using string template disenumpart2.txt
    RECREATIONAL_VEHICLE_TYPE_C_MOTORHOME (13, "Recreational Vehicle, Type C Motorhome"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Conversion Van */
    // autogenerated using string template disenumpart2.txt
    CONVERSION_VAN (14, "Conversion Van"),;

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    PlatformLandRecreationalSubcategories(int value, String description)
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
    public static PlatformLandRecreationalSubcategories getEnumForValue(int value)
    {
       for (PlatformLandRecreationalSubcategories nextEnum : PlatformLandRecreationalSubcategories.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum PlatformLandRecreationalSubcategories");
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
    public static PlatformLandRecreationalSubcategories unmarshalEnum (DataInputStream dis) throws Exception
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
    public static PlatformLandRecreationalSubcategories unmarshalEnum(ByteBuffer byteBuffer) throws Exception
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
