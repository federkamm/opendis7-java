// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Y894BordeexH72</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Y894BordeexH72.createInstance()</code> or <code>new Y894BordeexH72()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Utility = <code>18</code>; </li>
 *     <li> SubCategory: Ohreclassaccommodationships  = <code>2</code>; </li>
 *     <li> Specific: Y894BordeexH72  = <code>5</code>; </li>
 *     <li> Entity type uid: 16693; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3e7dd664. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Utility
 * @see SubCategory

 */
public final class Y894BordeexH72 extends EntityType
{
    /** Default constructor */
    public Y894BordeexH72()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)18); // uid 16684, Utility
        setSubCategory((byte)2); // uid 16688, Ohre class (accommodation ships)
        setSpecific((byte)5); // uid 16693, Y 894 Borde (ex-H 72)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Y894BordeexH72 createInstance()
    {
            return new Y894BordeexH72();
    }
}
