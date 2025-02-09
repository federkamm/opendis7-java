// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.expendable.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ADM141Bchaffdispensing</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ADM141Bchaffdispensing.createInstance()</code> or <code>new ADM141Bchaffdispensing()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Expendable = <code>8</code>; </li>
 *     <li> Category: Winged Decoy = <code>6</code>; </li>
 *     <li> SubCategory: TacticalAirLaunchedDecoy  = <code>1</code>; </li>
 *     <li> Specific: ADM141Bchaffdispensing  = <code>4</code>; </li>
 *     <li> Entity type uid: 22262; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@117fb9ba. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#EXPENDABLE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see WingedDecoy
 * @see SubCategory

 */
public final class ADM141Bchaffdispensing extends EntityType
{
    /** Default constructor */
    public ADM141Bchaffdispensing()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)6); // uid 22257, Winged Decoy
        setSubCategory((byte)1); // uid 22258, Tactical Air-Launched Decoy
        setSpecific((byte)4); // uid 22262, ADM-141B chaff-dispensing
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ADM141Bchaffdispensing createInstance()
    {
            return new ADM141Bchaffdispensing();
    }
}
