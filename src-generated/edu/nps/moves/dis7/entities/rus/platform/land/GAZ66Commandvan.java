// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>GAZ66CommandVan</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>GAZ66CommandVan.createInstance()</code> or <code>new GAZ66CommandVan()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Wheeled Utility Vehicle = <code>7</code>; </li>
 *     <li> SubCategory: GAZ664x42000kgTruck  = <code>8</code>; </li>
 *     <li> Specific: GAZ66CommandVan  = <code>2</code>; </li>
 *     <li> Entity type uid: 12886; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@705f83a7. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeWheeledUtilityVehicle
 * @see SubCategory

 */
public final class GAZ66CommandVan extends EntityType
{
    /** Default constructor */
    public GAZ66CommandVan()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 12867, Large Wheeled Utility Vehicle
        setSubCategory((byte)8); // uid 12884, GAZ-66 4x4 2000-kg Truck
        setSpecific((byte)2); // uid 12886, GAZ-66 Command Van
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static GAZ66CommandVan createInstance()
    {
            return new GAZ66CommandVan();
    }
}
