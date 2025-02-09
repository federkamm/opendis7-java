// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Svetlyakclassfastattackcraftpatrol</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Svetlyakclassfastattackcraftpatrol.createInstance()</code> or <code>new Svetlyakclassfastattackcraftpatrol()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol craft = <code>7</code>; </li>
 *     <li> SubCategory: Svetlyakclassfastattackcraftpatrol  = <code>6</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 13677; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@67d86804. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolcraft
 * @see SubCategory

 */
public final class Svetlyakclassfastattackcraftpatrol extends EntityType
{
    /** Default constructor */
    public Svetlyakclassfastattackcraftpatrol()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 13670, Light/Patrol craft
        setSubCategory((byte)6); // uid 13677, Svetlyak class (fast attack craft--patrol)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Svetlyakclassfastattackcraftpatrol createInstance()
    {
            return new Svetlyakclassfastattackcraftpatrol();
    }
}
