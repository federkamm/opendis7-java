// autogenerated using string template disenumpart1withfootnote.txt

package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * This <code>enum</code> type is generated from XML,
 *  UID 430, marshal size 8;
 * PlatformLandSingleUnitCargoTruckSubcategories has 32 enumerations total.
 * Subcategories for Land Platform Category 83
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum PlatformLandSingleUnitCargoTruckSubcategories implements SubCategory
{

    // autogenerated using string template disenumfootnotecomment.txt

    /** Other */
    // autogenerated using string template disenumpart2.txt
    OTHER (0, "Other"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Pickup Truck, Mini */
    // autogenerated using string template disenumpart2.txt
    PICKUP_TRUCK_MINI (1, "Pickup Truck, Mini"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Pickup Truck, Mid-Size */
    // autogenerated using string template disenumpart2.txt
    PICKUP_TRUCK_MID_SIZE (2, "Pickup Truck, Mid-Size"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Pickup Truck, Full-Size */
    // autogenerated using string template disenumpart2.txt
    PICKUP_TRUCK_FULL_SIZE (3, "Pickup Truck, Full-Size"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Pickup Truck, Crew Cab */
    // autogenerated using string template disenumpart2.txt
    PICKUP_TRUCK_CREW_CAB (4, "Pickup Truck, Crew Cab"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Pickup Truck, Extended Cab */
    // autogenerated using string template disenumpart2.txt
    PICKUP_TRUCK_EXTENDED_CAB (5, "Pickup Truck, Extended Cab"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Pickup Truck, Long Bed */
    // autogenerated using string template disenumpart2.txt
    PICKUP_TRUCK_LONG_BED (6, "Pickup Truck, Long Bed"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Pickup Truck, Cab Forward */
    // autogenerated using string template disenumpart2.txt
    PICKUP_TRUCK_CAB_FORWARD (7, "Pickup Truck, Cab Forward"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Cargo Truck */
    // autogenerated using string template disenumpart2.txt
    CARGO_TRUCK (10, "Cargo Truck"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Cargo Truck, up to 2.5 Ton */
    // autogenerated using string template disenumpart2.txt
    CARGO_TRUCK_UP_TO_25_TON (11, "Cargo Truck, up to 2.5 Ton"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Cargo Truck, up to 5 Ton */
    // autogenerated using string template disenumpart2.txt
    CARGO_TRUCK_UP_TO_5_TON (12, "Cargo Truck, up to 5 Ton"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Cargo Truck, up to 7.5 Ton */
    // autogenerated using string template disenumpart2.txt
    CARGO_TRUCK_UP_TO_75_TON (13, "Cargo Truck, up to 7.5 Ton"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Cargo Truck, up to 10 Ton */
    // autogenerated using string template disenumpart2.txt
    CARGO_TRUCK_UP_TO_10_TON (14, "Cargo Truck, up to 10 Ton"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Cargo Truck, over 10 Ton */
    // autogenerated using string template disenumpart2.txt
    CARGO_TRUCK_OVER_10_TON (15, "Cargo Truck, over 10 Ton"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Tanker */
    // autogenerated using string template disenumpart2.txt
    TANKER (20, "Tanker"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Semi-Trailer Cab (w/o Trailer) */
    // autogenerated using string template disenumpart2.txt
    SUPPLEMENTAL_EMISSION_ENTITY_STATE (30, "Semi-Trailer Cab (w/o Trailer)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Van */
    // autogenerated using string template disenumpart2.txt
    VAN (70, "Van"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Van, Extended */
    // autogenerated using string template disenumpart2.txt
    VAN_EXTENDED (71, "Van, Extended"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Van, Compact */
    // autogenerated using string template disenumpart2.txt
    VAN_COMPACT (72, "Van, Compact"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Van, Wheelchair */
    // autogenerated using string template disenumpart2.txt
    VAN_WHEELCHAIR (73, "Van, Wheelchair"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Van, Delivery */
    // autogenerated using string template disenumpart2.txt
    VAN_DELIVERY (74, "Van, Delivery"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Delivery Truck */
    // autogenerated using string template disenumpart2.txt
    DELIVERY_TRUCK (100, "Delivery Truck"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Delivery Truck, Box */
    // autogenerated using string template disenumpart2.txt
    DELIVERY_TRUCK_BOX (101, "Delivery Truck, Box"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Delivery Truck, Flatbed */
    // autogenerated using string template disenumpart2.txt
    DELIVERY_TRUCK_FLATBED (102, "Delivery Truck, Flatbed"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Delivery Truck, Stake Bed */
    // autogenerated using string template disenumpart2.txt
    DELIVERY_TRUCK_STAKE_BED (103, "Delivery Truck, Stake Bed"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Mess Truck */
    // autogenerated using string template disenumpart2.txt
    MESS_TRUCK (104, "Mess Truck"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Truck, Palletised Load System (PLS), https://en.wikipedia.org/wiki/Palletized_load_system */
    // autogenerated using string template disenumpart2.txt
    TRUCK_PALLETISED_LOAD_SYSTEM_PLS (105, "Truck, Palletised Load System (PLS)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Truck, Petroleum, Oil, and Lubricants (POL) Palletised Load System (PLS) */
    // autogenerated using string template disenumpart2.txt
    TRUCK_PETROLEUM_OIL_AND_LUBRICANTS_POL_PALLETISED_LOAD_SYSTEM_PLS (106, "Truck, Petroleum, Oil, and Lubricants (POL) Palletised Load System (PLS)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Truck, Petroleum, Oil, and Lubricants (POL), Surveillance */
    // autogenerated using string template disenumpart2.txt
    TRUCK_PETROLEUM_OIL_AND_LUBRICANTS_POL_SURVEILLANCE (107, "Truck, Petroleum, Oil, and Lubricants (POL), Surveillance"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Refrigerated Truck, Small */
    // autogenerated using string template disenumpart2.txt
    REFRIGERATED_TRUCK_SMALL (108, "Refrigerated Truck, Small"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Refrigerated Truck, Medium */
    // autogenerated using string template disenumpart2.txt
    REFRIGERATED_TRUCK_MEDIUM (109, "Refrigerated Truck, Medium"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Refrigerated Truck, Large */
    // autogenerated using string template disenumpart2.txt
    REFRIGERATED_TRUCK_LARGE (110, "Refrigerated Truck, Large"),;

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    PlatformLandSingleUnitCargoTruckSubcategories(int value, String description)
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
    public static PlatformLandSingleUnitCargoTruckSubcategories getEnumForValue(int value)
    {
       for (PlatformLandSingleUnitCargoTruckSubcategories nextEnum : PlatformLandSingleUnitCargoTruckSubcategories.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum PlatformLandSingleUnitCargoTruckSubcategories");
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
    public static PlatformLandSingleUnitCargoTruckSubcategories unmarshalEnum (DataInputStream dis) throws Exception
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
    public static PlatformLandSingleUnitCargoTruckSubcategories unmarshalEnum(ByteBuffer byteBuffer) throws Exception
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
