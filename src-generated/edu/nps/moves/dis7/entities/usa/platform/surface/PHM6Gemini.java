// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>PHM6Gemini</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>PHM6Gemini.createInstance()</code> or <code>new PHM6Gemini()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Hydrofoil = <code>14</code>; </li>
 *     <li> SubCategory: Pegasusclass  = <code>1</code>; </li>
 *     <li> Specific: PHM6Gemini  = <code>6</code>; </li>
 *     <li> Entity type uid: 11700; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6bce313. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Hydrofoil
 * @see SubCategory

 */
public final class PHM6Gemini extends EntityType
{
    /** Default constructor */
    public PHM6Gemini()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)14); // uid 11693, Hydrofoil
        setSubCategory((byte)1); // uid 11694, Pegasus class
        setSpecific((byte)6); // uid 11700, PHM 6 Gemini
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static PHM6Gemini createInstance()
    {
            return new PHM6Gemini();
    }
}
