// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>GenericPolicePickupTruck</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>GenericPolicePickupTruck.createInstance()</code> or <code>new GenericPolicePickupTruck()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Single Unit Utility/Emergency Truck = <code>84</code>; </li>
 *     <li> SubCategory: GenericPolicePickupTruck  = <code>23</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 25849; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6e78fcf5. </p>
 * @see Country#OTHER
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SingleUnitUtilityEmergencyTruck
 * @see SubCategory

 */
public final class GenericPolicePickupTruck extends EntityType
{
    /** Default constructor */
    public GenericPolicePickupTruck()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)84); // uid 25837, Single Unit Utility/Emergency Truck
        setSubCategory((byte)23); // uid 25849, Generic Police, Pickup Truck
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static GenericPolicePickupTruck createInstance()
    {
            return new GenericPolicePickupTruck();
    }
}
