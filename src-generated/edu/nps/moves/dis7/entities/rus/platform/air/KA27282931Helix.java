// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>KA27282931Helix</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>KA27282931Helix.createInstance()</code> or <code>new KA27282931Helix()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Utility helicopter = <code>21</code>; </li>
 *     <li> SubCategory: KA27282931Helix  = <code>9</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 13466; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@226eba67. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Utilityhelicopter
 * @see SubCategory

 */
public final class KA27282931Helix extends EntityType
{
    /** Default constructor */
    public KA27282931Helix()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 13431, Utility helicopter
        setSubCategory((byte)9); // uid 13466, KA-27/28/29/31 Helix
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static KA27282931Helix createInstance()
    {
            return new KA27282931Helix();
    }
}
