// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>F209RheinlandPfalz</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>F209RheinlandPfalz.createInstance()</code> or <code>new F209RheinlandPfalz()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate = <code>6</code>; </li>
 *     <li> SubCategory: BremenclassType122  = <code>2</code>; </li>
 *     <li> Specific: F209RheinlandPfalz  = <code>3</code>; </li>
 *     <li> Entity type uid: 16406; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@d41f816. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigate
 * @see SubCategory

 */
public final class F209RheinlandPfalz extends EntityType
{
    /** Default constructor */
    public F209RheinlandPfalz()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 16397, Guided Missile Frigate
        setSubCategory((byte)2); // uid 16403, Bremen class (Type 122)
        setSpecific((byte)3); // uid 16406, F 209 Rheinland-Pfalz
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static F209RheinlandPfalz createInstance()
    {
            return new F209RheinlandPfalz();
    }
}
