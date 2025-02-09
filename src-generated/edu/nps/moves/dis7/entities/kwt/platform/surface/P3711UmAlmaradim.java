// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.kwt.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>P3711UmAlmaradim</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>P3711UmAlmaradim.createInstance()</code> or <code>new P3711UmAlmaradim()</code>. </p>
 * <ul>
 *     <li> Country: Kuwait (KWT) = <code>121</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: UMAlmaradimClassPCFG  = <code>7</code>; </li>
 *     <li> Specific: P3711UmAlmaradim  = <code>1</code>; </li>
 *     <li> Entity type uid: 17926; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6a1ebcff. </p>
 * @see Country#KUWAIT_KWT
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class P3711UmAlmaradim extends EntityType
{
    /** Default constructor */
    public P3711UmAlmaradim()
    {
        setCountry(Country.KUWAIT_KWT);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 17912, Light/Patrol Craft
        setSubCategory((byte)7); // uid 17925, UM Almaradim Class (PCFG)
        setSpecific((byte)1); // uid 17926, P3711 Um Almaradim
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static P3711UmAlmaradim createInstance()
    {
            return new P3711UmAlmaradim();
    }
}
