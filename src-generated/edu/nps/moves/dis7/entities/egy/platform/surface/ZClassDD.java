// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.egy.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ZClassDD</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ZClassDD.createInstance()</code> or <code>new ZClassDD()</code>. </p>
 * <ul>
 *     <li> Country: Egypt (EGY) = <code>62</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Destroyer = <code>5</code>; </li>
 *     <li> SubCategory: ZClassDD  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 18797; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5fd4f8f5. </p>
 * @see Country#COMMENT_RELIABLE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Destroyer
 * @see SubCategory

 */
public final class ZClassDD extends EntityType
{
    /** Default constructor */
    public ZClassDD()
    {
        setCountry(Country.COMMENT_RELIABLE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)5); // uid 18796, Destroyer
        setSubCategory((byte)1); // uid 18797, Z Class (DD)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ZClassDD createInstance()
    {
            return new ZClassDD();
    }
}
