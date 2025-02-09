// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.kor.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>FF955Masan</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>FF955Masan.createInstance()</code> or <code>new FF955Masan()</code>. </p>
 * <ul>
 *     <li> Country: Korea (Republic of) (KOR) = <code>120</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate (FFG) = <code>6</code>; </li>
 *     <li> SubCategory: UlsanClass  = <code>1</code>; </li>
 *     <li> Specific: FF955Masan  = <code>4</code>; </li>
 *     <li> Entity type uid: 17643; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3a80515c. </p>
 * @see Country#KOREA_REPUBLIC_OF_KOR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigateFFG
 * @see SubCategory

 */
public final class FF955Masan extends EntityType
{
    /** Default constructor */
    public FF955Masan()
    {
        setCountry(Country.KOREA_REPUBLIC_OF_KOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 17638, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 17639, Ulsan Class
        setSpecific((byte)4); // uid 17643, FF 955 Masan
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static FF955Masan createInstance()
    {
            return new FF955Masan();
    }
}
