// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.can.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>BombardierChallenger300</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>BombardierChallenger300.createInstance()</code> or <code>new BombardierChallenger300()</code>. </p>
 * <ul>
 *     <li> Country: Canada (CAN) = <code>39</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Civilian Fixed Wing Aircraft, Medium (up to 41,000 lbs / 18,597 kg) = <code>86</code>; </li>
 *     <li> SubCategory: TwinJet  = <code>32</code>; </li>
 *     <li> Specific: BombardierChallenger300  = <code>1</code>; </li>
 *     <li> Entity type uid: 26109; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@307f6b8c. </p>
 * @see Country#CANADA_CAN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CivilianFixedWingAircraftMediumupto41000lbs18597kg
 * @see SubCategory

 */
public final class BombardierChallenger300 extends EntityType
{
    /** Default constructor */
    public BombardierChallenger300()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)86); // uid 23878, Civilian Fixed Wing Aircraft, Medium (up to 41,000 lbs / 18,597 kg)
        setSubCategory((byte)32); // uid 26108, Twin Jet
        setSpecific((byte)1); // uid 26109, Bombardier Challenger 300
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static BombardierChallenger300 createInstance()
    {
            return new BombardierChallenger300();
    }
}
