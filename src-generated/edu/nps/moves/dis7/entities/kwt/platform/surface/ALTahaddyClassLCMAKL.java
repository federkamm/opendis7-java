// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.kwt.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ALTahaddyClassLCMAKL</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ALTahaddyClassLCMAKL.createInstance()</code> or <code>new ALTahaddyClassLCMAKL()</code>. </p>
 * <ul>
 *     <li> Country: Kuwait (KWT) = <code>121</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: ALTahaddyClassLCMAKL  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 17928; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@13c612bd. </p>
 * @see Country#KUWAIT_KWT
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class ALTahaddyClassLCMAKL extends EntityType
{
    /** Default constructor */
    public ALTahaddyClassLCMAKL()
    {
        setCountry(Country.KUWAIT_KWT);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 17927, Auxiliary
        setSubCategory((byte)1); // uid 17928, AL Tahaddy Class (LCM/AKL)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ALTahaddyClassLCMAKL createInstance()
    {
            return new ALTahaddyClassLCMAKL();
    }
}
