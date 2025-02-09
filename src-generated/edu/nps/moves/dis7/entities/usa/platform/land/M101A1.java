// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M101A1</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M101A1.createInstance()</code> or <code>new M101A1()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Towed artillery = <code>5</code>; </li>
 *     <li> SubCategory: M101105mmHowitzer  = <code>3</code>; </li>
 *     <li> Specific: M101A1  = <code>2</code>; </li>
 *     <li> Entity type uid: 10317; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@77c3c037. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Towedartillery
 * @see SubCategory

 */
public final class M101A1 extends EntityType
{
    /** Default constructor */
    public M101A1()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)5); // uid 10312, Towed artillery
        setSubCategory((byte)3); // uid 10315, M101 105-mm Howitzer
        setSpecific((byte)2); // uid 10317, M101A1
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M101A1 createInstance()
    {
            return new M101A1();
    }
}
