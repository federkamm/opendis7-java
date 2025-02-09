// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.qat.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Q11Barzan</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Q11Barzan.createInstance()</code> or <code>new Q11Barzan()</code>. </p>
 * <ul>
 *     <li> Country: Qatar (QAT) = <code>178</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: BarzanClasslargepatrolcraft  = <code>2</code>; </li>
 *     <li> Specific: Q11Barzan  = <code>1</code>; </li>
 *     <li> Entity type uid: 17834; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@53692008. </p>
 * @see Country#QATAR_QAT
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class Q11Barzan extends EntityType
{
    /** Default constructor */
    public Q11Barzan()
    {
        setCountry(Country.QATAR_QAT);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 17828, Light/Patrol Craft
        setSubCategory((byte)2); // uid 17833, Barzan Class (large patrol craft)
        setSpecific((byte)1); // uid 17834, Q11 Barzan
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Q11Barzan createInstance()
    {
            return new Q11Barzan();
    }
}
