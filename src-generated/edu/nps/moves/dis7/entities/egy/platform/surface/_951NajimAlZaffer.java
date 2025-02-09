// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.egy.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_951NajimAlZaffer</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_951NajimAlZaffer.createInstance()</code> or <code>new _951NajimAlZaffer()</code>. </p>
 * <ul>
 *     <li> Country: Egypt (EGY) = <code>62</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigates = <code>6</code>; </li>
 *     <li> SubCategory: JianghuIClassFFG  = <code>2</code>; </li>
 *     <li> Specific: _951NajimAlZaffer  = <code>1</code>; </li>
 *     <li> Entity type uid: 18803; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2f8dad04. </p>
 * @see Country#COMMENT_RELIABLE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigates
 * @see SubCategory

 */
public final class _951NajimAlZaffer extends EntityType
{
    /** Default constructor */
    public _951NajimAlZaffer()
    {
        setCountry(Country.COMMENT_RELIABLE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 18799, Guided Missile Frigates
        setSubCategory((byte)2); // uid 18802, Jianghu I Class (FFG)
        setSpecific((byte)1); // uid 18803, 951 Najim Al Zaffer
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _951NajimAlZaffer createInstance()
    {
            return new _951NajimAlZaffer();
    }
}
