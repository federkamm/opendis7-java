// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.bra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>G25AlmiranteSaboia</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>G25AlmiranteSaboia.createInstance()</code> or <code>new G25AlmiranteSaboia()</code>. </p>
 * <ul>
 *     <li> Country: Brazil (BRA) = <code>29</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Amphibious Cargo Ship = <code>55</code>; </li>
 *     <li> SubCategory: RoundTableClass  = <code>1</code>; </li>
 *     <li> Specific: G25AlmiranteSaboia  = <code>1</code>; </li>
 *     <li> Entity type uid: 32640; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6c3708b3. </p>
 * @see Country#BRAZIL_BRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AmphibiousCargoShip
 * @see SubCategory

 */
public final class G25AlmiranteSaboia extends EntityType
{
    /** Default constructor */
    public G25AlmiranteSaboia()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)55); // uid 32638, Amphibious Cargo Ship
        setSubCategory((byte)1); // uid 32639, Round Table Class
        setSpecific((byte)1); // uid 32640, G25 Almirante Saboia
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static G25AlmiranteSaboia createInstance()
    {
            return new G25AlmiranteSaboia();
    }
}
