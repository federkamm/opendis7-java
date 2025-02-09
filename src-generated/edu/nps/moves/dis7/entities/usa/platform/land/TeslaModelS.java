// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TeslaModelS</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TeslaModelS.createInstance()</code> or <code>new TeslaModelS()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Car = <code>81</code>; </li>
 *     <li> SubCategory: _5DoorHatchbackFullPremiumLuxuryLarge  = <code>54</code>; </li>
 *     <li> Specific: TeslaModelS  = <code>1</code>; </li>
 *     <li> Entity type uid: 29347; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7e8279e5. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Car
 * @see SubCategory

 */
public final class TeslaModelS extends EntityType
{
    /** Default constructor */
    public TeslaModelS()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)81); // uid 24919, Car
        setSubCategory((byte)54); // uid 29346, 5-Door Hatchback, Full/Premium/Luxury (Large)
        setSpecific((byte)1); // uid 29347, Tesla Model S
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TeslaModelS createInstance()
    {
            return new TeslaModelS();
    }
}
