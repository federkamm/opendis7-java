// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ser.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SpasilacClassASR</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SpasilacClassASR.createInstance()</code> or <code>new SpasilacClassASR()</code>. </p>
 * <ul>
 *     <li> Country: Serbia and Montenegro = <code>240</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: SpasilacClassASR  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 19084; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@2f84acf7. </p>
 * @see Country#SERBIA_AND_MONTENEGRO
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class SpasilacClassASR extends EntityType
{
    /** Default constructor */
    public SpasilacClassASR()
    {
        setCountry(Country.SERBIA_AND_MONTENEGRO);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 19083, Auxiliary
        setSubCategory((byte)1); // uid 19084, Spasilac Class (ASR)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SpasilacClassASR createInstance()
    {
            return new SpasilacClassASR();
    }
}
