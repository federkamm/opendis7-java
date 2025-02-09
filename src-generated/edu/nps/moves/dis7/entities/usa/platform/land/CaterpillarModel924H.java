// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CaterpillarModel924H</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CaterpillarModel924H.createInstance()</code> or <code>new CaterpillarModel924H()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Construction Specialty Vehicle = <code>87</code>; </li>
 *     <li> SubCategory: Loader  = <code>3</code>; </li>
 *     <li> Specific: CaterpillarModel924H  = <code>1</code>; </li>
 *     <li> Entity type uid: 26011; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3ba1308d. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ConstructionSpecialtyVehicle
 * @see SubCategory

 */
public final class CaterpillarModel924H extends EntityType
{
    /** Default constructor */
    public CaterpillarModel924H()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)87); // uid 26009, Construction Specialty Vehicle
        setSubCategory((byte)3); // uid 26010, Loader
        setSpecific((byte)1); // uid 26011, Caterpillar Model 924H
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CaterpillarModel924H createInstance()
    {
            return new CaterpillarModel924H();
    }
}
