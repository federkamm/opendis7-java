// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ser.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M80</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M80.createInstance()</code> or <code>new M80()</code>. </p>
 * <ul>
 *     <li> Country: Serbia and Montenegro = <code>240</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Armored Fighting Vehicle - (IFV, APC, SP mortars, armored cars, chemical reconnaissance, Anti-Tank guided missile launchers, etc.) = <code>2</code>; </li>
 *     <li> SubCategory: M80APC  = <code>1</code>; </li>
 *     <li> Specific: M80  = <code>1</code>; </li>
 *     <li> Entity type uid: 23665; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@22eaa86e. </p>
 * @see Country#SERBIA_AND_MONTENEGRO
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ArmoredFightingVehicleIFVAPCSPmortarsarmoredcarschemicalreconnaissanceAntiTankguidedmissilelaunchersetc
 * @see SubCategory

 */
public final class M80 extends EntityType
{
    /** Default constructor */
    public M80()
    {
        setCountry(Country.SERBIA_AND_MONTENEGRO);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 23663, Armored Fighting Vehicle - (IFV, APC, SP mortars, armored cars, chemical reconnaissance, Anti-Tank guided missile launchers, etc.)
        setSubCategory((byte)1); // uid 23664, M-80 APC
        setSpecific((byte)1); // uid 23665, M-80
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M80 createInstance()
    {
            return new M80();
    }
}
