// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>D602Suffren</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>D602Suffren.createInstance()</code> or <code>new D602Suffren()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Destroyer (Fregates or Escorteurs Descadres) = <code>4</code>; </li>
 *     <li> SubCategory: Suffrenclass  = <code>3</code>; </li>
 *     <li> Specific: D602Suffren  = <code>1</code>; </li>
 *     <li> Entity type uid: 15942; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@d2de489. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileDestroyerFregatesorEscorteursDescadres
 * @see SubCategory

 */
public final class D602Suffren extends EntityType
{
    /** Default constructor */
    public D602Suffren()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 15929, Guided Missile Destroyer (Fregates or Escorteurs Descadres)
        setSubCategory((byte)3); // uid 15941, Suffren class
        setSpecific((byte)1); // uid 15942, D 602 Suffren
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static D602Suffren createInstance()
    {
            return new D602Suffren();
    }
}
