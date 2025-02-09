// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>D650Aquitaine</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>D650Aquitaine.createInstance()</code> or <code>new D650Aquitaine()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided-missile Frigate = <code>6</code>; </li>
 *     <li> SubCategory: AquitaineClass  = <code>3</code>; </li>
 *     <li> Specific: D650Aquitaine  = <code>1</code>; </li>
 *     <li> Entity type uid: 28655; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2d29b4ee. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedmissileFrigate
 * @see SubCategory

 */
public final class D650Aquitaine extends EntityType
{
    /** Default constructor */
    public D650Aquitaine()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 15950, Guided-missile Frigate
        setSubCategory((byte)3); // uid 28654, Aquitaine Class
        setSpecific((byte)1); // uid 28655, D650 Aquitaine
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static D650Aquitaine createInstance()
    {
            return new D650Aquitaine();
    }
}
