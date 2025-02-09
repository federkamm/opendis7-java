// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.pol.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_422Piorun</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_422Piorun.createInstance()</code> or <code>new _422Piorun()</code>. </p>
 * <ul>
 *     <li> Country: Poland (POL) = <code>175</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Frigate (including Corvette) = <code>50</code>; </li>
 *     <li> SubCategory: OrkanSassnitzClass  = <code>2</code>; </li>
 *     <li> Specific: _422Piorun  = <code>2</code>; </li>
 *     <li> Entity type uid: 23051; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6de30571. </p>
 * @see Country#POLAND_POL
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FrigateincludingCorvette
 * @see SubCategory

 */
public final class _422Piorun extends EntityType
{
    /** Default constructor */
    public _422Piorun()
    {
        setCountry(Country.POLAND_POL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 23045, Frigate (including Corvette)
        setSubCategory((byte)2); // uid 23049, Orkan (Sassnitz) Class
        setSpecific((byte)2); // uid 23051, 422 Piorun
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _422Piorun createInstance()
    {
            return new _422Piorun();
    }
}
