// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.mar.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_614SultanMoulayIsmail</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_614SultanMoulayIsmail.createInstance()</code> or <code>new _614SultanMoulayIsmail()</code>. </p>
 * <ul>
 *     <li> Country: Morocco (MAR) = <code>147</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Frigate (including Corvette) = <code>50</code>; </li>
 *     <li> SubCategory: Sigma9813Class  = <code>1</code>; </li>
 *     <li> Specific: _614SultanMoulayIsmail  = <code>1</code>; </li>
 *     <li> Entity type uid: 28867; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@232024b9. </p>
 * @see Country#MOROCCO_MAR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FrigateincludingCorvette
 * @see SubCategory

 */
public final class _614SultanMoulayIsmail extends EntityType
{
    /** Default constructor */
    public _614SultanMoulayIsmail()
    {
        setCountry(Country.MOROCCO_MAR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 28865, Frigate (including Corvette)
        setSubCategory((byte)1); // uid 28866, Sigma 9813 Class
        setSpecific((byte)1); // uid 28867, 614 Sultan Moulay Ismail
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _614SultanMoulayIsmail createInstance()
    {
            return new _614SultanMoulayIsmail();
    }
}
