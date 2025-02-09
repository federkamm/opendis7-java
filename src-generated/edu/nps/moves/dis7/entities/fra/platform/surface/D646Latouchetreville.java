// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>D646Latouchetreville</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>D646Latouchetreville.createInstance()</code> or <code>new D646Latouchetreville()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Destroyer (Fregates or Escorteurs Descadres) = <code>4</code>; </li>
 *     <li> SubCategory: GeorgesLeyguesClassTypef70ASW  = <code>1</code>; </li>
 *     <li> Specific: D646Latouchetreville  = <code>7</code>; </li>
 *     <li> Entity type uid: 15937; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5dafbe45. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileDestroyerFregatesorEscorteursDescadres
 * @see SubCategory

 */
public final class D646Latouchetreville extends EntityType
{
    /** Default constructor */
    public D646Latouchetreville()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 15929, Guided Missile Destroyer (Fregates or Escorteurs Descadres)
        setSubCategory((byte)1); // uid 15930, Georges Leygues Class (Type f 70 (ASW))
        setSpecific((byte)7); // uid 15937, D 646 Latouche-treville
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static D646Latouchetreville createInstance()
    {
            return new D646Latouchetreville();
    }
}
