// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.che.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Skyguard</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Skyguard.createInstance()</code> or <code>new Skyguard()</code>. </p>
 * <ul>
 *     <li> Country: Switzerland (CHE) = <code>206</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Sensor/Emitter = <code>9</code>; </li>
 *     <li> Category: RF Active = <code>2</code>; </li>
 *     <li> SubCategory: FireControlRadar  = <code>4</code>; </li>
 *     <li> Specific: Skyguard  = <code>1</code>; </li>
 *     <li> Entity type uid: 22496; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@799971ac. </p>
 * @see Country#SWITZERLAND_CHE
 * @see EntityKind#SENSOR_EMITTER
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see RFActive
 * @see SubCategory

 */
public final class Skyguard extends EntityType
{
    /** Default constructor */
    public Skyguard()
    {
        setCountry(Country.SWITZERLAND_CHE);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 22494, RF Active
        setSubCategory((byte)4); // uid 22495, Fire Control Radar
        setSpecific((byte)1); // uid 22496, Skyguard
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Skyguard createInstance()
    {
            return new Skyguard();
    }
}
