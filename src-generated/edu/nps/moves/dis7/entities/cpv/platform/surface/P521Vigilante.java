// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.cpv.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>P521Vigilante</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>P521Vigilante.createInstance()</code> or <code>new P521Vigilante()</code>. </p>
 * <ul>
 *     <li> Country: Cabo Verde (CPV) = <code>40</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Countermeasure Ship/Craft = <code>8</code>; </li>
 *     <li> SubCategory: KondorIClass  = <code>1</code>; </li>
 *     <li> Specific: P521Vigilante  = <code>1</code>; </li>
 *     <li> Entity type uid: 27570; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5a8806ef. </p>
 * @see Country#CABO_VERDE_CPV
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCountermeasureShipCraft
 * @see SubCategory

 */
public final class P521Vigilante extends EntityType
{
    /** Default constructor */
    public P521Vigilante()
    {
        setCountry(Country.CABO_VERDE_CPV);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 27568, Mine Countermeasure Ship/Craft
        setSubCategory((byte)1); // uid 27569, Kondor I Class
        setSpecific((byte)1); // uid 27570, P 521 Vigilante
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static P521Vigilante createInstance()
    {
            return new P521Vigilante();
    }
}
