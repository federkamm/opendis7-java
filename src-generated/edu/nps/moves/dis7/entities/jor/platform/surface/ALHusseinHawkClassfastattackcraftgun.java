// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.jor.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ALHusseinHawkClassfastattackcraftgun</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ALHusseinHawkClassfastattackcraftgun.createInstance()</code> or <code>new ALHusseinHawkClassfastattackcraftgun()</code>. </p>
 * <ul>
 *     <li> Country: Jordan (JOR) = <code>114</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: ALHusseinHawkClassfastattackcraftgun  = <code>2</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 18268; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@677dbd89. </p>
 * @see Country#JORDAN_JOR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class ALHusseinHawkClassfastattackcraftgun extends EntityType
{
    /** Default constructor */
    public ALHusseinHawkClassfastattackcraftgun()
    {
        setCountry(Country.JORDAN_JOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 18262, Light/Patrol Craft
        setSubCategory((byte)2); // uid 18268, AL Hussein (Hawk) Class (fast attack craft-gun)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ALHusseinHawkClassfastattackcraftgun createInstance()
    {
            return new ALHusseinHawkClassfastattackcraftgun();
    }
}
