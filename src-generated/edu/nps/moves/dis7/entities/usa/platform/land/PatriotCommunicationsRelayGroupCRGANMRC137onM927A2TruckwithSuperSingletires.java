// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>PatriotCommunicationsRelayGroupCRGANMRC137onM927A2TruckwithSuperSingletires</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>PatriotCommunicationsRelayGroupCRGANMRC137onM927A2TruckwithSuperSingletires.createInstance()</code> or <code>new PatriotCommunicationsRelayGroupCRGANMRC137onM927A2TruckwithSuperSingletires()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Defense / Missile Defense Unit Equipment = <code>28</code>; </li>
 *     <li> SubCategory: MIM104RaytheonPatriotHightoMediumAltitudeAirDefenseHIMADSystem  = <code>2</code>; </li>
 *     <li> Specific: PatriotCommunicationsRelayGroup  = <code>3</code>; </li>
 *     <li> Entity type uid: 22970; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@3a8cea24. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirDefenseMissileDefenseUnitEquipment
 * @see SubCategory

 */
public final class PatriotCommunicationsRelayGroupCRGANMRC137onM927A2TruckwithSuperSingletires extends EntityType
{
    /** Default constructor */
    public PatriotCommunicationsRelayGroupCRGANMRC137onM927A2TruckwithSuperSingletires()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 10679, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)2); // uid 10691, MIM-104 Raytheon Patriot High-to-Medium Altitude Air Defense (HIMAD) System
        setSpecific((byte)3); // uid 22963, Patriot Communications Relay Group
        setExtra((byte)2); // uid 22970, Patriot Communications Relay Group (CRG), AN/MRC-137 on M927A2 Truck with Super Single tires
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static PatriotCommunicationsRelayGroupCRGANMRC137onM927A2TruckwithSuperSingletires createInstance()
    {
            return new PatriotCommunicationsRelayGroupCRGANMRC137onM927A2TruckwithSuperSingletires();
    }
}
