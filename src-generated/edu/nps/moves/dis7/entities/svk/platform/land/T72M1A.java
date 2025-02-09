// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.svk.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>T72M1A</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>T72M1A.createInstance()</code> or <code>new T72M1A()</code>. </p>
 * <ul>
 *     <li> Country: Slovakia (SVK) = <code>268</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Tank = <code>1</code>; </li>
 *     <li> SubCategory: T72MBT  = <code>1</code>; </li>
 *     <li> Specific: T72M1A  = <code>1</code>; </li>
 *     <li> Entity type uid: 30108; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@64d4f7c7. </p>
 * @see Country#SLOVAKIA_SVK
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Tank
 * @see SubCategory

 */
public final class T72M1A extends EntityType
{
    /** Default constructor */
    public T72M1A()
    {
        setCountry(Country.SLOVAKIA_SVK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)1); // uid 30106, Tank
        setSubCategory((byte)1); // uid 30107, T-72 MBT
        setSpecific((byte)1); // uid 30108, T-72M1A
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static T72M1A createInstance()
    {
            return new T72M1A();
    }
}
