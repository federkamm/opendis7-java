// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>HQ2BSPLaunchertracked</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HQ2BSPLaunchertracked.createInstance()</code> or <code>new HQ2BSPLaunchertracked()</code>. </p>
 * <ul>
 *     <li> Country: China, Peoples Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Defense/Missile Defense Unit Equipment = <code>28</code>; </li>
 *     <li> SubCategory: HQ2CSA1SAMSystem  = <code>1</code>; </li>
 *     <li> Specific: HQ2Launcher  = <code>2</code>; </li>
 *     <li> Entity type uid: 16942; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@64c87930. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirDefenseMissileDefenseUnitEquipment
 * @see SubCategory

 */
public final class HQ2BSPLaunchertracked extends EntityType
{
    /** Default constructor */
    public HQ2BSPLaunchertracked()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 16937, Air Defense/Missile Defense Unit Equipment
        setSubCategory((byte)1); // uid 16938, HQ-2/CSA-1 SAM System
        setSpecific((byte)2); // uid 16940, HQ-2 Launcher
        setExtra((byte)2); // uid 16942, HQ-2B SP Launcher (tracked)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HQ2BSPLaunchertracked createInstance()
    {
            return new HQ2BSPLaunchertracked();
    }
}
