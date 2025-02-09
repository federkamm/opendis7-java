// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M612AlenconexMSO453</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M612AlenconexMSO453.createInstance()</code> or <code>new M612AlenconexMSO453()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Countermeasure Ship / Craft = <code>8</code>; </li>
 *     <li> SubCategory: exUSAggressiveclassminesweepers  = <code>4</code>; </li>
 *     <li> Specific: M612AlenconexMSO453  = <code>2</code>; </li>
 *     <li> Entity type uid: 16004; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5167f57d. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCountermeasureShipCraft
 * @see SubCategory

 */
public final class M612AlenconexMSO453 extends EntityType
{
    /** Default constructor */
    public M612AlenconexMSO453()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 15978, Mine Countermeasure Ship / Craft
        setSubCategory((byte)4); // uid 16002, ex-US Aggressive class (minesweepers)
        setSpecific((byte)2); // uid 16004, M 612 Alencon (ex-MSO 453)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M612AlenconexMSO453 createInstance()
    {
            return new M612AlenconexMSO453();
    }
}
