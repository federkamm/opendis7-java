// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.irn.munition.tactical;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Shahab3Mod3B</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Shahab3Mod3B.createInstance()</code> or <code>new Shahab3Mod3B()</code>. </p>
 * <ul>
 *     <li> Country: Iran (Islamic Republic of) (IRN) = <code>101</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>TACTICAL</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: Shahab3Mod3B  = <code>55</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 32481; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@78065fcd. </p>
 * @see Country#IRAN_ISLAMIC_REPUBLIC_OF_IRN
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class Shahab3Mod3B extends EntityType
{
    /** Default constructor */
    public Shahab3Mod3B()
    {
        setCountry(Country.IRAN_ISLAMIC_REPUBLIC_OF_IRN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.TACTICAL));

        setCategory((byte)1); // uid 32473, Guided
        setSubCategory((byte)55); // uid 32481, Shahab 3 Mod-3B
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Shahab3Mod3B createInstance()
    {
            return new Shahab3Mod3B();
    }
}
