// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Vodaclasswatercarriers24</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Vodaclasswatercarriers24.createInstance()</code> or <code>new Vodaclasswatercarriers24()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Utility = <code>18</code>; </li>
 *     <li> SubCategory: Vodaclasswatercarriers  = <code>2</code>; </li>
 *     <li> Specific: _24  = <code>11</code>; </li>
 *     <li> Entity type uid: 14585; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5ec4ff02. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Utility
 * @see SubCategory

 */
public final class Vodaclasswatercarriers24 extends EntityType
{
    /** Default constructor */
    public Vodaclasswatercarriers24()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)18); // uid 14570, Utility
        setSubCategory((byte)2); // uid 14574, Voda class (water carriers)
        setSpecific((byte)11); // uid 14585, 24
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Vodaclasswatercarriers24 createInstance()
    {
            return new Vodaclasswatercarriers24();
    }
}
