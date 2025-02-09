// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>RaytheonPilatusPC9MkIIBeechMkII</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>RaytheonPilatusPC9MkIIBeechMkII.createInstance()</code> or <code>new RaytheonPilatusPC9MkIIBeechMkII()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Attack/Strike = <code>2</code>; </li>
 *     <li> SubCategory: RaytheonPilatusPC9MkIIBeechMkII  = <code>13</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 28704; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@25b38203. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AttackStrike
 * @see SubCategory

 */
public final class RaytheonPilatusPC9MkIIBeechMkII extends EntityType
{
    /** Default constructor */
    public RaytheonPilatusPC9MkIIBeechMkII()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)2); // uid 10824, Attack/Strike
        setSubCategory((byte)13); // uid 28704, Raytheon / Pilatus PC-9 Mk II (Beech Mk II)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static RaytheonPilatusPC9MkIIBeechMkII createInstance()
    {
            return new RaytheonPilatusPC9MkIIBeechMkII();
    }
}
