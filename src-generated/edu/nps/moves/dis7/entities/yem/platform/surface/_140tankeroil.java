// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.yem.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_140tankeroil</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_140tankeroil.createInstance()</code> or <code>new _140tankeroil()</code>. </p>
 * <ul>
 *     <li> Country: Yemen (YEM) = <code>237</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: ToplivoClass  = <code>1</code>; </li>
 *     <li> Specific: _140tankeroil  = <code>2</code>; </li>
 *     <li> Entity type uid: 18748; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2f04993d. </p>
 * @see Country#YEMEN_YEM
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class _140tankeroil extends EntityType
{
    /** Default constructor */
    public _140tankeroil()
    {
        setCountry(Country.YEMEN_YEM);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 18745, Auxiliary
        setSubCategory((byte)1); // uid 18746, Toplivo Class
        setSpecific((byte)2); // uid 18748, 140 (tanker-oil)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _140tankeroil createInstance()
    {
            return new _140tankeroil();
    }
}
