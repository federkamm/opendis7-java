// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_615Bora</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_615Bora.createInstance()</code> or <code>new _615Bora()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol craft = <code>7</code>; </li>
 *     <li> SubCategory: DergachClass  = <code>2</code>; </li>
 *     <li> Specific: _615Bora  = <code>1</code>; </li>
 *     <li> Entity type uid: 13673; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6ec65b5e. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolcraft
 * @see SubCategory

 */
public final class _615Bora extends EntityType
{
    /** Default constructor */
    public _615Bora()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 13670, Light/Patrol craft
        setSubCategory((byte)2); // uid 13672, Dergach Class
        setSpecific((byte)1); // uid 13673, 615 Bora
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _615Bora createInstance()
    {
            return new _615Bora();
    }
}
