// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.bra.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>S34Tikuna</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>S34Tikuna.createInstance()</code> or <code>new S34Tikuna()</code>. </p>
 * <ul>
 *     <li> Country: Brazil (BRA) = <code>29</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SS (Conventional Attack - Torpedo, Patrol) = <code>5</code>; </li>
 *     <li> SubCategory: TupiClass  = <code>2</code>; </li>
 *     <li> Specific: S34Tikuna  = <code>5</code>; </li>
 *     <li> Entity type uid: 32649; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4f970963. </p>
 * @see Country#BRAZIL_BRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSConventionalAttackTorpedoPatrol
 * @see SubCategory

 */
public final class S34Tikuna extends EntityType
{
    /** Default constructor */
    public S34Tikuna()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 32643, SS (Conventional Attack - Torpedo, Patrol)
        setSubCategory((byte)2); // uid 32644, Tupi Class
        setSpecific((byte)5); // uid 32649, S34 Tikuna
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static S34Tikuna createInstance()
    {
            return new S34Tikuna();
    }
}
