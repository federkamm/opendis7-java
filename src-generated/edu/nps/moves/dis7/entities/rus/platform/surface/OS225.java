// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>OS225</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>OS225.createInstance()</code> or <code>new OS225()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol craft = <code>7</code>; </li>
 *     <li> SubCategory: Potokclasstorpedoexperimentalships  = <code>16</code>; </li>
 *     <li> Specific: OS225  = <code>4</code>; </li>
 *     <li> Entity type uid: 13692; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@61e7bf2f. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolcraft
 * @see SubCategory

 */
public final class OS225 extends EntityType
{
    /** Default constructor */
    public OS225()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 13670, Light/Patrol craft
        setSubCategory((byte)16); // uid 13688, Potok class (torpedo experimental ships)
        setSpecific((byte)4); // uid 13692, OS-225
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static OS225 createInstance()
    {
            return new OS225();
    }
}
