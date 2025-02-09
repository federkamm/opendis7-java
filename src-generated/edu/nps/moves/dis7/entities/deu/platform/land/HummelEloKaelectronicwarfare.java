// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>HummelEloKaelectronicwarfare</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HummelEloKaelectronicwarfare.createInstance()</code> or <code>new HummelEloKaelectronicwarfare()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Armored Utility Vehicle = <code>3</code>; </li>
 *     <li> SubCategory: Transportpanzer1Fuchs  = <code>8</code>; </li>
 *     <li> Specific: HummelEloKaelectronicwarfare  = <code>3</code>; </li>
 *     <li> Entity type uid: 22741; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6c61a903. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ArmoredUtilityVehicle
 * @see SubCategory

 */
public final class HummelEloKaelectronicwarfare extends EntityType
{
    /** Default constructor */
    public HummelEloKaelectronicwarfare()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)3); // uid 16263, Armored Utility Vehicle
        setSubCategory((byte)8); // uid 16271, Transportpanzer 1 Fuchs
        setSpecific((byte)3); // uid 22741, Hummel EloKa electronic warfare
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HummelEloKaelectronicwarfare createInstance()
    {
            return new HummelEloKaelectronicwarfare();
    }
}
