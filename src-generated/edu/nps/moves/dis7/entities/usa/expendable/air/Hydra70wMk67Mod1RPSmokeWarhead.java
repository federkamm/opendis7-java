// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.expendable.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Hydra70wMk67Mod1RPSmokeWarhead</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Hydra70wMk67Mod1RPSmokeWarhead.createInstance()</code> or <code>new Hydra70wMk67Mod1RPSmokeWarhead()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Expendable = <code>8</code>; </li>
 *     <li> Category: Smoke Generator = <code>8</code>; </li>
 *     <li> SubCategory: TargetSpotMarker  = <code>2</code>; </li>
 *     <li> Specific: Hydra70wMk67Mod1RPSmokeWarhead  = <code>3</code>; </li>
 *     <li> Entity type uid: 24990; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3dec79f8. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#EXPENDABLE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SmokeGenerator
 * @see SubCategory

 */
public final class Hydra70wMk67Mod1RPSmokeWarhead extends EntityType
{
    /** Default constructor */
    public Hydra70wMk67Mod1RPSmokeWarhead()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)8); // uid 24983, Smoke Generator
        setSubCategory((byte)2); // uid 24987, Target/Spot Marker
        setSpecific((byte)3); // uid 24990, Hydra 70 w/ Mk 67 Mod 1 RP Smoke Warhead
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Hydra70wMk67Mod1RPSmokeWarhead createInstance()
    {
            return new Hydra70wMk67Mod1RPSmokeWarhead();
    }
}
