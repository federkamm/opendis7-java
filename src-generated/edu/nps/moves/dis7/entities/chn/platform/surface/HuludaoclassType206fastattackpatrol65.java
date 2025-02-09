// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>HuludaoclassType206fastattackpatrol65</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HuludaoclassType206fastattackpatrol65.createInstance()</code> or <code>new HuludaoclassType206fastattackpatrol65()</code>. </p>
 * <ul>
 *     <li> Country: China, Peoples Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: HuludaoclassType206fastattackpatrol  = <code>8</code>; </li>
 *     <li> Specific: _65  = <code>1</code>; </li>
 *     <li> Entity type uid: 17166; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@68999068. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class HuludaoclassType206fastattackpatrol65 extends EntityType
{
    /** Default constructor */
    public HuludaoclassType206fastattackpatrol65()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 17120, Light/Patrol Craft
        setSubCategory((byte)8); // uid 17165, Huludao class Type 206 (fast attack patrol)
        setSpecific((byte)1); // uid 17166, 65
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HuludaoclassType206fastattackpatrol65 createInstance()
    {
            return new HuludaoclassType206fastattackpatrol65();
    }
}
