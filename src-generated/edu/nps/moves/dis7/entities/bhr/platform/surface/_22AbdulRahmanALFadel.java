// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.bhr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_22AbdulRahmanALFadel</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_22AbdulRahmanALFadel.createInstance()</code> or <code>new _22AbdulRahmanALFadel()</code>. </p>
 * <ul>
 *     <li> Country: Bahrain (BHR) = <code>16</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: AlmadELFatehFPB45Classfastattackcraftmissile  = <code>2</code>; </li>
 *     <li> Specific: _22AbdulRahmanALFadel  = <code>3</code>; </li>
 *     <li> Entity type uid: 18673; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@20e2cbe0. </p>
 * @see Country#BAHRAIN_BHR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class _22AbdulRahmanALFadel extends EntityType
{
    /** Default constructor */
    public _22AbdulRahmanALFadel()
    {
        setCountry(Country.BAHRAIN_BHR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 18666, Light/Patrol Craft
        setSubCategory((byte)2); // uid 18670, Almad EL Fateh (FPB 45) Class (fast attack craft-missile)
        setSpecific((byte)3); // uid 18673, 22 Abdul Rahman AL Fadel
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _22AbdulRahmanALFadel createInstance()
    {
            return new _22AbdulRahmanALFadel();
    }
}
