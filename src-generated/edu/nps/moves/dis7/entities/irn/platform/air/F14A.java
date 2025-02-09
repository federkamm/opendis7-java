// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.irn.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>F14A</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>F14A.createInstance()</code> or <code>new F14A()</code>. </p>
 * <ul>
 *     <li> Country: Iran (Islamic Republic of) (IRN) = <code>101</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Fighter/Air Defense = <code>1</code>; </li>
 *     <li> SubCategory: GrummanF14Tomcat  = <code>1</code>; </li>
 *     <li> Specific: F14A  = <code>1</code>; </li>
 *     <li> Entity type uid: 30447; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@66b7550d. </p>
 * @see Country#IRAN_ISLAMIC_REPUBLIC_OF_IRN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FighterAirDefense
 * @see SubCategory

 */
public final class F14A extends EntityType
{
    /** Default constructor */
    public F14A()
    {
        setCountry(Country.IRAN_ISLAMIC_REPUBLIC_OF_IRN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 30445, Fighter/Air Defense
        setSubCategory((byte)1); // uid 30446, Grumman F-14 Tomcat
        setSpecific((byte)1); // uid 30447, F-14A
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static F14A createInstance()
    {
            return new F14A();
    }
}
