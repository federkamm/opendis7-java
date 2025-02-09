// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aut.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>PandurII8x8</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>PandurII8x8.createInstance()</code> or <code>new PandurII8x8()</code>. </p>
 * <ul>
 *     <li> Country: Austria (AUT) = <code>14</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Armored Fighting Vehicle - (IFV, APC, SP mortars, armored cars, chemical reconnaissance, Anti-Tank guided missile launchers, etc.) = <code>2</code>; </li>
 *     <li> SubCategory: Pandur  = <code>1</code>; </li>
 *     <li> Specific: PandurII8x8  = <code>3</code>; </li>
 *     <li> Entity type uid: 23522; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@548b7f67. </p>
 * @see Country#AUSTRIA_AUT
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ArmoredFightingVehicleIFVAPCSPmortarsarmoredcarschemicalreconnaissanceAntiTankguidedmissilelaunchersetc
 * @see SubCategory

 */
public final class PandurII8x8 extends EntityType
{
    /** Default constructor */
    public PandurII8x8()
    {
        setCountry(Country.AUSTRIA_AUT);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 23518, Armored Fighting Vehicle - (IFV, APC, SP mortars, armored cars, chemical reconnaissance, Anti-Tank guided missile launchers, etc.)
        setSubCategory((byte)1); // uid 23519, Pandur
        setSpecific((byte)3); // uid 23522, Pandur II 8x8
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static PandurII8x8 createInstance()
    {
            return new PandurII8x8();
    }
}
