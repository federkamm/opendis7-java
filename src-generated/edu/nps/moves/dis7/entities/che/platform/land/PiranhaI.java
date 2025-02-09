// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.che.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>PiranhaI</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>PiranhaI.createInstance()</code> or <code>new PiranhaI()</code>. </p>
 * <ul>
 *     <li> Country: Switzerland (CHE) = <code>206</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Armored Fighting Vehicle = <code>2</code>; </li>
 *     <li> SubCategory: PiranhaI  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 32944; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@69d23296. </p>
 * @see Country#SWITZERLAND_CHE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ArmoredFightingVehicle
 * @see SubCategory

 */
public final class PiranhaI extends EntityType
{
    /** Default constructor */
    public PiranhaI()
    {
        setCountry(Country.SWITZERLAND_CHE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 32943, Armored Fighting Vehicle
        setSubCategory((byte)1); // uid 32944, Piranha I
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static PiranhaI createInstance()
    {
            return new PiranhaI();
    }
}
