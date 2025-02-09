// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.bhr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_21AlJabiri</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_21AlJabiri.createInstance()</code> or <code>new _21AlJabiri()</code>. </p>
 * <ul>
 *     <li> Country: Bahrain (BHR) = <code>16</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: AlmadELFatehFPB45Classfastattackcraftmissile  = <code>2</code>; </li>
 *     <li> Specific: _21AlJabiri  = <code>2</code>; </li>
 *     <li> Entity type uid: 18672; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2a5ca609. </p>
 * @see Country#BAHRAIN_BHR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class _21AlJabiri extends EntityType
{
    /** Default constructor */
    public _21AlJabiri()
    {
        setCountry(Country.BAHRAIN_BHR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 18666, Light/Patrol Craft
        setSubCategory((byte)2); // uid 18670, Almad EL Fateh (FPB 45) Class (fast attack craft-missile)
        setSpecific((byte)2); // uid 18672, 21 Al Jabiri
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _21AlJabiri createInstance()
    {
            return new _21AlJabiri();
    }
}
