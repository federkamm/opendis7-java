// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CH53GEwdoorgunsM3M</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CH53GEwdoorgunsM3M.createInstance()</code> or <code>new CH53GEwdoorgunsM3M()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Utility Helicopter = <code>21</code>; </li>
 *     <li> SubCategory: SikorskyS65A  = <code>9</code>; </li>
 *     <li> Specific: CH53GE  = <code>3</code>; </li>
 *     <li> Entity type uid: 28035; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@73d983ea. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see UtilityHelicopter
 * @see SubCategory

 */
public final class CH53GEwdoorgunsM3M extends EntityType
{
    /** Default constructor */
    public CH53GEwdoorgunsM3M()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 16366, Utility Helicopter
        setSubCategory((byte)9); // uid 28025, Sikorsky S-65A
        setSpecific((byte)3); // uid 28033, CH-53GE
        setExtra((byte)2); // uid 28035, CH-53GE w/ doorguns M3M
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CH53GEwdoorgunsM3M createInstance()
    {
            return new CH53GEwdoorgunsM3M();
    }
}
