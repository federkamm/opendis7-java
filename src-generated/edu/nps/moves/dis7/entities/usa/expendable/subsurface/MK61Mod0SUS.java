// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.expendable.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MK61Mod0SUS</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MK61Mod0SUS.createInstance()</code> or <code>new MK61Mod0SUS()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Expendable = <code>8</code>; </li>
 *     <li> Category: Signal = <code>7</code>; </li>
 *     <li> SubCategory: PyrotechnicSUSSignalUnderwaterSound  = <code>1</code>; </li>
 *     <li> Specific: MK61Mod0SUS  = <code>1</code>; </li>
 *     <li> Entity type uid: 25003; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@27fc0217. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#EXPENDABLE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Signal
 * @see SubCategory

 */
public final class MK61Mod0SUS extends EntityType
{
    /** Default constructor */
    public MK61Mod0SUS()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)7); // uid 25001, Signal
        setSubCategory((byte)1); // uid 25002, Pyrotechnic SUS (Signal Underwater Sound)
        setSpecific((byte)1); // uid 25003, MK 61 Mod 0 SUS
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MK61Mod0SUS createInstance()
    {
            return new MK61Mod0SUS();
    }
}
