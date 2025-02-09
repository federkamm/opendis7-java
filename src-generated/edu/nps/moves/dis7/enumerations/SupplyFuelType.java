// autogenerated using string template disenumpart1withfootnote.txt

package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * This <code>enum</code> type is generated from XML,
 *  UID 413, marshal size 8;
 * SupplyFuelType has 11 enumerations total.
 * Specific values for Supply Subcategory Fuels (1).
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum SupplyFuelType 
{

    // autogenerated using string template disenumfootnotecomment.txt

    /** Other */
    // autogenerated using string template disenumpart2.txt
    OTHER (0, "Other"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Gasoline */
    // autogenerated using string template disenumpart2.txt
    GASOLINE (1, "Gasoline"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Diesel Fuel (F-54/DF-2) */
    // autogenerated using string template disenumpart2.txt
    DIESEL_FUEL_F_54_DF_2 (2, "Diesel Fuel (F-54/DF-2)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** JP-4 (F-40/JET B) */
    // autogenerated using string template disenumpart2.txt
    JP_4_F_40_JET_B (3, "JP-4 (F-40/JET B)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Fuel Oil */
    // autogenerated using string template disenumpart2.txt
    FUEL_OIL (4, "Fuel Oil"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** JP-8 (F-34/JET A-1) */
    // autogenerated using string template disenumpart2.txt
    JP_8_F_34_JET_A_1 (5, "JP-8 (F-34/JET A-1)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Fog Oil */
    // autogenerated using string template disenumpart2.txt
    FOG_OIL (6, "Fog Oil"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Multi-Spectral Fog Oil */
    // autogenerated using string template disenumpart2.txt
    MULTI_SPECTRAL_FOG_OIL (7, "Multi-Spectral Fog Oil"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** JP-5 (F-44/JET A) */
    // autogenerated using string template disenumpart2.txt
    JP_5_F_44_JET_A (8, "JP-5 (F-44/JET A)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** JPTS */
    // autogenerated using string template disenumpart2.txt
    JPTS (9, "JPTS"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** TS-1 (Russia (RUS)) */
    // autogenerated using string template disenumpart2.txt
    TS_1_RUSSIA_RUS (10, "TS-1 (Russia (RUS))"),;

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    SupplyFuelType(int value, String description)
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
    public static SupplyFuelType getEnumForValue(int value)
    {
       for (SupplyFuelType nextEnum : SupplyFuelType.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum SupplyFuelType");
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
    public static SupplyFuelType unmarshalEnum (DataInputStream dis) throws Exception
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
    public static SupplyFuelType unmarshalEnum(ByteBuffer byteBuffer) throws Exception
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
