// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.twn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>FFG1202KangDing</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>FFG1202KangDing.createInstance()</code> or <code>new FFG1202KangDing()</code>. </p>
 * <ul>
 *     <li> Country: Taiwan, Province of China (TWN) = <code>208</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate (FFG) = <code>6</code>; </li>
 *     <li> SubCategory: KangDingLaFayetteClass  = <code>2</code>; </li>
 *     <li> Specific: FFG1202KangDing  = <code>1</code>; </li>
 *     <li> Entity type uid: 19150; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7d7cac8. </p>
 * @see Country#TAIWAN_PROVINCE_OF_CHINA_TWN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigateFFG
 * @see SubCategory

 */
public final class FFG1202KangDing extends EntityType
{
    /** Default constructor */
    public FFG1202KangDing()
    {
        setCountry(Country.TAIWAN_PROVINCE_OF_CHINA_TWN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 19140, Guided Missile Frigate (FFG)
        setSubCategory((byte)2); // uid 19149, Kang Ding (La Fayette) Class
        setSpecific((byte)1); // uid 19150, FFG 1202 Kang Ding
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static FFG1202KangDing createInstance()
    {
            return new FFG1202KangDing();
    }
}
