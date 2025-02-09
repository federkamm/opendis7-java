// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AmurIIClassrepairship97</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AmurIIClassrepairship97.createInstance()</code> or <code>new AmurIIClassrepairship97()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: AmurIIClassrepairship  = <code>10</code>; </li>
 *     <li> Specific: _97  = <code>5</code>; </li>
 *     <li> Entity type uid: 13874; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5ac6c4f2. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class AmurIIClassrepairship97 extends EntityType
{
    /** Default constructor */
    public AmurIIClassrepairship97()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 13805, Auxiliary
        setSubCategory((byte)10); // uid 13869, Amur II Class (repair ship)
        setSpecific((byte)5); // uid 13874, 97
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AmurIIClassrepairship97 createInstance()
    {
            return new AmurIIClassrepairship97();
    }
}
