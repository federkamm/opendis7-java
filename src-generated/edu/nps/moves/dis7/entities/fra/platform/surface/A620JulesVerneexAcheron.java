// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>A620JulesVerneexAcheron</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>A620JulesVerneexAcheron.createInstance()</code> or <code>new A620JulesVerneexAcheron()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: Maintenanceandrepairship  = <code>3</code>; </li>
 *     <li> Specific: A620JulesVerneexAcheron  = <code>1</code>; </li>
 *     <li> Entity type uid: 16053; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@376a0d86. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class A620JulesVerneexAcheron extends EntityType
{
    /** Default constructor */
    public A620JulesVerneexAcheron()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 16040, Auxiliary
        setSubCategory((byte)3); // uid 16052, Maintenance and repair ship
        setSpecific((byte)1); // uid 16053, A 620 Jules Verne (ex-Acheron)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static A620JulesVerneexAcheron createInstance()
    {
            return new A620JulesVerneexAcheron();
    }
}
