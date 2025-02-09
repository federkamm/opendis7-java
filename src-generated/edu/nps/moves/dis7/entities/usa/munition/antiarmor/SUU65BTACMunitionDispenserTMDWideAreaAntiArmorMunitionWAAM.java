// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SUU65BTACMunitionDispenserTMDWideAreaAntiArmorMunitionWAAM</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SUU65BTACMunitionDispenserTMDWideAreaAntiArmorMunitionWAAM.createInstance()</code> or <code>new SUU65BTACMunitionDispenserTMDWideAreaAntiArmorMunitionWAAM()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_ARMOR</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: SUU65BTACMunitionDispenserTMDWideAreaAntiArmorMunitionWAAM  = <code>51</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 19649; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@8af1c49. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class SUU65BTACMunitionDispenserTMDWideAreaAntiArmorMunitionWAAM extends EntityType
{
    /** Default constructor */
    public SUU65BTACMunitionDispenserTMDWideAreaAntiArmorMunitionWAAM()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)2); // uid 19553, Ballistic
        setSubCategory((byte)51); // uid 19649, SUU-65/B TAC Munition Dispenser (TMD) Wide Area Anti-Armor Munition (WAAM)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SUU65BTACMunitionDispenserTMDWideAreaAntiArmorMunitionWAAM createInstance()
    {
            return new SUU65BTACMunitionDispenserTMDWideAreaAntiArmorMunitionWAAM();
    }
}
