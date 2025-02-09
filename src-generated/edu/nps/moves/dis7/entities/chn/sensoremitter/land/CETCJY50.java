// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CETCJY50</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CETCJY50.createInstance()</code> or <code>new CETCJY50()</code>. </p>
 * <ul>
 *     <li> Country: China, Peoples Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Sensor/Emitter = <code>9</code>; </li>
 *     <li> Category: RF Passive (intercept and DF) = <code>3</code>; </li>
 *     <li> SubCategory: EarlyWarningSurveillance  = <code>2</code>; </li>
 *     <li> Specific: CETCJY50  = <code>2</code>; </li>
 *     <li> Entity type uid: 28851; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3400d6fa. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#SENSOR_EMITTER
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see RFPassiveinterceptandDF
 * @see SubCategory

 */
public final class CETCJY50 extends EntityType
{
    /** Default constructor */
    public CETCJY50()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)3); // uid 28849, RF Passive (intercept and DF)
        setSubCategory((byte)2); // uid 28850, Early Warning/Surveillance
        setSpecific((byte)2); // uid 28851, CETC JY-50
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CETCJY50 createInstance()
    {
            return new CETCJY50();
    }
}
