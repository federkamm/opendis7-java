// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_055MarshalUstinov</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_055MarshalUstinov.createInstance()</code> or <code>new _055MarshalUstinov()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided-missile Cruiser = <code>3</code>; </li>
 *     <li> SubCategory: SlavaclassCG  = <code>1</code>; </li>
 *     <li> Specific: _055MarshalUstinov  = <code>2</code>; </li>
 *     <li> Entity type uid: 13507; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@c3177d5. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedmissileCruiser
 * @see SubCategory

 */
public final class _055MarshalUstinov extends EntityType
{
    /** Default constructor */
    public _055MarshalUstinov()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)3); // uid 13504, Guided-missile Cruiser
        setSubCategory((byte)1); // uid 13505, Slava class (CG)
        setSpecific((byte)2); // uid 13507, 055 Marshal Ustinov
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _055MarshalUstinov createInstance()
    {
            return new _055MarshalUstinov();
    }
}
