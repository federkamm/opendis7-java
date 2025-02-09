// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.sau.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_422Shaqra</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_422Shaqra.createInstance()</code> or <code>new _422Shaqra()</code>. </p>
 * <ul>
 *     <li> Country: Saudi Arabia (SAU) = <code>189</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Countermeasure/Ship Craft = <code>8</code>; </li>
 *     <li> SubCategory: SandownClassminehunterscoastal  = <code>1</code>; </li>
 *     <li> Specific: _422Shaqra  = <code>2</code>; </li>
 *     <li> Entity type uid: 17882; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1f6917fb. </p>
 * @see Country#SAUDI_ARABIA_SAU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCountermeasureShipCraft
 * @see SubCategory

 */
public final class _422Shaqra extends EntityType
{
    /** Default constructor */
    public _422Shaqra()
    {
        setCountry(Country.SAUDI_ARABIA_SAU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 17879, Mine Countermeasure/Ship Craft
        setSubCategory((byte)1); // uid 17880, Sandown Class (minehunters-coastal)
        setSpecific((byte)2); // uid 17882, 422 Shaqra
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _422Shaqra createInstance()
    {
            return new _422Shaqra();
    }
}
