// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ury.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>HelgolandClassType720</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HelgolandClassType720.createInstance()</code> or <code>new HelgolandClassType720()</code>. </p>
 * <ul>
 *     <li> Country: Uruguay (URY) = <code>226</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: HelgolandClassType720  = <code>3</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 27533; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@2c47a053. </p>
 * @see Country#URUGUAY_URY
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class HelgolandClassType720 extends EntityType
{
    /** Default constructor */
    public HelgolandClassType720()
    {
        setCountry(Country.URUGUAY_URY);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 27490, Auxiliary
        setSubCategory((byte)3); // uid 27533, Helgoland Class (Type 720)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HelgolandClassType720 createInstance()
    {
            return new HelgolandClassType720();
    }
}
