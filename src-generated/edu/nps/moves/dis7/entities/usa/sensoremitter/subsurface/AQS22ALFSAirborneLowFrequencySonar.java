// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.sensoremitter.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AQS22ALFSAirborneLowFrequencySonar</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AQS22ALFSAirborneLowFrequencySonar.createInstance()</code> or <code>new AQS22ALFSAirborneLowFrequencySonar()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Sensor/Emitter = <code>9</code>; </li>
 *     <li> Category: Acoustic, active = <code>10</code>; </li>
 *     <li> SubCategory: DippingSonar  = <code>80</code>; </li>
 *     <li> Specific: AQS22ALFSAirborneLowFrequencySonar  = <code>1</code>; </li>
 *     <li> Entity type uid: 29660; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7404aff2. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#SENSOR_EMITTER
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Acousticactive
 * @see SubCategory

 */
public final class AQS22ALFSAirborneLowFrequencySonar extends EntityType
{
    /** Default constructor */
    public AQS22ALFSAirborneLowFrequencySonar()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)10); // uid 22382, Acoustic, active
        setSubCategory((byte)80); // uid 29659, Dipping Sonar
        setSpecific((byte)1); // uid 29660, AQS22 ALFS (Airborne Low Frequency Sonar)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AQS22ALFSAirborneLowFrequencySonar createInstance()
    {
            return new AQS22ALFSAirborneLowFrequencySonar();
    }
}
