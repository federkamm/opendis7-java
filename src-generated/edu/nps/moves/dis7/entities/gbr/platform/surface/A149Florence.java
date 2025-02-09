// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.gbr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>A149Florence</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>A149Florence.createInstance()</code> or <code>new A149Florence()</code>. </p>
 * <ul>
 *     <li> Country: United Kingdom of Great Britain and Northern Ireland (GBR) = <code>224</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary, Merchant Marine = <code>17</code>; </li>
 *     <li> SubCategory: Felicityclass  = <code>6</code>; </li>
 *     <li> Specific: A149Florence  = <code>4</code>; </li>
 *     <li> Entity type uid: 15567; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5416f8db. </p>
 * @see Country#UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AuxiliaryMerchantMarine
 * @see SubCategory

 */
public final class A149Florence extends EntityType
{
    /** Default constructor */
    public A149Florence()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)17); // uid 15513, Auxiliary, Merchant Marine
        setSubCategory((byte)6); // uid 15563, Felicity class
        setSpecific((byte)4); // uid 15567, A 149 Florence
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static A149Florence createInstance()
    {
            return new A149Florence();
    }
}
