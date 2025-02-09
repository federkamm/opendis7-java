// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>BG32Kuhlungsborn</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>BG32Kuhlungsborn.createInstance()</code> or <code>new BG32Kuhlungsborn()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Countermeasure Ship / Craft = <code>8</code>; </li>
 *     <li> SubCategory: KondorIClass  = <code>11</code>; </li>
 *     <li> Specific: BG32Kuhlungsborn  = <code>2</code>; </li>
 *     <li> Entity type uid: 16553; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@8c3619e. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCountermeasureShipCraft
 * @see SubCategory

 */
public final class BG32Kuhlungsborn extends EntityType
{
    /** Default constructor */
    public BG32Kuhlungsborn()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 16484, Mine Countermeasure Ship / Craft
        setSubCategory((byte)11); // uid 16551, Kondor I Class
        setSpecific((byte)2); // uid 16553, BG 32 Kuhlungsborn
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static BG32Kuhlungsborn createInstance()
    {
            return new BG32Kuhlungsborn();
    }
}
