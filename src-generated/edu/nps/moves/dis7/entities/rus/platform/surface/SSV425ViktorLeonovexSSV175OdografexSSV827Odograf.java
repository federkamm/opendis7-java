// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SSV425ViktorLeonovexSSV175OdografexSSV827Odograf</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SSV425ViktorLeonovexSSV175OdografexSSV827Odograf.createInstance()</code> or <code>new SSV425ViktorLeonovexSSV175OdografexSSV827Odograf()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: VishnyaclassAGIs  = <code>14</code>; </li>
 *     <li> Specific: SSV425ViktorLeonovexSSV175OdografexSSV827Odograf  = <code>2</code>; </li>
 *     <li> Entity type uid: 13903; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4e1459ea. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class SSV425ViktorLeonovexSSV175OdografexSSV827Odograf extends EntityType
{
    /** Default constructor */
    public SSV425ViktorLeonovexSSV175OdografexSSV827Odograf()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 13805, Auxiliary
        setSubCategory((byte)14); // uid 13901, Vishnya class (AGIs)
        setSpecific((byte)2); // uid 13903, SSV 425 Viktor Leonov (ex-SSV 175 Odograf, ex-SSV 827 Odograf)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SSV425ViktorLeonovexSSV175OdografexSSV827Odograf createInstance()
    {
            return new SSV425ViktorLeonovexSSV175OdografexSSV827Odograf();
    }
}
