// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SB131NikolaiChiker</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SB131NikolaiChiker.createInstance()</code> or <code>new SB131NikolaiChiker()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Utility = <code>18</code>; </li>
 *     <li> SubCategory: Baklazhanclasstugs  = <code>8</code>; </li>
 *     <li> Specific: SB131NikolaiChiker  = <code>1</code>; </li>
 *     <li> Entity type uid: 14632; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4110765e. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Utility
 * @see SubCategory

 */
public final class SB131NikolaiChiker extends EntityType
{
    /** Default constructor */
    public SB131NikolaiChiker()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)18); // uid 14570, Utility
        setSubCategory((byte)8); // uid 14631, Baklazhan class (tugs)
        setSpecific((byte)1); // uid 14632, SB 131 Nikolai Chiker
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SB131NikolaiChiker createInstance()
    {
            return new SB131NikolaiChiker();
    }
}
