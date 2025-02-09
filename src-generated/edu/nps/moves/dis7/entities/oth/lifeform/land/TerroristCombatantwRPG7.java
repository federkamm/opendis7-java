// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TerroristCombatantwRPG7</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TerroristCombatantwRPG7.createInstance()</code> or <code>new TerroristCombatantwRPG7()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Life form = <code>3</code>; </li>
 *     <li> Category: Terrorist Combatant = <code>101</code>; </li>
 *     <li> SubCategory: AntiTankRockets  = <code>45</code>; </li>
 *     <li> Specific: TerroristCombatantwRPG7  = <code>110</code>; </li>
 *     <li> Entity type uid: 32726; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@77cd235b. </p>
 * @see Country#OTHER
 * @see EntityKind#LIFE_FORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see TerroristCombatant
 * @see SubCategory

 */
public final class TerroristCombatantwRPG7 extends EntityType
{
    /** Default constructor */
    public TerroristCombatantwRPG7()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)101); // uid 32719, Terrorist Combatant
        setSubCategory((byte)45); // uid 32725, Anti-Tank Rockets
        setSpecific((byte)110); // uid 32726, Terrorist Combatant w/ RPG-7
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TerroristCombatantwRPG7 createInstance()
    {
            return new TerroristCombatantwRPG7();
    }
}
