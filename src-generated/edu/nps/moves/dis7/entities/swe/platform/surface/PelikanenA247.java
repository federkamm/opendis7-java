// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.swe.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>PelikanenA247</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>PelikanenA247.createInstance()</code> or <code>new PelikanenA247()</code>. </p>
 * <ul>
 *     <li> Country: Sweden (SWE) = <code>205</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: SpecialPurposeShips  = <code>4</code>; </li>
 *     <li> Specific: PelikanenA247  = <code>5</code>; </li>
 *     <li> Entity type uid: 26872; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@9b9a327. </p>
 * @see Country#SWEDEN_SWE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class PelikanenA247 extends EntityType
{
    /** Default constructor */
    public PelikanenA247()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 26855, Auxiliary
        setSubCategory((byte)4); // uid 26867, Special Purpose Ships
        setSpecific((byte)5); // uid 26872, Pelikanen (A247)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static PelikanenA247 createInstance()
    {
            return new PelikanenA247();
    }
}
