// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ita.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>A109KM</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>A109KM.createInstance()</code> or <code>new A109KM()</code>. </p>
 * <ul>
 *     <li> Country: Italy (ITA) = <code>106</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Utility Helicopter = <code>21</code>; </li>
 *     <li> SubCategory: AgustaWestlandAW109  = <code>5</code>; </li>
 *     <li> Specific: A109K  = <code>5</code>; </li>
 *     <li> Entity type uid: 28492; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@773cbf4f. </p>
 * @see Country#ITALY_ITA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see UtilityHelicopter
 * @see SubCategory

 */
public final class A109KM extends EntityType
{
    /** Default constructor */
    public A109KM()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 18315, Utility Helicopter
        setSubCategory((byte)5); // uid 18320, Agusta Westland AW109
        setSpecific((byte)5); // uid 28491, A109K
        setExtra((byte)1); // uid 28492, A109KM
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static A109KM createInstance()
    {
            return new A109KM();
    }
}
