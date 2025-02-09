// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.swe.munition.antisubmarine;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TP451</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TP451.createInstance()</code> or <code>new TP451()</code>. </p>
 * <ul>
 *     <li> Country: Sweden (SWE) = <code>205</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_SUBMARINE</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: Torpedo45Tp45  = <code>3</code>; </li>
 *     <li> Specific: TP451  = <code>1</code>; </li>
 *     <li> Entity type uid: 29566; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@770cae59. </p>
 * @see Country#SWEDEN_SWE
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class TP451 extends EntityType
{
    /** Default constructor */
    public TP451()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SUBMARINE));

        setCategory((byte)1); // uid 27010, Guided
        setSubCategory((byte)3); // uid 27021, Torpedo 45 (Tp 45)
        setSpecific((byte)1); // uid 29566, TP 451
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TP451 createInstance()
    {
            return new TP451();
    }
}
