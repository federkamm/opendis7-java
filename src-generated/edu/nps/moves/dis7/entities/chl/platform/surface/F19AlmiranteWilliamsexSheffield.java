// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chl.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>F19AlmiranteWilliamsexSheffield</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>F19AlmiranteWilliamsexSheffield.createInstance()</code> or <code>new F19AlmiranteWilliamsexSheffield()</code>. </p>
 * <ul>
 *     <li> Country: Chile (CHL) = <code>44</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate (FFG) = <code>6</code>; </li>
 *     <li> SubCategory: Type22Boxerclass  = <code>4</code>; </li>
 *     <li> Specific: F19AlmiranteWilliamsexSheffield  = <code>1</code>; </li>
 *     <li> Entity type uid: 28688; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@727803de. </p>
 * @see Country#CHILE_CHL
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigateFFG
 * @see SubCategory

 */
public final class F19AlmiranteWilliamsexSheffield extends EntityType
{
    /** Default constructor */
    public F19AlmiranteWilliamsexSheffield()
    {
        setCountry(Country.CHILE_CHL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 27464, Guided Missile Frigate (FFG)
        setSubCategory((byte)4); // uid 28687, Type 22 (Boxer) class
        setSpecific((byte)1); // uid 28688, F 19 Almirante Williams (ex-Sheffield)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static F19AlmiranteWilliamsexSheffield createInstance()
    {
            return new F19AlmiranteWilliamsexSheffield();
    }
}
