// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>VOG17MHEFRAGSD</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>VOG17MHEFRAGSD.createInstance()</code> or <code>new VOG17MHEFRAGSD()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>BATTLEFIELD_SUPPORT</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _30mmgrenade  = <code>5</code>; </li>
 *     <li> Specific: VOG17MHEFRAGSD  = <code>3</code>; </li>
 *     <li> Entity type uid: 23746; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3dfe92ef. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class VOG17MHEFRAGSD extends EntityType
{
    /** Default constructor */
    public VOG17MHEFRAGSD()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 20785, Ballistic
        setSubCategory((byte)5); // uid 20797, 30 mm grenade
        setSpecific((byte)3); // uid 23746, VOG-17M, HE FRAG SD
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static VOG17MHEFRAGSD createInstance()
    {
            return new VOG17MHEFRAGSD();
    }
}
