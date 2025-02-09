// autogenerated using string template disenumpart1withfootnote.txt

package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * This <code>enum</code> type is generated from XML,
 *  UID 106, marshal size 8;
 * SubcategoriesforLandCategory206Marsupial has 12 enumerations total.
 * 1-99 Ameridelphia, 100-250 Australidelphia
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum SubcategoriesforLandCategory206Marsupial 
{

    // autogenerated using string template disenumfootnotecomment.txt

    /** Brown Four-Eyed Opossum, 1-89 Opossum */
    // autogenerated using string template disenumpart2.txt
    BROWN_FOUR_EYED_OPOSSUM (1, "Brown Four-Eyed Opossum"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Bushy-Tailed Opossum */
    // autogenerated using string template disenumpart2.txt
    BUSHY_TAILED_OPOSSUM (2, "Bushy-Tailed Opossum"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Tates Shrew Opossum, 90-99 Shrew Opossum */
    // autogenerated using string template disenumpart2.txt
    TATES_SHREW_OPOSSUM (90, "Tates Shrew Opossum"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Greater Bilby, 100-109 Bandicoots and Bilbies */
    // autogenerated using string template disenumpart2.txt
    GREATER_BILBY (100, "Greater Bilby"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Tasmanian Devil, 110-149 Carnivorous Marsupials */
    // autogenerated using string template disenumpart2.txt
    TASMANIAN_DEVIL (110, "Tasmanian Devil"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Brush-Tailed Rock-Wallaby, 150-199 Wallabies, Wallaroos and Kangaroos */
    // autogenerated using string template disenumpart2.txt
    BRUSH_TAILED_ROCK_WALLABY (150, "Brush-Tailed Rock-Wallaby"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Eastern Wallaroo */
    // autogenerated using string template disenumpart2.txt
    EASTERN_WALLAROO (160, "Eastern Wallaroo"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Red Kangaroo */
    // autogenerated using string template disenumpart2.txt
    RED_KANGAROO (170, "Red Kangaroo"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Queensland Koala, 200-204 Koalas */
    // autogenerated using string template disenumpart2.txt
    QUEENSLAND_KOALA (200, "Queensland Koala"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Southern Hairy-Nosed Wombat, 205-209 Wombats */
    // autogenerated using string template disenumpart2.txt
    SOUTHERN_HAIRY_NOSED_WOMBAT (205, "Southern Hairy-Nosed Wombat"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Brushtail Possum, 210-249 Possums, Gliders, and Cuscus */
    // autogenerated using string template disenumpart2.txt
    BRUSHTAIL_POSSUM (210, "Brushtail Possum"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Sugar Glider */
    // autogenerated using string template disenumpart2.txt
    SUGAR_GLIDER (211, "Sugar Glider"),;

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    SubcategoriesforLandCategory206Marsupial(int value, String description)
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
    public static SubcategoriesforLandCategory206Marsupial getEnumForValue(int value)
    {
       for (SubcategoriesforLandCategory206Marsupial nextEnum : SubcategoriesforLandCategory206Marsupial.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum SubcategoriesforLandCategory206Marsupial");
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
    public static SubcategoriesforLandCategory206Marsupial unmarshalEnum (DataInputStream dis) throws Exception
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
    public static SubcategoriesforLandCategory206Marsupial unmarshalEnum(ByteBuffer byteBuffer) throws Exception
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
