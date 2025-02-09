// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.space;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Fleetsatcom</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Fleetsatcom.createInstance()</code> or <code>new Fleetsatcom()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SPACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Unmanned = <code>2</code>; </li>
 *     <li> SubCategory: Communicationsatellite  = <code>1</code>; </li>
 *     <li> Specific: Fleetsatcom  = <code>3</code>; </li>
 *     <li> Entity type uid: 12435; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@51b87df7. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Unmanned
 * @see SubCategory

 */
public final class Fleetsatcom extends EntityType
{
    /** Default constructor */
    public Fleetsatcom()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SPACE));

        setCategory((byte)2); // uid 12431, Unmanned
        setSubCategory((byte)1); // uid 12432, Communication satellite
        setSpecific((byte)3); // uid 12435, Fleetsatcom
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Fleetsatcom createInstance()
    {
            return new Fleetsatcom();
    }
}
