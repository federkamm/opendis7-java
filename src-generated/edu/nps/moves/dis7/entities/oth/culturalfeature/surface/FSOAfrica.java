// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>FSOAfrica</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>FSOAfrica.createInstance()</code> or <code>new FSOAfrica()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Oil Platform = <code>1</code>; </li>
 *     <li> SubCategory: OilPlatformFloatingProductionStorageandOffloadingFPSO  = <code>6</code>; </li>
 *     <li> Specific: FSOAfrica  = <code>4</code>; </li>
 *     <li> Entity type uid: 33029; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@14239223. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see OilPlatform
 * @see SubCategory

 */
public final class FSOAfrica extends EntityType
{
    /** Default constructor */
    public FSOAfrica()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)1); // uid 22124, Oil Platform
        setSubCategory((byte)6); // uid 25249, Oil Platform, Floating Production, Storage, and Offloading (FPSO)
        setSpecific((byte)4); // uid 33029, FSO Africa
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static FSOAfrica createInstance()
    {
            return new FSOAfrica();
    }
}
