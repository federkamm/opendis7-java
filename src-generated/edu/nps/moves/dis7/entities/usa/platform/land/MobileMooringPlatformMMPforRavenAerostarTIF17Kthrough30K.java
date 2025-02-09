// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MobileMooringPlatformMMPforRavenAerostarTIF17Kthrough30K</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MobileMooringPlatformMMPforRavenAerostarTIF17Kthrough30K.createInstance()</code> or <code>new MobileMooringPlatformMMPforRavenAerostarTIF17Kthrough30K()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Trailer = <code>89</code>; </li>
 *     <li> SubCategory: TrailerAerostatMooringPlatform  = <code>23</code>; </li>
 *     <li> Specific: MobileMooringPlatformMMPforRavenAerostarTIF17Kthrough30K  = <code>1</code>; </li>
 *     <li> Entity type uid: 26939; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@59c500f7. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Trailer
 * @see SubCategory

 */
public final class MobileMooringPlatformMMPforRavenAerostarTIF17Kthrough30K extends EntityType
{
    /** Default constructor */
    public MobileMooringPlatformMMPforRavenAerostarTIF17Kthrough30K()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)89); // uid 26937, Trailer
        setSubCategory((byte)23); // uid 26938, Trailer, Aerostat Mooring Platform
        setSpecific((byte)1); // uid 26939, Mobile Mooring Platform (MMP) for Raven Aerostar TIF-(17K through 30K)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MobileMooringPlatformMMPforRavenAerostarTIF17Kthrough30K createInstance()
    {
            return new MobileMooringPlatformMMPforRavenAerostarTIF17Kthrough30K();
    }
}
