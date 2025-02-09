// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.can.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CE144Challenger</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CE144Challenger.createInstance()</code> or <code>new CE144Challenger()</code>. </p>
 * <ul>
 *     <li> Country: Canada (CAN) = <code>39</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Electronic Warfare (EW) = <code>6</code>; </li>
 *     <li> SubCategory: CE144Challenger  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 18773; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@11438d26. </p>
 * @see Country#CANADA_CAN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ElectronicWarfareEW
 * @see SubCategory

 */
public final class CE144Challenger extends EntityType
{
    /** Default constructor */
    public CE144Challenger()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)6); // uid 18772, Electronic Warfare (EW)
        setSubCategory((byte)1); // uid 18773, CE144 Challenger
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CE144Challenger createInstance()
    {
            return new CE144Challenger();
    }
}
