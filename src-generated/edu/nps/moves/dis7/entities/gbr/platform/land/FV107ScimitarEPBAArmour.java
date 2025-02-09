// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.gbr.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>FV107ScimitarEPBAArmour</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>FV107ScimitarEPBAArmour.createInstance()</code> or <code>new FV107ScimitarEPBAArmour()</code>. </p>
 * <ul>
 *     <li> Country: United Kingdom of Great Britain and Northern Ireland (GBR) = <code>224</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Armored Fighting Vehicle = <code>2</code>; </li>
 *     <li> SubCategory: FV107Scimitar  = <code>4</code>; </li>
 *     <li> Specific: FV107ScimitarEPBAArmour  = <code>1</code>; </li>
 *     <li> Entity type uid: 32335; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2ddb3ae8. </p>
 * @see Country#UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ArmoredFightingVehicle
 * @see SubCategory

 */
public final class FV107ScimitarEPBAArmour extends EntityType
{
    /** Default constructor */
    public FV107ScimitarEPBAArmour()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 14887, Armored Fighting Vehicle
        setSubCategory((byte)4); // uid 14893, FV 107 Scimitar
        setSpecific((byte)1); // uid 32335, FV 107 Scimitar EPBA Armour
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static FV107ScimitarEPBAArmour createInstance()
    {
            return new FV107ScimitarEPBAArmour();
    }
}
