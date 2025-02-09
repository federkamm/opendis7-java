// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.sgp.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>GCGuangzhou</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>GCGuangzhou.createInstance()</code> or <code>new GCGuangzhou()</code>. </p>
 * <ul>
 *     <li> Country: Singapore (SGP) = <code>193</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Tanker (Group 3 Merchant) = <code>82</code>; </li>
 *     <li> SubCategory: CrudeOilTankerupto159999DWT  = <code>5</code>; </li>
 *     <li> Specific: GCGuangzhou  = <code>1</code>; </li>
 *     <li> Entity type uid: 24554; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3c83468e. </p>
 * @see Country#SINGAPORE_SGP
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see TankerGroup3Merchant
 * @see SubCategory

 */
public final class GCGuangzhou extends EntityType
{
    /** Default constructor */
    public GCGuangzhou()
    {
        setCountry(Country.SINGAPORE_SGP);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)82); // uid 24550, Tanker (Group 3 Merchant)
        setSubCategory((byte)5); // uid 24553, Crude Oil Tanker (up to 159,999 DWT)
        setSpecific((byte)1); // uid 24554, GC Guangzhou
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static GCGuangzhou createInstance()
    {
            return new GCGuangzhou();
    }
}
