// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.bgd.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>P812Nirbhoy</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>P812Nirbhoy.createInstance()</code> or <code>new P812Nirbhoy()</code>. </p>
 * <ul>
 *     <li> Country: Bangladesh (BGD) = <code>18</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: HainanClassType037  = <code>1</code>; </li>
 *     <li> Specific: P812Nirbhoy  = <code>1</code>; </li>
 *     <li> Entity type uid: 32616; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@cb5822. </p>
 * @see Country#BANGLADESH_BGD
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class P812Nirbhoy extends EntityType
{
    /** Default constructor */
    public P812Nirbhoy()
    {
        setCountry(Country.BANGLADESH_BGD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 32614, Light/Patrol Craft
        setSubCategory((byte)1); // uid 32615, Hainan Class (Type 037)
        setSpecific((byte)1); // uid 32616, P812 Nirbhoy
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static P812Nirbhoy createInstance()
    {
            return new P812Nirbhoy();
    }
}
