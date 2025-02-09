// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.srb.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M84NORAA</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M84NORAA.createInstance()</code> or <code>new M84NORAA()</code>. </p>
 * <ul>
 *     <li> Country: Serbia (SRB) = <code>276</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Towed Artillery = <code>5</code>; </li>
 *     <li> SubCategory: M84NORAA  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 30161; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@44f24a20. </p>
 * @see Country#SERBIA_SRB
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see TowedArtillery
 * @see SubCategory

 */
public final class M84NORAA extends EntityType
{
    /** Default constructor */
    public M84NORAA()
    {
        setCountry(Country.SERBIA_SRB);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)5); // uid 30160, Towed Artillery
        setSubCategory((byte)1); // uid 30161, M84 NORA-A
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M84NORAA createInstance()
    {
            return new M84NORAA();
    }
}
