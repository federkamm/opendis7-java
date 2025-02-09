// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>S622Lapraya</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>S622Lapraya.createInstance()</code> or <code>new S622Lapraya()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SS (Conventional Attack-Torpedo, Patrol) (Sous-Marins Dattaque) = <code>5</code>; </li>
 *     <li> SubCategory: AgostaClass  = <code>1</code>; </li>
 *     <li> Specific: S622Lapraya  = <code>3</code>; </li>
 *     <li> Entity type uid: 16199; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1130520d. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSConventionalAttackTorpedoPatrolSousMarinsDattaque
 * @see SubCategory

 */
public final class S622Lapraya extends EntityType
{
    /** Default constructor */
    public S622Lapraya()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 16195, SS (Conventional Attack-Torpedo, Patrol) (Sous-Marins Dattaque)
        setSubCategory((byte)1); // uid 16196, Agosta Class
        setSpecific((byte)3); // uid 16199, S 622 La praya
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static S622Lapraya createInstance()
    {
            return new S622Lapraya();
    }
}
