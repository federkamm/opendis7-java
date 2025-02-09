// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.swe.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>URF</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>URF.createInstance()</code> or <code>new URF()</code>. </p>
 * <ul>
 *     <li> Country: Sweden (SWE) = <code>205</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SSA (Conventional Auxiliary) = <code>7</code>; </li>
 *     <li> SubCategory: SubmarineRescueVessel  = <code>1</code>; </li>
 *     <li> Specific: URF  = <code>1</code>; </li>
 *     <li> Entity type uid: 27299; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6f231ced. </p>
 * @see Country#SWEDEN_SWE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSAConventionalAuxiliary
 * @see SubCategory

 */
public final class URF extends EntityType
{
    /** Default constructor */
    public URF()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)7); // uid 27297, SSA (Conventional Auxiliary)
        setSubCategory((byte)1); // uid 27298, Submarine Rescue Vessel
        setSpecific((byte)1); // uid 27299, URF
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static URF createInstance()
    {
            return new URF();
    }
}
