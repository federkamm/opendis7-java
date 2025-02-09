// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ind.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>A50EI</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>A50EI.createInstance()</code> or <code>new A50EI()</code>. </p>
 * <ul>
 *     <li> Country: India (IND) = <code>99</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Surveillance/C2 (Airborne Early Warning) = <code>8</code>; </li>
 *     <li> SubCategory: BerievA50Mainstay  = <code>1</code>; </li>
 *     <li> Specific: A50EI  = <code>1</code>; </li>
 *     <li> Entity type uid: 30219; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@48d5f34e. </p>
 * @see Country#INDIA_IND
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SurveillanceC2AirborneEarlyWarning
 * @see SubCategory

 */
public final class A50EI extends EntityType
{
    /** Default constructor */
    public A50EI()
    {
        setCountry(Country.INDIA_IND);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)8); // uid 30217, Surveillance/C2 (Airborne Early Warning)
        setSubCategory((byte)1); // uid 30218, Beriev A-50 Mainstay
        setSpecific((byte)1); // uid 30219, A-50E/I
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static A50EI createInstance()
    {
            return new A50EI();
    }
}
