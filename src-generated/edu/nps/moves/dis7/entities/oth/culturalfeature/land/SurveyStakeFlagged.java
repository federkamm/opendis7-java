// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SurveyStakeFlagged</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SurveyStakeFlagged.createInstance()</code> or <code>new SurveyStakeFlagged()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Flags/markers = <code>6</code>; </li>
 *     <li> SubCategory: SurveyStake  = <code>8</code>; </li>
 *     <li> Specific: SurveyStakeFlagged  = <code>1</code>; </li>
 *     <li> Entity type uid: 26446; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6b7c4734. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Flagsmarkers
 * @see SubCategory

 */
public final class SurveyStakeFlagged extends EntityType
{
    /** Default constructor */
    public SurveyStakeFlagged()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 21990, Flags/markers
        setSubCategory((byte)8); // uid 26445, Survey Stake
        setSpecific((byte)1); // uid 26446, Survey Stake, Flagged
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SurveyStakeFlagged createInstance()
    {
            return new SurveyStakeFlagged();
    }
}
