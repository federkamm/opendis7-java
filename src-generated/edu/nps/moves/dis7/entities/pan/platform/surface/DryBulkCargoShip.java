// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.pan.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>DryBulkCargoShip</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>DryBulkCargoShip.createInstance()</code> or <code>new DryBulkCargoShip()</code>. </p>
 * <ul>
 *     <li> Country: Panama (PAN) = <code>168</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Dry Cargo Ship (Group 2 Merchant) = <code>81</code>; </li>
 *     <li> SubCategory: DryBulkCargoShip  = <code>2</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 24546; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@18324f97. </p>
 * @see Country#PANAMA_PAN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see DryCargoShipGroup2Merchant
 * @see SubCategory

 */
public final class DryBulkCargoShip extends EntityType
{
    /** Default constructor */
    public DryBulkCargoShip()
    {
        setCountry(Country.PANAMA_PAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)81); // uid 24545, Dry Cargo Ship (Group 2 Merchant)
        setSubCategory((byte)2); // uid 24546, Dry Bulk Cargo Ship
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static DryBulkCargoShip createInstance()
    {
            return new DryBulkCargoShip();
    }
}
