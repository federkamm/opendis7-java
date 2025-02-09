// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.lbn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AztecClasscoastalpatrolcraft</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AztecClasscoastalpatrolcraft.createInstance()</code> or <code>new AztecClasscoastalpatrolcraft()</code>. </p>
 * <ul>
 *     <li> Country: Lebanon (LBN) = <code>123</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: AztecClasscoastalpatrolcraft  = <code>2</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 17981; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@51abf713. </p>
 * @see Country#LEBANON_LBN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class AztecClasscoastalpatrolcraft extends EntityType
{
    /** Default constructor */
    public AztecClasscoastalpatrolcraft()
    {
        setCountry(Country.LEBANON_LBN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 17979, Light/Patrol Craft
        setSubCategory((byte)2); // uid 17981, Aztec Class (coastal patrol craft)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AztecClasscoastalpatrolcraft createInstance()
    {
            return new AztecClasscoastalpatrolcraft();
    }
}
