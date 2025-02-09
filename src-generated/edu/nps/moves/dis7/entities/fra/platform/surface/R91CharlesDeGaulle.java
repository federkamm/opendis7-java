// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>R91CharlesDeGaulle</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>R91CharlesDeGaulle.createInstance()</code> or <code>new R91CharlesDeGaulle()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Carrier (Porte-Avions) = <code>1</code>; </li>
 *     <li> SubCategory: NuclearPropelledAircraftCarriersCVN  = <code>1</code>; </li>
 *     <li> Specific: R91CharlesDeGaulle  = <code>1</code>; </li>
 *     <li> Entity type uid: 15925; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7d3e8655. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CarrierPorteAvions
 * @see SubCategory

 */
public final class R91CharlesDeGaulle extends EntityType
{
    /** Default constructor */
    public R91CharlesDeGaulle()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)1); // uid 15923, Carrier (Porte-Avions)
        setSubCategory((byte)1); // uid 15924, Nuclear-Propelled Aircraft Carriers (CVN)
        setSpecific((byte)1); // uid 15925, R 91 Charles De Gaulle
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static R91CharlesDeGaulle createInstance()
    {
            return new R91CharlesDeGaulle();
    }
}
