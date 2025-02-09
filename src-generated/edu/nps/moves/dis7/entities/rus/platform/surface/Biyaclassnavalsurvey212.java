// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Biyaclassnavalsurvey212</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Biyaclassnavalsurvey212.createInstance()</code> or <code>new Biyaclassnavalsurvey212()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: Biyaclassnavalsurvey  = <code>34</code>; </li>
 *     <li> Specific: _212  = <code>10</code>; </li>
 *     <li> Entity type uid: 14087; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@13da7ab0. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class Biyaclassnavalsurvey212 extends EntityType
{
    /** Default constructor */
    public Biyaclassnavalsurvey212()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 13805, Auxiliary
        setSubCategory((byte)34); // uid 14077, Biya class (naval survey)
        setSpecific((byte)10); // uid 14087, 212
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Biyaclassnavalsurvey212 createInstance()
    {
            return new Biyaclassnavalsurvey212();
    }
}
