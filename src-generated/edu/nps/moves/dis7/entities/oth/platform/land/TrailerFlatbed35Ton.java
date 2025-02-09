// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TrailerFlatbed35Ton</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TrailerFlatbed35Ton.createInstance()</code> or <code>new TrailerFlatbed35Ton()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Trailer = <code>89</code>; </li>
 *     <li> SubCategory: GenericTrailerFlatbed  = <code>1</code>; </li>
 *     <li> Specific: TrailerFlatbed35Ton  = <code>7</code>; </li>
 *     <li> Entity type uid: 31640; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@759d81f3. </p>
 * @see Country#OTHER
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Trailer
 * @see SubCategory

 */
public final class TrailerFlatbed35Ton extends EntityType
{
    /** Default constructor */
    public TrailerFlatbed35Ton()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)89); // uid 25929, Trailer
        setSubCategory((byte)1); // uid 25930, Generic Trailer, Flatbed
        setSpecific((byte)7); // uid 31640, Trailer, Flatbed 35 Ton
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TrailerFlatbed35Ton createInstance()
    {
            return new TrailerFlatbed35Ton();
    }
}
