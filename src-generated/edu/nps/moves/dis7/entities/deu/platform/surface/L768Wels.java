// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>L768Wels</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>L768Wels.createInstance()</code> or <code>new L768Wels()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Landing Craft = <code>11</code>; </li>
 *     <li> SubCategory: Type520LCUs  = <code>2</code>; </li>
 *     <li> Specific: L768Wels  = <code>7</code>; </li>
 *     <li> Entity type uid: 16588; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1b955cac. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LandingCraft
 * @see SubCategory

 */
public final class L768Wels extends EntityType
{
    /** Default constructor */
    public L768Wels()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)11); // uid 16562, Landing Craft
        setSubCategory((byte)2); // uid 16581, Type 520 (LCUs)
        setSpecific((byte)7); // uid 16588, L 768 Wels
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static L768Wels createInstance()
    {
            return new L768Wels();
    }
}
