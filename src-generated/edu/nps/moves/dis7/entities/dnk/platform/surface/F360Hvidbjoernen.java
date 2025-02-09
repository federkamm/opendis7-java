// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.dnk.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>F360Hvidbjoernen</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>F360Hvidbjoernen.createInstance()</code> or <code>new F360Hvidbjoernen()</code>. </p>
 * <ul>
 *     <li> Country: Denmark (DNK) = <code>57</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Frigate (including Corvette) = <code>50</code>; </li>
 *     <li> SubCategory: ThetisClass  = <code>1</code>; </li>
 *     <li> Specific: F360Hvidbjoernen  = <code>4</code>; </li>
 *     <li> Entity type uid: 25440; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2e1d27ba. </p>
 * @see Country#ACTION_RESPONSE_RELIABLE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FrigateincludingCorvette
 * @see SubCategory

 */
public final class F360Hvidbjoernen extends EntityType
{
    /** Default constructor */
    public F360Hvidbjoernen()
    {
        setCountry(Country.ACTION_RESPONSE_RELIABLE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 25435, Frigate (including Corvette)
        setSubCategory((byte)1); // uid 25436, Thetis Class
        setSpecific((byte)4); // uid 25440, F360 Hvidbjoernen
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static F360Hvidbjoernen createInstance()
    {
            return new F360Hvidbjoernen();
    }
}
