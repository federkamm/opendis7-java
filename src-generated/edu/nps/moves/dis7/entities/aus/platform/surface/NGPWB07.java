// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>NGPWB07</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>NGPWB07.createInstance()</code> or <code>new NGPWB07()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Utility = <code>18</code>; </li>
 *     <li> SubCategory: Steber43NavalGeneralPurposeWorkboats  = <code>1</code>; </li>
 *     <li> Specific: NGPWB07  = <code>7</code>; </li>
 *     <li> Entity type uid: 29935; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7ca48474. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Utility
 * @see SubCategory

 */
public final class NGPWB07 extends EntityType
{
    /** Default constructor */
    public NGPWB07()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)18); // uid 29927, Utility
        setSubCategory((byte)1); // uid 29928, Steber 43 Naval General Purpose Workboats
        setSpecific((byte)7); // uid 29935, NGPWB 07
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static NGPWB07 createInstance()
    {
            return new NGPWB07();
    }
}
