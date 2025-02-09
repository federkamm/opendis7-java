// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>D186Molders</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>D186Molders.createInstance()</code> or <code>new D186Molders()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Destroyer = <code>4</code>; </li>
 *     <li> SubCategory: ExUSModifiedCharlesFAdamsclasstype103BDDGs  = <code>1</code>; </li>
 *     <li> Specific: D186Molders  = <code>2</code>; </li>
 *     <li> Entity type uid: 16390; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5b6ec132. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileDestroyer
 * @see SubCategory

 */
public final class D186Molders extends EntityType
{
    /** Default constructor */
    public D186Molders()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 16387, Guided Missile Destroyer
        setSubCategory((byte)1); // uid 16388, Ex-US Modified Charles F. Adams class (type 103B) (DDGs)
        setSpecific((byte)2); // uid 16390, D186 Molders
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static D186Molders createInstance()
    {
            return new D186Molders();
    }
}
