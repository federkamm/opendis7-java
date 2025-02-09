// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.dza.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_031ElOuarsenis</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_031ElOuarsenis.createInstance()</code> or <code>new _031ElOuarsenis()</code>. </p>
 * <ul>
 *     <li> Country: Algeria (DZA) = <code>3</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SS (Conventional Attack - Torpedo, Patrol) = <code>5</code>; </li>
 *     <li> SubCategory: KiloClass  = <code>1</code>; </li>
 *     <li> Specific: _031ElOuarsenis  = <code>5</code>; </li>
 *     <li> Entity type uid: 32591; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2d363fb3. </p>
 * @see Country#ALGERIA_DZA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSConventionalAttackTorpedoPatrol
 * @see SubCategory

 */
public final class _031ElOuarsenis extends EntityType
{
    /** Default constructor */
    public _031ElOuarsenis()
    {
        setCountry(Country.ALGERIA_DZA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 27035, SS (Conventional Attack - Torpedo, Patrol)
        setSubCategory((byte)1); // uid 27036, Kilo Class
        setSpecific((byte)5); // uid 32591, 031 El Ouarsenis
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _031ElOuarsenis createInstance()
    {
            return new _031ElOuarsenis();
    }
}
