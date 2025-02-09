// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>GenericBicyclewSaddleBags</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>GenericBicyclewSaddleBags.createInstance()</code> or <code>new GenericBicyclewSaddleBags()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Non-motorized = <code>91</code>; </li>
 *     <li> SubCategory: GenericBicycle  = <code>2</code>; </li>
 *     <li> Specific: GenericBicyclewSaddleBags  = <code>1</code>; </li>
 *     <li> Entity type uid: 26536; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@66908383. </p>
 * @see Country#OTHER
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Nonmotorized
 * @see SubCategory

 */
public final class GenericBicyclewSaddleBags extends EntityType
{
    /** Default constructor */
    public GenericBicyclewSaddleBags()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)91); // uid 25965, Non-motorized
        setSubCategory((byte)2); // uid 25967, Generic Bicycle
        setSpecific((byte)1); // uid 26536, Generic Bicycle w/ Saddle Bags
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static GenericBicyclewSaddleBags createInstance()
    {
            return new GenericBicyclewSaddleBags();
    }
}
