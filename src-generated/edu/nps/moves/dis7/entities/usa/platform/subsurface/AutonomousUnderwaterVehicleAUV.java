// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AutonomousUnderwaterVehicleAUV</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AutonomousUnderwaterVehicleAUV.createInstance()</code> or <code>new AutonomousUnderwaterVehicleAUV()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Unmanned Underwater Vehicle (UUV) = <code>8</code>; </li>
 *     <li> SubCategory: AutonomousUnderwaterVehicleAUV  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 29661; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@7faa0680. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see UnmannedUnderwaterVehicleUUV
 * @see SubCategory

 */
public final class AutonomousUnderwaterVehicleAUV extends EntityType
{
    /** Default constructor */
    public AutonomousUnderwaterVehicleAUV()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)8); // uid 28694, Unmanned Underwater Vehicle (UUV)
        setSubCategory((byte)1); // uid 29661, Autonomous Underwater Vehicle (AUV)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AutonomousUnderwaterVehicleAUV createInstance()
    {
            return new AutonomousUnderwaterVehicleAUV();
    }
}
