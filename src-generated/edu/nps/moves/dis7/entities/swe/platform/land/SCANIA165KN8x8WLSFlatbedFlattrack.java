// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.swe.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SCANIA165KN8x8WLSFlatbedFlattrack</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SCANIA165KN8x8WLSFlatbedFlattrack.createInstance()</code> or <code>new SCANIA165KN8x8WLSFlatbedFlattrack()</code>. </p>
 * <ul>
 *     <li> Country: Sweden (SWE) = <code>205</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Wheeled Utility Vehicle = <code>7</code>; </li>
 *     <li> SubCategory: SCANIA165KN8x8WLSFlatbedFlattrack  = <code>2</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 27970; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5793b87. </p>
 * @see Country#SWEDEN_SWE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeWheeledUtilityVehicle
 * @see SubCategory

 */
public final class SCANIA165KN8x8WLSFlatbedFlattrack extends EntityType
{
    /** Default constructor */
    public SCANIA165KN8x8WLSFlatbedFlattrack()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 26342, Large Wheeled Utility Vehicle
        setSubCategory((byte)2); // uid 27970, SCANIA 165 KN 8x8 WLS Flatbed/Flattrack
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SCANIA165KN8x8WLSFlatbedFlattrack createInstance()
    {
            return new SCANIA165KN8x8WLSFlatbedFlattrack();
    }
}
