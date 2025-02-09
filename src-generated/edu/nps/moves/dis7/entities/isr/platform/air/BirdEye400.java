// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.isr.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>BirdEye400</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>BirdEye400.createInstance()</code> or <code>new BirdEye400()</code>. </p>
 * <ul>
 *     <li> Country: Israel (ISR) = <code>105</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Unmanned = <code>50</code>; </li>
 *     <li> SubCategory: IAIBirdEyeUAVFamily  = <code>8</code>; </li>
 *     <li> Specific: BirdEye400  = <code>2</code>; </li>
 *     <li> Entity type uid: 31782; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@62dae540. </p>
 * @see Country#ISRAEL_ISR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Unmanned
 * @see SubCategory

 */
public final class BirdEye400 extends EntityType
{
    /** Default constructor */
    public BirdEye400()
    {
        setCountry(Country.ISRAEL_ISR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)50); // uid 23487, Unmanned
        setSubCategory((byte)8); // uid 31780, IAI Bird Eye UAV Family
        setSpecific((byte)2); // uid 31782, Bird Eye 400
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static BirdEye400 createInstance()
    {
            return new BirdEye400();
    }
}
