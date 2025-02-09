// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.lbr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>FrontChief</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>FrontChief.createInstance()</code> or <code>new FrontChief()</code>. </p>
 * <ul>
 *     <li> Country: Liberia (LBR) = <code>125</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Tanker (Group 3 Merchant) = <code>82</code>; </li>
 *     <li> SubCategory: LiquidPetroleumGasLPGTanker  = <code>1</code>; </li>
 *     <li> Specific: FrontChief  = <code>4</code>; </li>
 *     <li> Entity type uid: 24528; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@420bc288. </p>
 * @see Country#LIBERIA_LBR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see TankerGroup3Merchant
 * @see SubCategory

 */
public final class FrontChief extends EntityType
{
    /** Default constructor */
    public FrontChief()
    {
        setCountry(Country.LIBERIA_LBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)82); // uid 24523, Tanker (Group 3 Merchant)
        setSubCategory((byte)1); // uid 24524, Liquid Petroleum Gas (LPG)Tanker
        setSpecific((byte)4); // uid 24528, Front Chief
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static FrontChief createInstance()
    {
            return new FrontChief();
    }
}
