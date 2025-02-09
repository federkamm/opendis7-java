// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.supply.class12slingloadsnondoctrinal;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SlingLoadHMMWVM1043SingleHook</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SlingLoadHMMWVM1043SingleHook.createInstance()</code> or <code>new SlingLoadHMMWVM1043SingleHook()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: SupplyDomain = <code>CLASS_12_SLING_LOADS_NON_DOCTRINAL</code>; </li>
 *     <li> Domain: Supply = <code>6</code>; </li>
 *     <li> Category: Sling Load, Vehicles = <code>5</code>; </li>
 *     <li> SubCategory: SlingLoadHighMobilityMultipurposeWheeledVehicleHMMWV  = <code>1</code>; </li>
 *     <li> Specific: SlingLoadHMMWVM1043SingleHook  = <code>3</code>; </li>
 *     <li> Entity type uid: 30833; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@57b33c29. </p>
 * @see Country#OTHER
 * @see EntityKind#SUPPLY
 * @see Domain
 * @see SupplyDomain
 * @see Category
 * @see SlingLoadVehicles
 * @see SubCategory

 */
public final class SlingLoadHMMWVM1043SingleHook extends EntityType
{
    /** Default constructor */
    public SlingLoadHMMWVM1043SingleHook()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_12_SLING_LOADS_NON_DOCTRINAL));

        setCategory((byte)5); // uid 30829, Sling Load, Vehicles
        setSubCategory((byte)1); // uid 30830, Sling Load, High Mobility Multipurpose Wheeled Vehicle (HMMWV)
        setSpecific((byte)3); // uid 30833, Sling Load, HMMWV, M1043, Single Hook
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SlingLoadHMMWVM1043SingleHook createInstance()
    {
            return new SlingLoadHMMWVM1043SingleHook();
    }
}
