// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.dza.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_342ElMorakeb</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_342ElMorakeb.createInstance()</code> or <code>new _342ElMorakeb()</code>. </p>
 * <ul>
 *     <li> Country: Algeria (DZA) = <code>3</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: KebirClass  = <code>2</code>; </li>
 *     <li> Specific: _342ElMorakeb  = <code>2</code>; </li>
 *     <li> Entity type uid: 27737; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6d9c638. </p>
 * @see Country#ALGERIA_DZA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class _342ElMorakeb extends EntityType
{
    /** Default constructor */
    public _342ElMorakeb()
    {
        setCountry(Country.ALGERIA_DZA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 27023, Light/Patrol Craft
        setSubCategory((byte)2); // uid 27735, Kebir Class
        setSpecific((byte)2); // uid 27737, 342 El Morakeb
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _342ElMorakeb createInstance()
    {
            return new _342ElMorakeb();
    }
}
