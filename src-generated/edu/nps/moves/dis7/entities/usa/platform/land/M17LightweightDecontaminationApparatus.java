// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M17LightweightDecontaminationApparatus</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M17LightweightDecontaminationApparatus.createInstance()</code> or <code>new M17LightweightDecontaminationApparatus()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Other = <code>0</code>; </li>
 *     <li> SubCategory: DecontaminationApparatus  = <code>7</code>; </li>
 *     <li> Specific: M17LightweightDecontaminationApparatus  = <code>1</code>; </li>
 *     <li> Entity type uid: 22822; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@787508ca. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Other
 * @see SubCategory

 */
public final class M17LightweightDecontaminationApparatus extends EntityType
{
    /** Default constructor */
    public M17LightweightDecontaminationApparatus()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)0); // uid 10001, Other
        setSubCategory((byte)7); // uid 22821, Decontamination Apparatus
        setSpecific((byte)1); // uid 22822, M17 Lightweight Decontamination Apparatus
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M17LightweightDecontaminationApparatus createInstance()
    {
            return new M17LightweightDecontaminationApparatus();
    }
}
