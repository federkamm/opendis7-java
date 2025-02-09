// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_701KarachejevoCherkessia</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_701KarachejevoCherkessia.createInstance()</code> or <code>new _701KarachejevoCherkessia()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Hydrofoil = <code>14</code>; </li>
 *     <li> SubCategory: MatkaClass  = <code>3</code>; </li>
 *     <li> Specific: _701KarachejevoCherkessia  = <code>1</code>; </li>
 *     <li> Entity type uid: 27105; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7a2b1eb4. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Hydrofoil
 * @see SubCategory

 */
public final class _701KarachejevoCherkessia extends EntityType
{
    /** Default constructor */
    public _701KarachejevoCherkessia()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)14); // uid 13785, Hydrofoil
        setSubCategory((byte)3); // uid 13788, Matka Class
        setSpecific((byte)1); // uid 27105, 701 Karachejevo-Cherkessia
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _701KarachejevoCherkessia createInstance()
    {
            return new _701KarachejevoCherkessia();
    }
}
