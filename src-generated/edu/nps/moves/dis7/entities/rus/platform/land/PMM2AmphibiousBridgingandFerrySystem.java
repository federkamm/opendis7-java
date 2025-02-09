// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>PMM2AmphibiousBridgingandFerrySystem</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>PMM2AmphibiousBridgingandFerrySystem.createInstance()</code> or <code>new PMM2AmphibiousBridgingandFerrySystem()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Other = <code>0</code>; </li>
 *     <li> SubCategory: Bridges  = <code>1</code>; </li>
 *     <li> Specific: PMM2AmphibiousBridgingandFerrySystem  = <code>1</code>; </li>
 *     <li> Entity type uid: 12479; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@40ee0a22. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Other
 * @see SubCategory

 */
public final class PMM2AmphibiousBridgingandFerrySystem extends EntityType
{
    /** Default constructor */
    public PMM2AmphibiousBridgingandFerrySystem()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)0); // uid 12477, Other
        setSubCategory((byte)1); // uid 12478, Bridges
        setSpecific((byte)1); // uid 12479, PMM-2 Amphibious Bridging and Ferry System
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static PMM2AmphibiousBridgingandFerrySystem createInstance()
    {
            return new PMM2AmphibiousBridgingandFerrySystem();
    }
}
