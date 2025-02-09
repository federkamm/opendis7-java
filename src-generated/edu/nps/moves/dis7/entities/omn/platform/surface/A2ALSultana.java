// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.omn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>A2ALSultana</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>A2ALSultana.createInstance()</code> or <code>new A2ALSultana()</code>. </p>
 * <ul>
 *     <li> Country: Oman (OMN) = <code>164</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Combat Stores Ship = <code>58</code>; </li>
 *     <li> SubCategory: SupplyShip  = <code>1</code>; </li>
 *     <li> Specific: A2ALSultana  = <code>1</code>; </li>
 *     <li> Entity type uid: 17977; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@56193c7d. </p>
 * @see Country#OMAN_OMN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CombatStoresShip
 * @see SubCategory

 */
public final class A2ALSultana extends EntityType
{
    /** Default constructor */
    public A2ALSultana()
    {
        setCountry(Country.OMAN_OMN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)58); // uid 17975, Combat Stores Ship
        setSubCategory((byte)1); // uid 17976, Supply Ship
        setSpecific((byte)1); // uid 17977, A2 AL Sultana
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static A2ALSultana createInstance()
    {
            return new A2ALSultana();
    }
}
