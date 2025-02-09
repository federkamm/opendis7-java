// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>PatriotCommunicationsRelayGroupCRGANMRC137onM927A1TruckcargoXLWB5ton6X6wowinch</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>PatriotCommunicationsRelayGroupCRGANMRC137onM927A1TruckcargoXLWB5ton6X6wowinch.createInstance()</code> or <code>new PatriotCommunicationsRelayGroupCRGANMRC137onM927A1TruckcargoXLWB5ton6X6wowinch()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Defense/Missile Defense Unit Equipment = <code>28</code>; </li>
 *     <li> SubCategory: MIM104RaytheonPatriotHightoMediumAltitudeAirDefenseHIMAD  = <code>4</code>; </li>
 *     <li> Specific: PatriotCommunicationsRelayGroupGE  = <code>3</code>; </li>
 *     <li> Entity type uid: 28106; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@1fb19a0. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirDefenseMissileDefenseUnitEquipment
 * @see SubCategory

 */
public final class PatriotCommunicationsRelayGroupCRGANMRC137onM927A1TruckcargoXLWB5ton6X6wowinch extends EntityType
{
    /** Default constructor */
    public PatriotCommunicationsRelayGroupCRGANMRC137onM927A1TruckcargoXLWB5ton6X6wowinch()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 16321, Air Defense/Missile Defense Unit Equipment
        setSubCategory((byte)4); // uid 28096, MIM-104 Raytheon Patriot High-to-Medium Altitude Air Defense (HIMAD)
        setSpecific((byte)3); // uid 28105, Patriot Communications Relay Group GE
        setExtra((byte)1); // uid 28106, Patriot Communications Relay Group (CRG), AN/MRC-137 on M927A1 Truck, cargo, XLWB, 5-ton, 6 X 6, w/o winch
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static PatriotCommunicationsRelayGroupCRGANMRC137onM927A1TruckcargoXLWB5ton6X6wowinch createInstance()
    {
            return new PatriotCommunicationsRelayGroupCRGANMRC137onM927A1TruckcargoXLWB5ton6X6wowinch();
    }
}
