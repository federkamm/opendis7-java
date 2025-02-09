// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.idn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_332IGustiNgurahRai</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_332IGustiNgurahRai.createInstance()</code> or <code>new _332IGustiNgurahRai()</code>. </p>
 * <ul>
 *     <li> Country: Indonesia (IDN) = <code>100</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate (FFG) = <code>6</code>; </li>
 *     <li> SubCategory: MartadinataClassSIGMA10514  = <code>2</code>; </li>
 *     <li> Specific: _332IGustiNgurahRai  = <code>2</code>; </li>
 *     <li> Entity type uid: 30513; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2f4205be. </p>
 * @see Country#INDONESIA_IDN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigateFFG
 * @see SubCategory

 */
public final class _332IGustiNgurahRai extends EntityType
{
    /** Default constructor */
    public _332IGustiNgurahRai()
    {
        setCountry(Country.INDONESIA_IDN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 27393, Guided Missile Frigate (FFG)
        setSubCategory((byte)2); // uid 30511, Martadinata Class (SIGMA 10514)
        setSpecific((byte)2); // uid 30513, 332 I Gusti Ngurah Rai
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _332IGustiNgurahRai createInstance()
    {
            return new _332IGustiNgurahRai();
    }
}
