// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.kaz.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_2033Atyrau</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_2033Atyrau.createInstance()</code> or <code>new _2033Atyrau()</code>. </p>
 * <ul>
 *     <li> Country: Kazakhstan (KAZ) = <code>252</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Utility = <code>18</code>; </li>
 *     <li> SubCategory: Type369909Class  = <code>1</code>; </li>
 *     <li> Specific: _2033Atyrau  = <code>3</code>; </li>
 *     <li> Entity type uid: 27547; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4a9419d7. </p>
 * @see Country#KAZAKHSTAN_KAZ
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Utility
 * @see SubCategory

 */
public final class _2033Atyrau extends EntityType
{
    /** Default constructor */
    public _2033Atyrau()
    {
        setCountry(Country.KAZAKHSTAN_KAZ);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)18); // uid 27543, Utility
        setSubCategory((byte)1); // uid 27544, Type 369/909 Class
        setSpecific((byte)3); // uid 27547, 2033 Atyrau
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _2033Atyrau createInstance()
    {
            return new _2033Atyrau();
    }
}
