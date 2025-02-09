// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.tun.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>P201Istiklal</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>P201Istiklal.createInstance()</code> or <code>new P201Istiklal()</code>. </p>
 * <ul>
 *     <li> Country: Tunisia (TUN) = <code>217</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: CoastalPatrolCraftclass  = <code>1</code>; </li>
 *     <li> Specific: P201Istiklal  = <code>1</code>; </li>
 *     <li> Entity type uid: 23008; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@63cd2cd2. </p>
 * @see Country#TUNISIA_TUN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class P201Istiklal extends EntityType
{
    /** Default constructor */
    public P201Istiklal()
    {
        setCountry(Country.TUNISIA_TUN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 23006, Light/Patrol Craft
        setSubCategory((byte)1); // uid 23007, Coastal Patrol Craft class
        setSpecific((byte)1); // uid 23008, P201 Istiklal
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static P201Istiklal createInstance()
    {
            return new P201Istiklal();
    }
}
