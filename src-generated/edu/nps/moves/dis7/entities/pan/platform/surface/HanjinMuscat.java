// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.pan.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>HanjinMuscat</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HanjinMuscat.createInstance()</code> or <code>new HanjinMuscat()</code>. </p>
 * <ul>
 *     <li> Country: Panama (PAN) = <code>168</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Tanker (Group 3 Merchant) = <code>82</code>; </li>
 *     <li> SubCategory: LiquidNaturalGasLNGTanker  = <code>3</code>; </li>
 *     <li> Specific: HanjinMuscat  = <code>1</code>; </li>
 *     <li> Entity type uid: 26787; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@abbc908. </p>
 * @see Country#PANAMA_PAN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see TankerGroup3Merchant
 * @see SubCategory

 */
public final class HanjinMuscat extends EntityType
{
    /** Default constructor */
    public HanjinMuscat()
    {
        setCountry(Country.PANAMA_PAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)82); // uid 24556, Tanker (Group 3 Merchant)
        setSubCategory((byte)3); // uid 26786, Liquid Natural Gas (LNG) Tanker
        setSpecific((byte)1); // uid 26787, Hanjin Muscat
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HanjinMuscat createInstance()
    {
            return new HanjinMuscat();
    }
}
