// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.mhl.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>LiquidPetroleumGasLPGTanker</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>LiquidPetroleumGasLPGTanker.createInstance()</code> or <code>new LiquidPetroleumGasLPGTanker()</code>. </p>
 * <ul>
 *     <li> Country: Marshall Islands (MHL) = <code>137</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Tanker (Group 3 Merchant) = <code>82</code>; </li>
 *     <li> SubCategory: LiquidPetroleumGasLPGTanker  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 24573; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@450794b4. </p>
 * @see Country#MARSHALL_ISLANDS_MHL
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see TankerGroup3Merchant
 * @see SubCategory

 */
public final class LiquidPetroleumGasLPGTanker extends EntityType
{
    /** Default constructor */
    public LiquidPetroleumGasLPGTanker()
    {
        setCountry(Country.MARSHALL_ISLANDS_MHL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)82); // uid 24572, Tanker (Group 3 Merchant)
        setSubCategory((byte)1); // uid 24573, Liquid Petroleum Gas (LPG)Tanker
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static LiquidPetroleumGasLPGTanker createInstance()
    {
            return new LiquidPetroleumGasLPGTanker();
    }
}
