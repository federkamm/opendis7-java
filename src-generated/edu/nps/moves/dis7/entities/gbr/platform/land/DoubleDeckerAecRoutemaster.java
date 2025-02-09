// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.gbr.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>DoubleDeckerAecRoutemaster</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>DoubleDeckerAecRoutemaster.createInstance()</code> or <code>new DoubleDeckerAecRoutemaster()</code>. </p>
 * <ul>
 *     <li> Country: United Kingdom of Great Britain and Northern Ireland (GBR) = <code>224</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Bus = <code>82</code>; </li>
 *     <li> SubCategory: DoubleDecker  = <code>4</code>; </li>
 *     <li> Specific: DoubleDeckerAecRoutemaster  = <code>1</code>; </li>
 *     <li> Entity type uid: 24910; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5583098b. </p>
 * @see Country#UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Bus
 * @see SubCategory

 */
public final class DoubleDeckerAecRoutemaster extends EntityType
{
    /** Default constructor */
    public DoubleDeckerAecRoutemaster()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)82); // uid 24908, Bus
        setSubCategory((byte)4); // uid 24909, Double Decker
        setSpecific((byte)1); // uid 24910, Double Decker, Aec Routemaster
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static DoubleDeckerAecRoutemaster createInstance()
    {
            return new DoubleDeckerAecRoutemaster();
    }
}
