// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>HaiYingclassoceanographicresearch</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HaiYingclassoceanographicresearch.createInstance()</code> or <code>new HaiYingclassoceanographicresearch()</code>. </p>
 * <ul>
 *     <li> Country: China, Peoples Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary, Merchant Marine = <code>17</code>; </li>
 *     <li> SubCategory: HaiYingclassoceanographicresearch  = <code>5</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 17379; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6b2ea799. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AuxiliaryMerchantMarine
 * @see SubCategory

 */
public final class HaiYingclassoceanographicresearch extends EntityType
{
    /** Default constructor */
    public HaiYingclassoceanographicresearch()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)17); // uid 17367, Auxiliary, Merchant Marine
        setSubCategory((byte)5); // uid 17379, Hai Ying class (oceanographic research)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HaiYingclassoceanographicresearch createInstance()
    {
            return new HaiYingclassoceanographicresearch();
    }
}
