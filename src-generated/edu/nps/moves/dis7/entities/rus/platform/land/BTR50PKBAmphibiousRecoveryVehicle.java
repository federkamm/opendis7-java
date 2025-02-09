// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>BTR50PKBAmphibiousRecoveryVehicle</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>BTR50PKBAmphibiousRecoveryVehicle.createInstance()</code> or <code>new BTR50PKBAmphibiousRecoveryVehicle()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Armored Utility Vehicle = <code>3</code>; </li>
 *     <li> SubCategory: BTR50PKBAmphibiousRecoveryVehicle  = <code>14</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 12742; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@7f9ab969. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ArmoredUtilityVehicle
 * @see SubCategory

 */
public final class BTR50PKBAmphibiousRecoveryVehicle extends EntityType
{
    /** Default constructor */
    public BTR50PKBAmphibiousRecoveryVehicle()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)3); // uid 12727, Armored Utility Vehicle
        setSubCategory((byte)14); // uid 12742, BTR-50PK(B) Amphibious Recovery Vehicle
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static BTR50PKBAmphibiousRecoveryVehicle createInstance()
    {
            return new BTR50PKBAmphibiousRecoveryVehicle();
    }
}
