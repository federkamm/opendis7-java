// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ANTRS2VPlatoonEarlyWarningSystemPEWS</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ANTRS2VPlatoonEarlyWarningSystemPEWS.createInstance()</code> or <code>new ANTRS2VPlatoonEarlyWarningSystemPEWS()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Sensor/Emitter = <code>9</code>; </li>
 *     <li> Category: Seismic = <code>6</code>; </li>
 *     <li> SubCategory: EarlyWarningSurveillance  = <code>2</code>; </li>
 *     <li> Specific: ANTRS2VPlatoonEarlyWarningSystemPEWS  = <code>1</code>; </li>
 *     <li> Entity type uid: 23713; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6d7e2795. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#SENSOR_EMITTER
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Seismic
 * @see SubCategory

 */
public final class ANTRS2VPlatoonEarlyWarningSystemPEWS extends EntityType
{
    /** Default constructor */
    public ANTRS2VPlatoonEarlyWarningSystemPEWS()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 23711, Seismic
        setSubCategory((byte)2); // uid 23712, Early Warning/Surveillance
        setSpecific((byte)1); // uid 23713, AN/TRS-2(V) Platoon Early Warning System (PEWS)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ANTRS2VPlatoonEarlyWarningSystemPEWS createInstance()
    {
            return new ANTRS2VPlatoonEarlyWarningSystemPEWS();
    }
}
