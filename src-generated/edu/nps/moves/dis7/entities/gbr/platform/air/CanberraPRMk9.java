// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.gbr.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CanberraPRMk9</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CanberraPRMk9.createInstance()</code> or <code>new CanberraPRMk9()</code>. </p>
 * <ul>
 *     <li> Country: United Kingdom of Great Britain and Northern Ireland (GBR) = <code>224</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Reconnaissance = <code>7</code>; </li>
 *     <li> SubCategory: EnglishElectricCanberra  = <code>1</code>; </li>
 *     <li> Specific: CanberraPRMk9  = <code>2</code>; </li>
 *     <li> Entity type uid: 15067; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@109f8c7e. </p>
 * @see Country#UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Reconnaissance
 * @see SubCategory

 */
public final class CanberraPRMk9 extends EntityType
{
    /** Default constructor */
    public CanberraPRMk9()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)7); // uid 15064, Reconnaissance
        setSubCategory((byte)1); // uid 15065, English Electric Canberra
        setSpecific((byte)2); // uid 15067, Canberra PR Mk 9
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CanberraPRMk9 createInstance()
    {
            return new CanberraPRMk9();
    }
}
