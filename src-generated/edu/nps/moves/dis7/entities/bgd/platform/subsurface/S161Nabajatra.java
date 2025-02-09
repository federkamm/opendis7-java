// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.bgd.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>S161Nabajatra</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>S161Nabajatra.createInstance()</code> or <code>new S161Nabajatra()</code>. </p>
 * <ul>
 *     <li> Country: Bangladesh (BGD) = <code>18</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SS (Conventional Attack - Torpedo, Patrol) = <code>5</code>; </li>
 *     <li> SubCategory: MingClassType035  = <code>1</code>; </li>
 *     <li> Specific: S161Nabajatra  = <code>1</code>; </li>
 *     <li> Entity type uid: 32633; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@68c4039c. </p>
 * @see Country#BANGLADESH_BGD
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSConventionalAttackTorpedoPatrol
 * @see SubCategory

 */
public final class S161Nabajatra extends EntityType
{
    /** Default constructor */
    public S161Nabajatra()
    {
        setCountry(Country.BANGLADESH_BGD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 32631, SS (Conventional Attack - Torpedo, Patrol)
        setSubCategory((byte)1); // uid 32632, Ming Class (Type 035)
        setSpecific((byte)1); // uid 32633, S161 Nabajatra
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static S161Nabajatra createInstance()
    {
            return new S161Nabajatra();
    }
}
