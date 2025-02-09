// autogenerated using string template disenumpart1.txt

package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * This <code>enum</code> type is generated from XML,
 *  UID 9,
 * marshal size 8;
 * PlatformLandCategory has 56 enumerations total.
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum PlatformLandCategory implements Category
{
    // autogenerated using string template disenumfootnotecomment.txt

    /** Other */
    // autogenerated using string template disenumpart2.txt
    OTHER (0, "Other"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Tank */
    // autogenerated using string template disenumpart2.txt
    TANK (1, "Tank"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Armored Fighting Vehicle, FV, APC, SP mortars, armored cars, chemical reconnaissance, Anti-Tank guided missile launchers, etc. */
    // autogenerated using string template disenumpart2.txt
    ARMORED_FIGHTING_VEHICLE (2, "Armored Fighting Vehicle"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Armored Utility Vehicle, Engineering vehicle, tracked load carriers, towing vehicles, recovery vehicles, AVLB, etc. */
    // autogenerated using string template disenumpart2.txt
    ARMORED_UTILITY_VEHICLE (3, "Armored Utility Vehicle"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Self-Propelled Artillery */
    // autogenerated using string template disenumpart2.txt
    SELF_PROPELLED_ARTILLERY (4, "Self-Propelled Artillery"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Towed Artillery, Anti-Tank guns, guns and howitzers */
    // autogenerated using string template disenumpart2.txt
    TOWED_ARTILLERY (5, "Towed Artillery"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Small Wheeled Utility Vehicle, 0-1.25 tons */
    // autogenerated using string template disenumpart2.txt
    SMALL_WHEELED_UTILITY_VEHICLE (6, "Small Wheeled Utility Vehicle"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Large Wheeled Utility Vehicle, Greater than 1.25 tons */
    // autogenerated using string template disenumpart2.txt
    LARGE_WHEELED_UTILITY_VEHICLE (7, "Large Wheeled Utility Vehicle"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Small Tracked Utility Vehicle, 0-4999 kg weight load */
    // autogenerated using string template disenumpart2.txt
    SMALL_TRACKED_UTILITY_VEHICLE (8, "Small Tracked Utility Vehicle"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Large Tracked Utility Vehicle, Greater than 4999 kg weight load */
    // autogenerated using string template disenumpart2.txt
    LARGE_TRACKED_UTILITY_VEHICLE (9, "Large Tracked Utility Vehicle"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Mortar */
    // autogenerated using string template disenumpart2.txt
    MORTAR (10, "Mortar"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Mine Plow */
    // autogenerated using string template disenumpart2.txt
    MINE_PLOW (11, "Mine Plow"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Mine Rake */
    // autogenerated using string template disenumpart2.txt
    MINE_RAKE (12, "Mine Rake"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Mine Roller */
    // autogenerated using string template disenumpart2.txt
    MINE_ROLLER (13, "Mine Roller"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Cargo Trailer */
    // autogenerated using string template disenumpart2.txt
    CARGO_TRAILER (14, "Cargo Trailer"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Fuel Trailer */
    // autogenerated using string template disenumpart2.txt
    FUEL_TRAILER (15, "Fuel Trailer"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Generator Trailer */
    // autogenerated using string template disenumpart2.txt
    GENERATOR_TRAILER (16, "Generator Trailer"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Water Trailer */
    // autogenerated using string template disenumpart2.txt
    WATER_TRAILER (17, "Water Trailer"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Engineer Equipment */
    // autogenerated using string template disenumpart2.txt
    ENGINEER_EQUIPMENT (18, "Engineer Equipment"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Heavy Equipment Transport Trailer */
    // autogenerated using string template disenumpart2.txt
    HEAVY_EQUIPMENT_TRANSPORT_TRAILER (19, "Heavy Equipment Transport Trailer"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Maintenance Equipment Trailer */
    // autogenerated using string template disenumpart2.txt
    MAINTENANCE_EQUIPMENT_TRAILER (20, "Maintenance Equipment Trailer"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Limber */
    // autogenerated using string template disenumpart2.txt
    LIMBER (21, "Limber"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Chemical Decontamination Trailer */
    // autogenerated using string template disenumpart2.txt
    CHEMICAL_DECONTAMINATION_TRAILER (22, "Chemical Decontamination Trailer"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Warning System */
    // autogenerated using string template disenumpart2.txt
    WARNING_SYSTEM (23, "Warning System"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Train - Engine */
    // autogenerated using string template disenumpart2.txt
    TRAIN_ENGINE (24, "Train - Engine"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Train - Car */
    // autogenerated using string template disenumpart2.txt
    TRAIN_CAR (25, "Train - Car"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Train - Caboose */
    // autogenerated using string template disenumpart2.txt
    TRAIN_CABOOSE (26, "Train - Caboose"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Civilian Vehicle, Civilian land vehicles were moved to a group of Category values starting at 80 */
    // autogenerated using string template disenumpart2.txt
    CIVILIAN_VEHICLE (27, "Civilian Vehicle"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Air Defense / Missile Defense Unit Equipment */
    // autogenerated using string template disenumpart2.txt
    IDENTIFICATION_FRIEND_OR_FOE (28, "Air Defense / Missile Defense Unit Equipment"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Command, Control, Communications, and Intelligence (C3I) System */
    // autogenerated using string template disenumpart2.txt
    COMMAND_CONTROL_COMMUNICATIONS_AND_INTELLIGENCE_C3I_SYSTEM (29, "Command, Control, Communications, and Intelligence (C3I) System"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Operations Facility */
    // autogenerated using string template disenumpart2.txt
    SUPPLEMENTAL_EMISSION_ENTITY_STATE (30, "Operations Facility"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Intelligence Facility */
    // autogenerated using string template disenumpart2.txt
    INTELLIGENCE_FACILITY (31, "Intelligence Facility"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Surveillance Facility */
    // autogenerated using string template disenumpart2.txt
    SURVEILLANCE_FACILITY (32, "Surveillance Facility"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Communications Facility */
    // autogenerated using string template disenumpart2.txt
    COMMUNICATIONS_FACILITY (33, "Communications Facility"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Command Facility */
    // autogenerated using string template disenumpart2.txt
    COMMAND_FACILITY (34, "Command Facility"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** C4I Facility */
    // autogenerated using string template disenumpart2.txt
    C4I_FACILITY (35, "C4I Facility"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Control Facility */
    // autogenerated using string template disenumpart2.txt
    CONTROL_FACILITY (36, "Control Facility"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Fire Control Facility */
    // autogenerated using string template disenumpart2.txt
    FIRE_CONTROL_FACILITY (37, "Fire Control Facility"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Missile Defense Facility */
    // autogenerated using string template disenumpart2.txt
    MISSILE_DEFENSE_FACILITY (38, "Missile Defense Facility"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Field Command Post */
    // autogenerated using string template disenumpart2.txt
    FIELD_COMMAND_POST (39, "Field Command Post"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Observation Post */
    // autogenerated using string template disenumpart2.txt
    OBSERVATION_POST (40, "Observation Post"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Unmanned */
    // autogenerated using string template disenumpart2.txt
    LIVE_ENTITY_DETONATION (50, "Unmanned"),
    // autogenerated using string template disdictenumcomment.txt

    /** PlatformLandMotorcycleSubcategories */    // autogenerated using string template disenumpart21.txt
    MOTORCYCLE_2 (80, "Motorcycle"),
    // autogenerated using string template disdictenumcomment.txt

    /** PlatformLandCarSubcategories */    // autogenerated using string template disenumpart21.txt
    CAR_2 (81, "Car"),
    // autogenerated using string template disdictenumcomment.txt

    /** PlatformLandBusSubcategories */    // autogenerated using string template disenumpart21.txt
    BUS_2 (82, "Bus"),
    // autogenerated using string template disdictenumcomment.txt

    /** PlatformLandSingleUnitCargoTruckSubcategories */    // autogenerated using string template disenumpart21.txt
    SINGLE_UNIT_CARGO_TRUCK_2 (83, "Single Unit Cargo Truck"),
    // autogenerated using string template disdictenumcomment.txt

    /** PlatformLandSingleUnitUtilityEmergencyTruckSubcategories */    // autogenerated using string template disenumpart21.txt
    SINGLE_UNIT_UTILITY_EMERGENCY_TRUCK_2 (84, "Single Unit Utility/Emergency Truck"),
    // autogenerated using string template disdictenumcomment.txt

    /** PlatformLandMultipleUnitCargoTruckSubcategories */    // autogenerated using string template disenumpart21.txt
    MULTIPLE_UNIT_CARGO_TRUCK_2 (85, "Multiple Unit Cargo Truck"),
    // autogenerated using string template disdictenumcomment.txt

    /** PlatformLandMultipleUnitUtilityEmergencyTruckSubcategories */    // autogenerated using string template disenumpart21.txt
    MULTIPLE_UNIT_UTILITY_EMERGENCY_TRUCK_2 (86, "Multiple Unit Utility/Emergency Truck"),
    // autogenerated using string template disdictenumcomment.txt

    /** PlatformLandConstructionSpecialtyVehicleSubcategories */    // autogenerated using string template disenumpart21.txt
    CONSTRUCTION_SPECIALTY_VEHICLE_2 (87, "Construction Specialty Vehicle"),
    // autogenerated using string template disdictenumcomment.txt

    /** PlatformLandFarmSpecialtyVehicleSubcategories */    // autogenerated using string template disenumpart21.txt
    FARM_SPECIALTY_VEHICLE_2 (88, "Farm Specialty Vehicle"),
    // autogenerated using string template disdictenumcomment.txt

    /** PlatformLandTrailerSubcategories */    // autogenerated using string template disenumpart21.txt
    TRAILER_2 (89, "Trailer"),
    // autogenerated using string template disdictenumcomment.txt

    /** PlatformLandRecreationalSubcategories */    // autogenerated using string template disenumpart21.txt
    RECREATIONAL_2 (90, "Recreational"),
    // autogenerated using string template disdictenumcomment.txt

    /** PlatformLandNonmotorizedSubcategories */    // autogenerated using string template disenumpart21.txt
    NON_MOTORIZED_2 (91, "Non-motorized"),
    // autogenerated using string template disdictenumcomment.txt

    /** PlatformLandTrainsSubcategories */    // autogenerated using string template disenumpart21.txt
    TRAINS_2 (92, "Trains"),
    // autogenerated using string template disdictenumcomment.txt

    /** PlatformLandUtilityEmergencyCarSubcategories */    // autogenerated using string template disenumpart21.txt
    UTILITY_EMERGENCY_CAR_2 (93, "Utility/Emergency Car"),;

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    PlatformLandCategory(int value, String description)
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
    public static PlatformLandCategory getEnumForValue(int value)
    {
       for (PlatformLandCategory nextEnum : PlatformLandCategory.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum PlatformLandCategory");
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
    public static PlatformLandCategory unmarshalEnum (DataInputStream dis) throws Exception
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
    public static PlatformLandCategory unmarshalEnum(ByteBuffer byteBuffer) throws Exception
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
