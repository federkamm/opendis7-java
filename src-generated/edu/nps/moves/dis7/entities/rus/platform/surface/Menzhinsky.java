// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Menzhinsky</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Menzhinsky.createInstance()</code> or <code>new Menzhinsky()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Frigate = <code>50</code>; </li>
 *     <li> SubCategory: KrivakIIIZalivKerch  = <code>9</code>; </li>
 *     <li> Specific: Menzhinsky  = <code>1</code>; </li>
 *     <li> Entity type uid: 14737; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@261ea657. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Frigate
 * @see SubCategory

 */
public final class Menzhinsky extends EntityType
{
    /** Default constructor */
    public Menzhinsky()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 14715, Frigate
        setSubCategory((byte)9); // uid 14736, Krivak III (Zaliv (Kerch))
        setSpecific((byte)1); // uid 14737, Menzhinsky
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Menzhinsky createInstance()
    {
            return new Menzhinsky();
    }
}
