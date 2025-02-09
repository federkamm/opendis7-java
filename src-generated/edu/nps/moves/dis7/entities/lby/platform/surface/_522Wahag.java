// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.lby.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_522Wahag</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_522Wahag.createInstance()</code> or <code>new _522Wahag()</code>. </p>
 * <ul>
 *     <li> Country: Libya (LBY) = <code>126</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft (PC) = <code>7</code>; </li>
 *     <li> SubCategory: Combattante2GClass  = <code>1</code>; </li>
 *     <li> Specific: _522Wahag  = <code>3</code>; </li>
 *     <li> Entity type uid: 27795; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@10567255. </p>
 * @see Country#LIBYA_LBY
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraftPC
 * @see SubCategory

 */
public final class _522Wahag extends EntityType
{
    /** Default constructor */
    public _522Wahag()
    {
        setCountry(Country.LIBYA_LBY);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 18918, Light/Patrol Craft (PC)
        setSubCategory((byte)1); // uid 18919, Combattante 2 G Class
        setSpecific((byte)3); // uid 27795, 522 Wahag
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _522Wahag createInstance()
    {
            return new _522Wahag();
    }
}
