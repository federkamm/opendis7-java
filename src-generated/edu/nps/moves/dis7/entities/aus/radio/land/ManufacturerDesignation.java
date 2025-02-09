// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.radio.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ManufacturerDesignation</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ManufacturerDesignation.createInstance()</code> or <code>new ManufacturerDesignation()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Radio = <code>7</code>; </li>
 *     <li> Category: Electronic Attack Systems = <code>50</code>; </li>
 *     <li> SubCategory: ManufacturerDesignation  = <code>2</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 31617; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@2cc61b3b. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#RADIO
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ElectronicAttackSystems
 * @see SubCategory

 */
public final class ManufacturerDesignation extends EntityType
{
    /** Default constructor */
    public ManufacturerDesignation()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.RADIO);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)50); // uid 31616, Electronic Attack Systems
        setSubCategory((byte)2); // uid 31617, Manufacturer Designation
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ManufacturerDesignation createInstance()
    {
            return new ManufacturerDesignation();
    }
}
