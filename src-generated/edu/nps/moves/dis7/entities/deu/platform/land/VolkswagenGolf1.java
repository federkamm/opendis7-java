// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>VolkswagenGolf1</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>VolkswagenGolf1.createInstance()</code> or <code>new VolkswagenGolf1()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Car = <code>81</code>; </li>
 *     <li> SubCategory: _5DoorHatchbackEconomyCompactSmall  = <code>52</code>; </li>
 *     <li> Specific: VolkswagenGolf  = <code>1</code>; </li>
 *     <li> Entity type uid: 25279; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@41005828. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Car
 * @see SubCategory

 */
public final class VolkswagenGolf1 extends EntityType
{
    /** Default constructor */
    public VolkswagenGolf1()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)81); // uid 24838, Car
        setSubCategory((byte)52); // uid 25278, 5-Door Hatchback, Economy/Compact (Small)
        setSpecific((byte)1); // uid 25279, Volkswagen Golf
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static VolkswagenGolf1 createInstance()
    {
            return new VolkswagenGolf1();
    }
}
