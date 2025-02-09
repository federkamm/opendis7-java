// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>S618LeVigilant</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>S618LeVigilant.createInstance()</code> or <code>new S618LeVigilant()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SSBN (Nuclear Ballistic Missile) = <code>1</code>; </li>
 *     <li> SubCategory: LeTriomphantclassSNLENG  = <code>1</code>; </li>
 *     <li> Specific: S618LeVigilant  = <code>3</code>; </li>
 *     <li> Entity type uid: 16178; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6f1c29b7. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSBNNuclearBallisticMissile
 * @see SubCategory

 */
public final class S618LeVigilant extends EntityType
{
    /** Default constructor */
    public S618LeVigilant()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)1); // uid 16174, SSBN (Nuclear Ballistic Missile)
        setSubCategory((byte)1); // uid 16175, Le Triomphant class (SNLE-NG)
        setSpecific((byte)3); // uid 16178, S 618 Le Vigilant
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static S618LeVigilant createInstance()
    {
            return new S618LeVigilant();
    }
}
