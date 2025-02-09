// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SingleLaneSteelGirderBridgeSpan</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SingleLaneSteelGirderBridgeSpan.createInstance()</code> or <code>new SingleLaneSteelGirderBridgeSpan()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Bridge Span = <code>19</code>; </li>
 *     <li> SubCategory: SingleLaneEachWay  = <code>1</code>; </li>
 *     <li> Specific: SingleLaneSteelGirderBridgeSpan  = <code>5</code>; </li>
 *     <li> Entity type uid: 22080; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4f676900. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see BridgeSpan
 * @see SubCategory

 */
public final class SingleLaneSteelGirderBridgeSpan extends EntityType
{
    /** Default constructor */
    public SingleLaneSteelGirderBridgeSpan()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)19); // uid 22073, Bridge Span
        setSubCategory((byte)1); // uid 22075, Single Lane Each Way
        setSpecific((byte)5); // uid 22080, Single Lane Steel Girder Bridge Span
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SingleLaneSteelGirderBridgeSpan createInstance()
    {
            return new SingleLaneSteelGirderBridgeSpan();
    }
}
