// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CurvilinearAircraftShelter</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CurvilinearAircraftShelter.createInstance()</code> or <code>new CurvilinearAircraftShelter()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Building = <code>2</code>; </li>
 *     <li> SubCategory: Onestory  = <code>1</code>; </li>
 *     <li> Specific: CurvilinearAircraftShelter  = <code>2</code>; </li>
 *     <li> Entity type uid: 21957; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3514ac7d. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Building
 * @see SubCategory

 */
public final class CurvilinearAircraftShelter extends EntityType
{
    /** Default constructor */
    public CurvilinearAircraftShelter()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 21953, Building
        setSubCategory((byte)1); // uid 21955, One-story
        setSpecific((byte)2); // uid 21957, Curvilinear Aircraft Shelter
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CurvilinearAircraftShelter createInstance()
    {
            return new CurvilinearAircraftShelter();
    }
}
