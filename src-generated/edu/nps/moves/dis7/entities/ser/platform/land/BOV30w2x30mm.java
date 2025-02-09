// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ser.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>BOV30w2x30mm</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>BOV30w2x30mm.createInstance()</code> or <code>new BOV30w2x30mm()</code>. </p>
 * <ul>
 *     <li> Country: Serbia and Montenegro = <code>240</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Defense / Missile Defense Unit Equipment = <code>28</code>; </li>
 *     <li> SubCategory: SelfPropelledVSHORADGunMissileSystem  = <code>1</code>; </li>
 *     <li> Specific: BOV30w2x30mm  = <code>2</code>; </li>
 *     <li> Entity type uid: 23673; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1457fde. </p>
 * @see Country#SERBIA_AND_MONTENEGRO
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirDefenseMissileDefenseUnitEquipment
 * @see SubCategory

 */
public final class BOV30w2x30mm extends EntityType
{
    /** Default constructor */
    public BOV30w2x30mm()
    {
        setCountry(Country.SERBIA_AND_MONTENEGRO);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 23670, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)1); // uid 23671, Self -Propelled VSHORAD Gun / Missile System
        setSpecific((byte)2); // uid 23673, BOV-30 w/ 2 x 30-mm
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static BOV30w2x30mm createInstance()
    {
            return new BOV30w2x30mm();
    }
}
