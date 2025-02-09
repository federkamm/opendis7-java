// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.grc.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>P75PlotarchisMaridakis</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>P75PlotarchisMaridakis.createInstance()</code> or <code>new P75PlotarchisMaridakis()</code>. </p>
 * <ul>
 *     <li> Country: Greece (GRC) = <code>82</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: TigerClassType148  = <code>2</code>; </li>
 *     <li> Specific: P75PlotarchisMaridakis  = <code>4</code>; </li>
 *     <li> Entity type uid: 27522; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@30b19518. </p>
 * @see Country#GREECE_GRC
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class P75PlotarchisMaridakis extends EntityType
{
    /** Default constructor */
    public P75PlotarchisMaridakis()
    {
        setCountry(Country.GREECE_GRC);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 23370, Light/Patrol Craft
        setSubCategory((byte)2); // uid 27518, Tiger Class (Type 148)
        setSpecific((byte)4); // uid 27522, P75 Plotarchis Maridakis
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static P75PlotarchisMaridakis createInstance()
    {
            return new P75PlotarchisMaridakis();
    }
}
