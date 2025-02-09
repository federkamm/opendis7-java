// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>GenericVeryLargeSailboatgreaterthan65ft198m</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>GenericVeryLargeSailboatgreaterthan65ft198m.createInstance()</code> or <code>new GenericVeryLargeSailboatgreaterthan65ft198m()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Private Sailboat = <code>85</code>; </li>
 *     <li> SubCategory: GenericVeryLargeSailboatgreaterthan65ft198m  = <code>4</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 24649; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@7808fb9. </p>
 * @see Country#OTHER
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see PrivateSailboat
 * @see SubCategory

 */
public final class GenericVeryLargeSailboatgreaterthan65ft198m extends EntityType
{
    /** Default constructor */
    public GenericVeryLargeSailboatgreaterthan65ft198m()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)85); // uid 24645, Private Sailboat
        setSubCategory((byte)4); // uid 24649, Generic Very Large Sailboat (greater than 65ft/19.8m)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static GenericVeryLargeSailboatgreaterthan65ft198m createInstance()
    {
            return new GenericVeryLargeSailboatgreaterthan65ft198m();
    }
}
