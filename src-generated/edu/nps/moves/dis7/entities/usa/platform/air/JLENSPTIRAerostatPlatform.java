// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>JLENSPTIRAerostatPlatform</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>JLENSPTIRAerostatPlatform.createInstance()</code> or <code>new JLENSPTIRAerostatPlatform()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Surveillance / C2 (Airborne Early Warning) = <code>8</code>; </li>
 *     <li> SubCategory: JLENSAerostats  = <code>10</code>; </li>
 *     <li> Specific: JLENSPTIRAerostatPlatform  = <code>1</code>; </li>
 *     <li> Entity type uid: 11054; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@f2d890c. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SurveillanceC2AirborneEarlyWarning
 * @see SubCategory

 */
public final class JLENSPTIRAerostatPlatform extends EntityType
{
    /** Default constructor */
    public JLENSPTIRAerostatPlatform()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)8); // uid 11029, Surveillance / C2 (Airborne Early Warning)
        setSubCategory((byte)10); // uid 11053, JLENS Aerostats
        setSpecific((byte)1); // uid 11054, JLENS PTIR Aerostat Platform
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static JLENSPTIRAerostatPlatform createInstance()
    {
            return new JLENSPTIRAerostatPlatform();
    }
}
