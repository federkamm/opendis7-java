// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.lva.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>A53Virsaitis</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>A53Virsaitis.createInstance()</code> or <code>new A53Virsaitis()</code>. </p>
 * <ul>
 *     <li> Country: Latvia (LVA) = <code>254</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Countermeasure Ship/Craft = <code>8</code>; </li>
 *     <li> SubCategory: VidarClass  = <code>2</code>; </li>
 *     <li> Specific: A53Virsaitis  = <code>1</code>; </li>
 *     <li> Entity type uid: 27794; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5b69fd74. </p>
 * @see Country#LATVIA_LVA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCountermeasureShipCraft
 * @see SubCategory

 */
public final class A53Virsaitis extends EntityType
{
    /** Default constructor */
    public A53Virsaitis()
    {
        setCountry(Country.LATVIA_LVA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 27786, Mine Countermeasure Ship/Craft
        setSubCategory((byte)2); // uid 27793, Vidar Class
        setSpecific((byte)1); // uid 27794, A-53 Virsaitis
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static A53Virsaitis createInstance()
    {
            return new A53Virsaitis();
    }
}
