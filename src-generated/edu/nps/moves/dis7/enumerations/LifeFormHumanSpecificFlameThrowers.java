// autogenerated using string template disenumpart1.txt

package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * This <code>enum</code> type is generated from XML,
 *  UID 523,
 * marshal size 8;
 * LifeFormHumanSpecificFlameThrowers has 15 enumerations total.
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum LifeFormHumanSpecificFlameThrowers 
{
    // autogenerated using string template disenumfootnotecomment.txt

    /** Other */
    // autogenerated using string template disenumpart2.txt
    OTHER (0, "Other"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Handflammpatrone */
    // autogenerated using string template disenumpart2.txt
    HANDFLAMMPATRONE (10, "Handflammpatrone"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** FmW 41 */
    // autogenerated using string template disenumpart2.txt
    FMW_41 (11, "FmW 41"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** M1A1 */
    // autogenerated using string template disenumpart2.txt
    M1A1 (20, "M1A1"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** M2A1-7 */
    // autogenerated using string template disenumpart2.txt
    M2A1_7 (21, "M2A1-7"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** M9A1-7 */
    // autogenerated using string template disenumpart2.txt
    M9A1_7 (22, "M9A1-7"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** LPO-50 */
    // autogenerated using string template disenumpart2.txt
    SUPPLEMENTAL_EMISSION_ENTITY_STATE (30, "LPO-50"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** K Pattern */
    // autogenerated using string template disenumpart2.txt
    K_PATTERN (35, "K Pattern"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Portable, No 2 Ack Pack */
    // autogenerated using string template disenumpart2.txt
    PORTABLE_NO_2_ACK_PACK (36, "Portable, No 2 Ack Pack"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Marsden */
    // autogenerated using string template disenumpart2.txt
    MARSDEN (37, "Marsden"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Harvey */
    // autogenerated using string template disenumpart2.txt
    HARVEY (38, "Harvey"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** ROKS-2 */
    // autogenerated using string template disenumpart2.txt
    ROKS_2 (45, "ROKS-2"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** ROKS-3 */
    // autogenerated using string template disenumpart2.txt
    TIME_SPACE_POSITION_INFORMATION (46, "ROKS-3"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Type-93 */
    // autogenerated using string template disenumpart2.txt
    LIVE_ENTITY_DETONATION (50, "Type-93"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Type-100 */
    // autogenerated using string template disenumpart2.txt
    CREATE_ENTITY_RELIABLE (51, "Type-100"),;

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    LifeFormHumanSpecificFlameThrowers(int value, String description)
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
    public static LifeFormHumanSpecificFlameThrowers getEnumForValue(int value)
    {
       for (LifeFormHumanSpecificFlameThrowers nextEnum : LifeFormHumanSpecificFlameThrowers.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum LifeFormHumanSpecificFlameThrowers");
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
    public static LifeFormHumanSpecificFlameThrowers unmarshalEnum (DataInputStream dis) throws Exception
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
    public static LifeFormHumanSpecificFlameThrowers unmarshalEnum(ByteBuffer byteBuffer) throws Exception
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
