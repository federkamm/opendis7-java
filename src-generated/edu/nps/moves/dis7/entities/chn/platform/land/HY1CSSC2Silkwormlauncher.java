// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>HY1CSSC2Silkwormlauncher</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HY1CSSC2Silkwormlauncher.createInstance()</code> or <code>new HY1CSSC2Silkwormlauncher()</code>. </p>
 * <ul>
 *     <li> Country: China, Peoples Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Towed Artillery = <code>5</code>; </li>
 *     <li> SubCategory: HYseriesASCMlauncher  = <code>16</code>; </li>
 *     <li> Specific: HY1CSSC2Silkwormlauncher  = <code>1</code>; </li>
 *     <li> Entity type uid: 16923; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@29ba4338. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see TowedArtillery
 * @see SubCategory

 */
public final class HY1CSSC2Silkwormlauncher extends EntityType
{
    /** Default constructor */
    public HY1CSSC2Silkwormlauncher()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)5); // uid 16904, Towed Artillery
        setSubCategory((byte)16); // uid 16922, HY-series ASCM launcher
        setSpecific((byte)1); // uid 16923, HY-1/CSSC-2 Silkworm launcher
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HY1CSSC2Silkwormlauncher createInstance()
    {
            return new HY1CSSC2Silkwormlauncher();
    }
}
