// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.afg.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TerroristCombatantTeenagerMaleUnarmed</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TerroristCombatantTeenagerMaleUnarmed.createInstance()</code> or <code>new TerroristCombatantTeenagerMaleUnarmed()</code>. </p>
 * <ul>
 *     <li> Country: Afghanistan (AFG) = <code>1</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Life form = <code>3</code>; </li>
 *     <li> Category: Terrorist Combatant = <code>101</code>; </li>
 *     <li> SubCategory: None  = <code>0</code>; </li>
 *     <li> Specific: TerroristCombatantUnarmed  = <code>0</code>; </li>
 *     <li> Entity type uid: 32754; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@a55e82a. </p>
 * @see Country#AFGHANISTAN_AFG
 * @see EntityKind#LIFE_FORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see TerroristCombatant
 * @see SubCategory

 */
public final class TerroristCombatantTeenagerMaleUnarmed extends EntityType
{
    /** Default constructor */
    public TerroristCombatantTeenagerMaleUnarmed()
    {
        setCountry(Country.AFGHANISTAN_AFG);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)101); // uid 32204, Terrorist Combatant
        setSubCategory((byte)0); // uid 32752, None
        setSpecific((byte)0); // uid 32753, Terrorist Combatant, Unarmed
        setExtra((byte)50); // uid 32754, Terrorist Combatant Teenager, Male (Unarmed)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TerroristCombatantTeenagerMaleUnarmed createInstance()
    {
            return new TerroristCombatantTeenagerMaleUnarmed();
    }
}
