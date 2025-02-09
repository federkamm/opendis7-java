// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_81mmF2</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_81mmF2.createInstance()</code> or <code>new _81mmF2()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Life form = <code>3</code>; </li>
 *     <li> Category: Australian Army = <code>11</code>; </li>
 *     <li> SubCategory: Mortars  = <code>75</code>; </li>
 *     <li> Specific: _81mmF2  = <code>50</code>; </li>
 *     <li> Entity type uid: 31505; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7b3c2ae0. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#LIFE_FORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AustralianArmy
 * @see SubCategory

 */
public final class _81mmF2 extends EntityType
{
    /** Default constructor */
    public _81mmF2()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)11); // uid 31462, Australian Army
        setSubCategory((byte)75); // uid 31503, Mortars
        setSpecific((byte)50); // uid 31505, 81mm F2
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _81mmF2 createInstance()
    {
            return new _81mmF2();
    }
}
