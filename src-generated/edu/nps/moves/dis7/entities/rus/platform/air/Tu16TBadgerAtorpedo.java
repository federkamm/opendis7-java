// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Tu16TBadgerAtorpedo</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Tu16TBadgerAtorpedo.createInstance()</code> or <code>new Tu16TBadgerAtorpedo()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Bomber = <code>3</code>; </li>
 *     <li> SubCategory: Tu16Badger  = <code>2</code>; </li>
 *     <li> Specific: Tu16TBadgerAtorpedo  = <code>3</code>; </li>
 *     <li> Entity type uid: 13314; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@418c020b. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Bomber
 * @see SubCategory

 */
public final class Tu16TBadgerAtorpedo extends EntityType
{
    /** Default constructor */
    public Tu16TBadgerAtorpedo()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)3); // uid 13309, Bomber
        setSubCategory((byte)2); // uid 13311, Tu-16 Badger
        setSpecific((byte)3); // uid 13314, Tu-16T Badger A, torpedo
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Tu16TBadgerAtorpedo createInstance()
    {
            return new Tu16TBadgerAtorpedo();
    }
}
