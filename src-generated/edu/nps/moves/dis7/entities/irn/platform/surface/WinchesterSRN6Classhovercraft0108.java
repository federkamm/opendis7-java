// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.irn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>WinchesterSRN6Classhovercraft0108</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>WinchesterSRN6Classhovercraft0108.createInstance()</code> or <code>new WinchesterSRN6Classhovercraft0108()</code>. </p>
 * <ul>
 *     <li> Country: Iran (Islamic Republic of) (IRN) = <code>101</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Cushion/Surface Effect = <code>15</code>; </li>
 *     <li> SubCategory: WinchesterSRN6Classhovercraft  = <code>1</code>; </li>
 *     <li> Specific: _0108  = <code>1</code>; </li>
 *     <li> Entity type uid: 18111; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@788fcafb. </p>
 * @see Country#IRAN_ISLAMIC_REPUBLIC_OF_IRN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirCushionSurfaceEffect
 * @see SubCategory

 */
public final class WinchesterSRN6Classhovercraft0108 extends EntityType
{
    /** Default constructor */
    public WinchesterSRN6Classhovercraft0108()
    {
        setCountry(Country.IRAN_ISLAMIC_REPUBLIC_OF_IRN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)15); // uid 18109, Air Cushion/Surface Effect
        setSubCategory((byte)1); // uid 18110, Winchester (SR. N6) Class (hovercraft)
        setSpecific((byte)1); // uid 18111, 01-08
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static WinchesterSRN6Classhovercraft0108 createInstance()
    {
            return new WinchesterSRN6Classhovercraft0108();
    }
}
