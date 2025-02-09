// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>LowboyHeavyEquipmentTransporterChMZAP5247C</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>LowboyHeavyEquipmentTransporterChMZAP5247C.createInstance()</code> or <code>new LowboyHeavyEquipmentTransporterChMZAP5247C()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Heavy equipment transport trailer = <code>19</code>; </li>
 *     <li> SubCategory: LowboyHeavyEquipmentTransporterChMZAP5247C  = <code>2</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 13017; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5e1218b4. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Heavyequipmenttransporttrailer
 * @see SubCategory

 */
public final class LowboyHeavyEquipmentTransporterChMZAP5247C extends EntityType
{
    /** Default constructor */
    public LowboyHeavyEquipmentTransporterChMZAP5247C()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)19); // uid 13015, Heavy equipment transport trailer
        setSubCategory((byte)2); // uid 13017, Lowboy, Heavy Equipment, Transporter, ChMZAP-5247C
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static LowboyHeavyEquipmentTransporterChMZAP5247C createInstance()
    {
            return new LowboyHeavyEquipmentTransporterChMZAP5247C();
    }
}
