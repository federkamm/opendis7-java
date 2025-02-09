// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.jpn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>DDH182Ise</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>DDH182Ise.createInstance()</code> or <code>new DDH182Ise()</code>. </p>
 * <ul>
 *     <li> Country: Japan (JPN) = <code>110</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Cruiser/Helicopter Carrier = <code>13</code>; </li>
 *     <li> SubCategory: HyugaClassHelicopterDestroyer  = <code>1</code>; </li>
 *     <li> Specific: DDH182Ise  = <code>2</code>; </li>
 *     <li> Entity type uid: 28701; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@780ec4a5. </p>
 * @see Country#JAPAN_JPN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CruiserHelicopterCarrier
 * @see SubCategory

 */
public final class DDH182Ise extends EntityType
{
    /** Default constructor */
    public DDH182Ise()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)13); // uid 28698, Cruiser/Helicopter Carrier
        setSubCategory((byte)1); // uid 28699, Hyuga Class Helicopter Destroyer
        setSpecific((byte)2); // uid 28701, DDH-182 Ise
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static DDH182Ise createInstance()
    {
            return new DDH182Ise();
    }
}
