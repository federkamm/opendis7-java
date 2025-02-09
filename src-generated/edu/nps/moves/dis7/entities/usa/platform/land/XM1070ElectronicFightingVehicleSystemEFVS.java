// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>XM1070ElectronicFightingVehicleSystemEFVS</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>XM1070ElectronicFightingVehicleSystemEFVS.createInstance()</code> or <code>new XM1070ElectronicFightingVehicleSystemEFVS()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Tracked Utility Vehicle = <code>9</code>; </li>
 *     <li> SubCategory: M992FieldArtilleryAmmunitionSupportVehicleFAASV  = <code>3</code>; </li>
 *     <li> Specific: XM1070ElectronicFightingVehicleSystemEFVS  = <code>5</code>; </li>
 *     <li> Entity type uid: 10598; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@e700eba. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeTrackedUtilityVehicle
 * @see SubCategory

 */
public final class XM1070ElectronicFightingVehicleSystemEFVS extends EntityType
{
    /** Default constructor */
    public XM1070ElectronicFightingVehicleSystemEFVS()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)9); // uid 10578, Large Tracked Utility Vehicle
        setSubCategory((byte)3); // uid 10593, M992 Field Artillery Ammunition Support Vehicle (FAASV)
        setSpecific((byte)5); // uid 10598, XM1070 Electronic Fighting Vehicle System (EFVS)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static XM1070ElectronicFightingVehicleSystemEFVS createInstance()
    {
            return new XM1070ElectronicFightingVehicleSystemEFVS();
    }
}
