// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.supply.class7majoritems;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>HawkPylon</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HawkPylon.createInstance()</code> or <code>new HawkPylon()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: SupplyDomain = <code>CLASS_7_MAJOR_ITEMS</code>; </li>
 *     <li> Domain: Supply = <code>6</code>; </li>
 *     <li> Category: J - Racks, Adaptors, Pylons = <code>6</code>; </li>
 *     <li> SubCategory: Pylon  = <code>3</code>; </li>
 *     <li> Specific: HawkPylon  = <code>4</code>; </li>
 *     <li> Entity type uid: 30743; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@69de72ec. </p>
 * @see Country#OTHER
 * @see EntityKind#SUPPLY
 * @see Domain
 * @see SupplyDomain
 * @see Category
 * @see JRacksAdaptorsPylons
 * @see SubCategory

 */
public final class HawkPylon extends EntityType
{
    /** Default constructor */
    public HawkPylon()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_7_MAJOR_ITEMS));

        setCategory((byte)6); // uid 30698, J - Racks, Adaptors, Pylons
        setSubCategory((byte)3); // uid 30739, Pylon
        setSpecific((byte)4); // uid 30743, Hawk Pylon
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HawkPylon createInstance()
    {
            return new HawkPylon();
    }
}
