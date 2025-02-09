// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.irn.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SSPAttackSubmarineDieselAirIndependentPropulsion</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SSPAttackSubmarineDieselAirIndependentPropulsion.createInstance()</code> or <code>new SSPAttackSubmarineDieselAirIndependentPropulsion()</code>. </p>
 * <ul>
 *     <li> Country: Iran (Islamic Republic of) (IRN) = <code>101</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SSP (Attack Submarine - Diesel Air-Independent Propulsion) = <code>11</code>; </li>
 *     <li> SubCategory:  <code>(none)</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 30897; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@60dce7ea. </p>
 * @see Country#IRAN_ISLAMIC_REPUBLIC_OF_IRN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSPAttackSubmarineDieselAirIndependentPropulsion

 */
public final class SSPAttackSubmarineDieselAirIndependentPropulsion extends EntityType
{
    /** Default constructor */
    public SSPAttackSubmarineDieselAirIndependentPropulsion()
    {
        setCountry(Country.IRAN_ISLAMIC_REPUBLIC_OF_IRN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)11); // uid 30897, SSP (Attack Submarine - Diesel Air-Independent Propulsion)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SSPAttackSubmarineDieselAirIndependentPropulsion createInstance()
    {
            return new SSPAttackSubmarineDieselAirIndependentPropulsion();
    }
}
