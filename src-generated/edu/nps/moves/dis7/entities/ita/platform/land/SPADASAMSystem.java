// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ita.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SPADASAMSystem</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SPADASAMSystem.createInstance()</code> or <code>new SPADASAMSystem()</code>. </p>
 * <ul>
 *     <li> Country: Italy (ITA) = <code>106</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Defense/Missile Defense Unit Equipment = <code>28</code>; </li>
 *     <li> SubCategory: SPADASAMSystem  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 18297; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6b5894c8. </p>
 * @see Country#ITALY_ITA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirDefenseMissileDefenseUnitEquipment
 * @see SubCategory

 */
public final class SPADASAMSystem extends EntityType
{
    /** Default constructor */
    public SPADASAMSystem()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 18296, Air Defense/Missile Defense Unit Equipment
        setSubCategory((byte)1); // uid 18297, SPADA SAM System
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SPADASAMSystem createInstance()
    {
            return new SPADASAMSystem();
    }
}
