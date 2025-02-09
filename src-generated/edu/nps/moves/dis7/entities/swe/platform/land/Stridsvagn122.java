// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.swe.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Stridsvagn122</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Stridsvagn122.createInstance()</code> or <code>new Stridsvagn122()</code>. </p>
 * <ul>
 *     <li> Country: Sweden (SWE) = <code>205</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Tank = <code>1</code>; </li>
 *     <li> SubCategory: Leopard2MBT  = <code>1</code>; </li>
 *     <li> Specific: Stridsvagn122  = <code>2</code>; </li>
 *     <li> Entity type uid: 22786; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1d805aa1. </p>
 * @see Country#SWEDEN_SWE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Tank
 * @see SubCategory

 */
public final class Stridsvagn122 extends EntityType
{
    /** Default constructor */
    public Stridsvagn122()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)1); // uid 17469, Tank
        setSubCategory((byte)1); // uid 22784, Leopard 2 MBT
        setSpecific((byte)2); // uid 22786, Stridsvagn 122
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Stridsvagn122 createInstance()
    {
            return new Stridsvagn122();
    }
}
