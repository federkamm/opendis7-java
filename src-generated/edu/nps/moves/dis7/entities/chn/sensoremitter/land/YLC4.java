// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>YLC4</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>YLC4.createInstance()</code> or <code>new YLC4()</code>. </p>
 * <ul>
 *     <li> Country: China, Peoples Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Sensor/Emitter = <code>9</code>; </li>
 *     <li> Category: RF Active = <code>2</code>; </li>
 *     <li> SubCategory: EarlyWarningSurveillanceRadar  = <code>2</code>; </li>
 *     <li> Specific: YLC4  = <code>9</code>; </li>
 *     <li> Entity type uid: 27623; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@398694a6. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#SENSOR_EMITTER
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see RFActive
 * @see SubCategory

 */
public final class YLC4 extends EntityType
{
    /** Default constructor */
    public YLC4()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 22506, RF Active
        setSubCategory((byte)2); // uid 22510, Early Warning / Surveillance Radar
        setSpecific((byte)9); // uid 27623, YLC-4
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static YLC4 createInstance()
    {
            return new YLC4();
    }
}
