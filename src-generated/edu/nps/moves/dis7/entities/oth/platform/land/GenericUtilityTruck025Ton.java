// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>GenericUtilityTruck025Ton</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>GenericUtilityTruck025Ton.createInstance()</code> or <code>new GenericUtilityTruck025Ton()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Single Unit Cargo Truck = <code>83</code>; </li>
 *     <li> SubCategory: GenericPickupTruckMini  = <code>1</code>; </li>
 *     <li> Specific: GenericUtilityTruck025Ton  = <code>1</code>; </li>
 *     <li> Entity type uid: 31581; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3bd55d8. </p>
 * @see Country#OTHER
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SingleUnitCargoTruck
 * @see SubCategory

 */
public final class GenericUtilityTruck025Ton extends EntityType
{
    /** Default constructor */
    public GenericUtilityTruck025Ton()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)83); // uid 24831, Single Unit Cargo Truck
        setSubCategory((byte)1); // uid 25817, Generic Pickup Truck, Mini
        setSpecific((byte)1); // uid 31581, Generic Utility Truck 0.25 Ton
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static GenericUtilityTruck025Ton createInstance()
    {
            return new GenericUtilityTruck025Ton();
    }
}
