// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.bgr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_54Balik</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_54Balik.createInstance()</code> or <code>new _54Balik()</code>. </p>
 * <ul>
 *     <li> Country: Bulgaria (BGR) = <code>33</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Countermeasure Ship/Craft = <code>8</code>; </li>
 *     <li> SubCategory: OlyaClassProject1259  = <code>3</code>; </li>
 *     <li> Specific: _54Balik  = <code>4</code>; </li>
 *     <li> Entity type uid: 32900; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@49fc609f. </p>
 * @see Country#BULGARIA_BGR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCountermeasureShipCraft
 * @see SubCategory

 */
public final class _54Balik extends EntityType
{
    /** Default constructor */
    public _54Balik()
    {
        setCountry(Country.BULGARIA_BGR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 27886, Mine Countermeasure Ship/Craft
        setSubCategory((byte)3); // uid 32896, Olya Class (Project 1259)
        setSpecific((byte)4); // uid 32900, 54 Balik
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _54Balik createInstance()
    {
            return new _54Balik();
    }
}
