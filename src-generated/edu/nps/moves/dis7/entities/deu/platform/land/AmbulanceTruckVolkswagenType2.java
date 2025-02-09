// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AmbulanceTruckVolkswagenType2</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AmbulanceTruckVolkswagenType2.createInstance()</code> or <code>new AmbulanceTruckVolkswagenType2()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Single Unit Utility/Emergency Truck = <code>84</code>; </li>
 *     <li> SubCategory: AmbulanceTruck  = <code>1</code>; </li>
 *     <li> Specific: AmbulanceTruckVolkswagenType2  = <code>1</code>; </li>
 *     <li> Entity type uid: 24847; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@479ceda0. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SingleUnitUtilityEmergencyTruck
 * @see SubCategory

 */
public final class AmbulanceTruckVolkswagenType2 extends EntityType
{
    /** Default constructor */
    public AmbulanceTruckVolkswagenType2()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)84); // uid 24845, Single Unit Utility/Emergency Truck
        setSubCategory((byte)1); // uid 24846, Ambulance Truck
        setSpecific((byte)1); // uid 24847, Ambulance Truck, Volkswagen Type 2
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AmbulanceTruckVolkswagenType2 createInstance()
    {
            return new AmbulanceTruckVolkswagenType2();
    }
}
