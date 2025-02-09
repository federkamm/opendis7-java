// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ManPortableAirDefenseSystemMANPADS</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ManPortableAirDefenseSystemMANPADS.createInstance()</code> or <code>new ManPortableAirDefenseSystemMANPADS()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Life form = <code>3</code>; </li>
 *     <li> Category: Australian Army = <code>11</code>; </li>
 *     <li> SubCategory: ManPortableAirDefenseSystemMANPADS  = <code>85</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 31511; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@4fea5ee0. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#LIFE_FORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AustralianArmy
 * @see SubCategory

 */
public final class ManPortableAirDefenseSystemMANPADS extends EntityType
{
    /** Default constructor */
    public ManPortableAirDefenseSystemMANPADS()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)11); // uid 31462, Australian Army
        setSubCategory((byte)85); // uid 31511, Man-Portable Air Defense System (MANPADS)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ManPortableAirDefenseSystemMANPADS createInstance()
    {
            return new ManPortableAirDefenseSystemMANPADS();
    }
}
