// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.nld.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M862Zierikzee</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M862Zierikzee.createInstance()</code> or <code>new M862Zierikzee()</code>. </p>
 * <ul>
 *     <li> Country: Netherlands (NLD) = <code>153</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Countermeasure Ship/Craft = <code>8</code>; </li>
 *     <li> SubCategory: AlkmaarClass  = <code>1</code>; </li>
 *     <li> Specific: M862Zierikzee  = <code>8</code>; </li>
 *     <li> Entity type uid: 23297; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@27f3b6d6. </p>
 * @see Country#NETHERLANDS_NLD
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCountermeasureShipCraft
 * @see SubCategory

 */
public final class M862Zierikzee extends EntityType
{
    /** Default constructor */
    public M862Zierikzee()
    {
        setCountry(Country.NETHERLANDS_NLD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 23288, Mine Countermeasure Ship/Craft
        setSubCategory((byte)1); // uid 23289, Alkmaar Class
        setSpecific((byte)8); // uid 23297, M862 Zierikzee
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M862Zierikzee createInstance()
    {
            return new M862Zierikzee();
    }
}
