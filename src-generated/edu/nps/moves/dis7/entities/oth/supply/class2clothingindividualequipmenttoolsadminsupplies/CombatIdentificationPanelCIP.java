// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.supply.class2clothingindividualequipmenttoolsadminsupplies;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CombatIdentificationPanelCIP</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CombatIdentificationPanelCIP.createInstance()</code> or <code>new CombatIdentificationPanelCIP()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: SupplyDomain = <code>CLASS_2_CLOTHING_INDIVIDUAL_EQUIPMENT_TOOLS_ADMIN_SUPPLIES</code>; </li>
 *     <li> Domain: Supply = <code>6</code>; </li>
 *     <li> Category: B - Ground Support Materiel = <code>3</code>; </li>
 *     <li> SubCategory: CombatIdentificationPanelCIP  = <code>3</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 30670; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@71734463. </p>
 * @see Country#OTHER
 * @see EntityKind#SUPPLY
 * @see Domain
 * @see SupplyDomain
 * @see Category
 * @see BGroundSupportMateriel
 * @see SubCategory

 */
public final class CombatIdentificationPanelCIP extends EntityType
{
    /** Default constructor */
    public CombatIdentificationPanelCIP()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_2_CLOTHING_INDIVIDUAL_EQUIPMENT_TOOLS_ADMIN_SUPPLIES));

        setCategory((byte)3); // uid 30659, B - Ground Support Materiel
        setSubCategory((byte)3); // uid 30670, Combat Identification Panel (CIP)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CombatIdentificationPanelCIP createInstance()
    {
            return new CombatIdentificationPanelCIP();
    }
}
