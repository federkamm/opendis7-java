// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M90140mmmachinegun</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M90140mmmachinegun.createInstance()</code> or <code>new M90140mmmachinegun()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Other = <code>0</code>; </li>
 *     <li> SubCategory: Miscellaneousguns  = <code>1</code>; </li>
 *     <li> Specific: M90140mmmachinegun  = <code>1</code>; </li>
 *     <li> Entity type uid: 10003; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@fb0a08c. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Other
 * @see SubCategory

 */
public final class M90140mmmachinegun extends EntityType
{
    /** Default constructor */
    public M90140mmmachinegun()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)0); // uid 10001, Other
        setSubCategory((byte)1); // uid 10002, Miscellaneous guns
        setSpecific((byte)1); // uid 10003, M901 40-mm machine gun
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M90140mmmachinegun createInstance()
    {
            return new M90140mmmachinegun();
    }
}
