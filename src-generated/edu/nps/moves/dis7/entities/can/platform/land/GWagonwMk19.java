// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.can.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>GWagonwMk19</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>GWagonwMk19.createInstance()</code> or <code>new GWagonwMk19()</code>. </p>
 * <ul>
 *     <li> Country: Canada (CAN) = <code>39</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Small Wheeled Utility Vehicle = <code>6</code>; </li>
 *     <li> SubCategory: GWagon  = <code>2</code>; </li>
 *     <li> Specific: GWagonwMk19  = <code>4</code>; </li>
 *     <li> Entity type uid: 30986; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1786dec2. </p>
 * @see Country#CANADA_CAN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SmallWheeledUtilityVehicle
 * @see SubCategory

 */
public final class GWagonwMk19 extends EntityType
{
    /** Default constructor */
    public GWagonwMk19()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 23524, Small Wheeled Utility Vehicle
        setSubCategory((byte)2); // uid 30982, G Wagon
        setSpecific((byte)4); // uid 30986, G Wagon w/ Mk-19
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static GWagonwMk19 createInstance()
    {
            return new GWagonwMk19();
    }
}
