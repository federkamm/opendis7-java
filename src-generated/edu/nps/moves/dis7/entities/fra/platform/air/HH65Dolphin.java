// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>HH65Dolphin</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HH65Dolphin.createInstance()</code> or <code>new HH65Dolphin()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Utility Helicopter = <code>21</code>; </li>
 *     <li> SubCategory: EurocopterAS365N2Dauphin2  = <code>15</code>; </li>
 *     <li> Specific: HH65Dolphin  = <code>1</code>; </li>
 *     <li> Entity type uid: 15887; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@25be7b63. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see UtilityHelicopter
 * @see SubCategory

 */
public final class HH65Dolphin extends EntityType
{
    /** Default constructor */
    public HH65Dolphin()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 15827, Utility Helicopter
        setSubCategory((byte)15); // uid 15886, Eurocopter AS 365N2 Dauphin 2
        setSpecific((byte)1); // uid 15887, HH-65 Dolphin
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HH65Dolphin createInstance()
    {
            return new HH65Dolphin();
    }
}
