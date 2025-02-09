// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AMX30CrotaleNG</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AMX30CrotaleNG.createInstance()</code> or <code>new AMX30CrotaleNG()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Defense / Missile Defense Unit Equipment = <code>28</code>; </li>
 *     <li> SubCategory: CrotaleNGSAMSystem  = <code>2</code>; </li>
 *     <li> Specific: AMX30CrotaleNG  = <code>1</code>; </li>
 *     <li> Entity type uid: 26097; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@51c668e3. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirDefenseMissileDefenseUnitEquipment
 * @see SubCategory

 */
public final class AMX30CrotaleNG extends EntityType
{
    /** Default constructor */
    public AMX30CrotaleNG()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 15711, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)2); // uid 15715, Crotale NG SAM System
        setSpecific((byte)1); // uid 26097, AMX30 Crotale NG
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AMX30CrotaleNG createInstance()
    {
            return new AMX30CrotaleNG();
    }
}
