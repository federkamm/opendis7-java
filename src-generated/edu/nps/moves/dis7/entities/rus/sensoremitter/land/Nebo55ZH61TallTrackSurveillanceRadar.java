// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Nebo55ZH61TallTrackSurveillanceRadar</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Nebo55ZH61TallTrackSurveillanceRadar.createInstance()</code> or <code>new Nebo55ZH61TallTrackSurveillanceRadar()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Sensor/Emitter = <code>9</code>; </li>
 *     <li> Category: RF Active = <code>2</code>; </li>
 *     <li> SubCategory: EarlyWarningSurveillanceRadar  = <code>2</code>; </li>
 *     <li> Specific: Nebo55ZH61TallTrackSurveillanceRadar  = <code>12</code>; </li>
 *     <li> Entity type uid: 24148; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@75add13c. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#SENSOR_EMITTER
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see RFActive
 * @see SubCategory

 */
public final class Nebo55ZH61TallTrackSurveillanceRadar extends EntityType
{
    /** Default constructor */
    public Nebo55ZH61TallTrackSurveillanceRadar()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 22411, RF Active
        setSubCategory((byte)2); // uid 22415, Early Warning/Surveillance Radar
        setSpecific((byte)12); // uid 24148, Nebo (55ZH6-1) Tall Track Surveillance Radar
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Nebo55ZH61TallTrackSurveillanceRadar createInstance()
    {
            return new Nebo55ZH61TallTrackSurveillanceRadar();
    }
}
