// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>HOT2MP</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HOT2MP.createInstance()</code> or <code>new HOT2MP()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_ARMOR</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: HOTmissile  = <code>3</code>; </li>
 *     <li> Specific: HOT2MP  = <code>4</code>; </li>
 *     <li> Entity type uid: 23956; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@55222ee9. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class HOT2MP extends EntityType
{
    /** Default constructor */
    public HOT2MP()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)1); // uid 21055, Guided
        setSubCategory((byte)3); // uid 21058, HOT missile
        setSpecific((byte)4); // uid 23956, HOT 2MP
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HOT2MP createInstance()
    {
            return new HOT2MP();
    }
}
