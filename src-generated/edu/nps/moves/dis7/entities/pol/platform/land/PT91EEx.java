// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.pol.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>PT91EEx</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>PT91EEx.createInstance()</code> or <code>new PT91EEx()</code>. </p>
 * <ul>
 *     <li> Country: Poland (POL) = <code>175</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Tank = <code>1</code>; </li>
 *     <li> SubCategory: PT91TwardyMainBattleTank  = <code>1</code>; </li>
 *     <li> Specific: PT91EEx  = <code>5</code>; </li>
 *     <li> Entity type uid: 25546; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3028e50e. </p>
 * @see Country#POLAND_POL
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Tank
 * @see SubCategory

 */
public final class PT91EEx extends EntityType
{
    /** Default constructor */
    public PT91EEx()
    {
        setCountry(Country.POLAND_POL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)1); // uid 25540, Tank
        setSubCategory((byte)1); // uid 25541, PT-91 Twardy Main Battle Tank
        setSpecific((byte)5); // uid 25546, PT-91E/Ex
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static PT91EEx createInstance()
    {
            return new PT91EEx();
    }
}
