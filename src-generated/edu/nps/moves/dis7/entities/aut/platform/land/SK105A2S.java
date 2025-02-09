// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aut.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SK105A2S</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SK105A2S.createInstance()</code> or <code>new SK105A2S()</code>. </p>
 * <ul>
 *     <li> Country: Austria (AUT) = <code>14</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Tank = <code>1</code>; </li>
 *     <li> SubCategory: SK105Kurassier  = <code>1</code>; </li>
 *     <li> Specific: SK105A2S  = <code>1</code>; </li>
 *     <li> Entity type uid: 31908; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@48eff760. </p>
 * @see Country#AUSTRIA_AUT
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Tank
 * @see SubCategory

 */
public final class SK105A2S extends EntityType
{
    /** Default constructor */
    public SK105A2S()
    {
        setCountry(Country.AUSTRIA_AUT);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)1); // uid 31906, Tank
        setSubCategory((byte)1); // uid 31907, SK-105 Kurassier
        setSpecific((byte)1); // uid 31908, SK-105 A2S
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SK105A2S createInstance()
    {
            return new SK105A2S();
    }
}
