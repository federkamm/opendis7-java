// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.dnk.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>LexaMaersk</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>LexaMaersk.createInstance()</code> or <code>new LexaMaersk()</code>. </p>
 * <ul>
 *     <li> Country: Denmark (DNK) = <code>57</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Dry Cargo Ship (Group 2 Merchant) = <code>81</code>; </li>
 *     <li> SubCategory: ContainerShip  = <code>3</code>; </li>
 *     <li> Specific: LexaMaersk  = <code>2</code>; </li>
 *     <li> Entity type uid: 32975; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3e6ef8ad. </p>
 * @see Country#ACTION_RESPONSE_RELIABLE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see DryCargoShipGroup2Merchant
 * @see SubCategory

 */
public final class LexaMaersk extends EntityType
{
    /** Default constructor */
    public LexaMaersk()
    {
        setCountry(Country.ACTION_RESPONSE_RELIABLE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)81); // uid 24565, Dry Cargo Ship (Group 2 Merchant)
        setSubCategory((byte)3); // uid 24566, Container Ship
        setSpecific((byte)2); // uid 32975, Lexa Maersk
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static LexaMaersk createInstance()
    {
            return new LexaMaersk();
    }
}
