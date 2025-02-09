// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ita.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M5554Gaeta</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M5554Gaeta.createInstance()</code> or <code>new M5554Gaeta()</code>. </p>
 * <ul>
 *     <li> Country: Italy (ITA) = <code>106</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Countermeasure Ship/Craft = <code>8</code>; </li>
 *     <li> SubCategory: GaetaClass  = <code>1</code>; </li>
 *     <li> Specific: M5554Gaeta  = <code>5</code>; </li>
 *     <li> Entity type uid: 18350; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@58670130. </p>
 * @see Country#ITALY_ITA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCountermeasureShipCraft
 * @see SubCategory

 */
public final class M5554Gaeta extends EntityType
{
    /** Default constructor */
    public M5554Gaeta()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 18344, Mine Countermeasure Ship/Craft
        setSubCategory((byte)1); // uid 18345, Gaeta Class
        setSpecific((byte)5); // uid 18350, M5554 Gaeta
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M5554Gaeta createInstance()
    {
            return new M5554Gaeta();
    }
}
