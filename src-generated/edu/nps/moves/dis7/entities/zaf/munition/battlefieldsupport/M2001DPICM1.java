// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.zaf.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M2001DPICM1</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M2001DPICM1.createInstance()</code> or <code>new M2001DPICM1()</code>. </p>
 * <ul>
 *     <li> Country: South Africa (ZAF) = <code>197</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>BATTLEFIELD_SUPPORT</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _155mm  = <code>1</code>; </li>
 *     <li> Specific: DenelAssistedwithBaseBleed155mm  = <code>2</code>; </li>
 *     <li> Entity type uid: 26983; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@2dd3d39d. </p>
 * @see Country#SOUTH_AFRICA_ZAF
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class M2001DPICM1 extends EntityType
{
    /** Default constructor */
    public M2001DPICM1()
    {
        setCountry(Country.SOUTH_AFRICA_ZAF);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 26972, Ballistic
        setSubCategory((byte)1); // uid 26973, 155mm
        setSpecific((byte)2); // uid 26981, Denel, Assisted with Base Bleed, 155mm
        setExtra((byte)2); // uid 26983, M2001 DPICM
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M2001DPICM1 createInstance()
    {
            return new M2001DPICM1();
    }
}
