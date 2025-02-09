// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Barrels30GalSingle</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Barrels30GalSingle.createInstance()</code> or <code>new Barrels30GalSingle()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Obstacle = <code>5</code>; </li>
 *     <li> SubCategory: Barrels30Gal  = <code>29</code>; </li>
 *     <li> Specific: Barrels30GalSingle  = <code>10</code>; </li>
 *     <li> Entity type uid: 26463; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@25e6c22a. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Obstacle
 * @see SubCategory

 */
public final class Barrels30GalSingle extends EntityType
{
    /** Default constructor */
    public Barrels30GalSingle()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)5); // uid 21973, Obstacle
        setSubCategory((byte)29); // uid 26459, Barrels, 30 Gal
        setSpecific((byte)10); // uid 26463, Barrels, 30 Gal, Single
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Barrels30GalSingle createInstance()
    {
            return new Barrels30GalSingle();
    }
}
