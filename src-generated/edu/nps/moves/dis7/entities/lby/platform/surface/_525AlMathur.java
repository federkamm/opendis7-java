// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.lby.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_525AlMathur</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_525AlMathur.createInstance()</code> or <code>new _525AlMathur()</code>. </p>
 * <ul>
 *     <li> Country: Libya (LBY) = <code>126</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft (PC) = <code>7</code>; </li>
 *     <li> SubCategory: OSAIClass  = <code>2</code>; </li>
 *     <li> Specific: _525AlMathur  = <code>4</code>; </li>
 *     <li> Entity type uid: 27804; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@35e52059. </p>
 * @see Country#LIBYA_LBY
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraftPC
 * @see SubCategory

 */
public final class _525AlMathur extends EntityType
{
    /** Default constructor */
    public _525AlMathur()
    {
        setCountry(Country.LIBYA_LBY);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 18918, Light/Patrol Craft (PC)
        setSubCategory((byte)2); // uid 27800, OSA I Class
        setSpecific((byte)4); // uid 27804, 525 Al Mathur
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _525AlMathur createInstance()
    {
            return new _525AlMathur();
    }
}
