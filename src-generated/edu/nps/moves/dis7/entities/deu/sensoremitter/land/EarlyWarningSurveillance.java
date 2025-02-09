// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>EarlyWarningSurveillance</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>EarlyWarningSurveillance.createInstance()</code> or <code>new EarlyWarningSurveillance()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Sensor/Emitter = <code>9</code>; </li>
 *     <li> Category: RF Active = <code>2</code>; </li>
 *     <li> SubCategory: EarlyWarningSurveillance  = <code>2</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 28112; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@774013dc. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#SENSOR_EMITTER
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see RFActive
 * @see SubCategory

 */
public final class EarlyWarningSurveillance extends EntityType
{
    /** Default constructor */
    public EarlyWarningSurveillance()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 22489, RF Active
        setSubCategory((byte)2); // uid 28112, Early Warning/Surveillance
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static EarlyWarningSurveillance createInstance()
    {
            return new EarlyWarningSurveillance();
    }
}
