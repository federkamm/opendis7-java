// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>FlatcarNonSpecialized</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>FlatcarNonSpecialized.createInstance()</code> or <code>new FlatcarNonSpecialized()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Trains = <code>92</code>; </li>
 *     <li> SubCategory: GenericFlatcar  = <code>4</code>; </li>
 *     <li> Specific: FlatcarNonSpecialized  = <code>1</code>; </li>
 *     <li> Entity type uid: 29666; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4d8539de. </p>
 * @see Country#OTHER
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Trains
 * @see SubCategory

 */
public final class FlatcarNonSpecialized extends EntityType
{
    /** Default constructor */
    public FlatcarNonSpecialized()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)92); // uid 25990, Trains
        setSubCategory((byte)4); // uid 25994, Generic Flatcar
        setSpecific((byte)1); // uid 29666, Flatcar, Non-Specialized
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static FlatcarNonSpecialized createInstance()
    {
            return new FlatcarNonSpecialized();
    }
}
