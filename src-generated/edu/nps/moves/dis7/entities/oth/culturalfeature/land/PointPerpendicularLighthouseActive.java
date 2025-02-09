// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>PointPerpendicularLighthouseActive</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>PointPerpendicularLighthouseActive.createInstance()</code> or <code>new PointPerpendicularLighthouseActive()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Tower = <code>17</code>; </li>
 *     <li> SubCategory: Lighthouse  = <code>5</code>; </li>
 *     <li> Specific: LighthouseShortLT20m  = <code>1</code>; </li>
 *     <li> Entity type uid: 30284; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@79295932. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Tower
 * @see SubCategory

 */
public final class PointPerpendicularLighthouseActive extends EntityType
{
    /** Default constructor */
    public PointPerpendicularLighthouseActive()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)17); // uid 22063, Tower
        setSubCategory((byte)5); // uid 29789, Lighthouse
        setSpecific((byte)1); // uid 29790, Lighthouse, Short (<20m)
        setExtra((byte)1); // uid 30284, Point Perpendicular Lighthouse (Active)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static PointPerpendicularLighthouseActive createInstance()
    {
            return new PointPerpendicularLighthouseActive();
    }
}
