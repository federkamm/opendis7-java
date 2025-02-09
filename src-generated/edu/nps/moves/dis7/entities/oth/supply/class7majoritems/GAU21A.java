// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.supply.class7majoritems;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>GAU21A</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>GAU21A.createInstance()</code> or <code>new GAU21A()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: SupplyDomain = <code>CLASS_7_MAJOR_ITEMS</code>; </li>
 *     <li> Domain: Supply = <code>6</code>; </li>
 *     <li> Category: M - Weapons = <code>9</code>; </li>
 *     <li> SubCategory: _127mm50caliber  = <code>4</code>; </li>
 *     <li> Specific: GAU21A  = <code>5</code>; </li>
 *     <li> Entity type uid: 30634; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7d17906. </p>
 * @see Country#OTHER
 * @see EntityKind#SUPPLY
 * @see Domain
 * @see SupplyDomain
 * @see Category
 * @see MWeapons
 * @see SubCategory

 */
public final class GAU21A extends EntityType
{
    /** Default constructor */
    public GAU21A()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_7_MAJOR_ITEMS));

        setCategory((byte)9); // uid 30622, M - Weapons
        setSubCategory((byte)4); // uid 30629, 12.7 mm/.50 caliber
        setSpecific((byte)5); // uid 30634, GAU-21/A
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static GAU21A createInstance()
    {
            return new GAU21A();
    }
}
