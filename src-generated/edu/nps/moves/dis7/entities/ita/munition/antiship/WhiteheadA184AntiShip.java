// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ita.munition.antiship;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>WhiteheadA184AntiShip</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>WhiteheadA184AntiShip.createInstance()</code> or <code>new WhiteheadA184AntiShip()</code>. </p>
 * <ul>
 *     <li> Country: Italy (ITA) = <code>106</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_SHIP</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: _533mmTorpedo  = <code>6</code>; </li>
 *     <li> Specific: WhiteheadA184AntiShip  = <code>1</code>; </li>
 *     <li> Entity type uid: 31028; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5bb2fb2b. </p>
 * @see Country#ITALY_ITA
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class WhiteheadA184AntiShip extends EntityType
{
    /** Default constructor */
    public WhiteheadA184AntiShip()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SHIP));

        setCategory((byte)1); // uid 21670, Guided
        setSubCategory((byte)6); // uid 31027, 533 mm Torpedo
        setSpecific((byte)1); // uid 31028, Whitehead A184 - Anti-Ship
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static WhiteheadA184AntiShip createInstance()
    {
            return new WhiteheadA184AntiShip();
    }
}
