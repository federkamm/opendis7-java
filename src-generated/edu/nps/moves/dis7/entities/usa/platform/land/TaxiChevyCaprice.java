// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TaxiChevyCaprice</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TaxiChevyCaprice.createInstance()</code> or <code>new TaxiChevyCaprice()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Utility/Emergency Car = <code>93</code>; </li>
 *     <li> SubCategory: Taxi  = <code>5</code>; </li>
 *     <li> Specific: TaxiChevyCaprice  = <code>1</code>; </li>
 *     <li> Entity type uid: 24962; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@66e17eff. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see UtilityEmergencyCar
 * @see SubCategory

 */
public final class TaxiChevyCaprice extends EntityType
{
    /** Default constructor */
    public TaxiChevyCaprice()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)93); // uid 24960, Utility/Emergency Car
        setSubCategory((byte)5); // uid 24961, Taxi
        setSpecific((byte)1); // uid 24962, Taxi, Chevy Caprice
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TaxiChevyCaprice createInstance()
    {
            return new TaxiChevyCaprice();
    }
}
