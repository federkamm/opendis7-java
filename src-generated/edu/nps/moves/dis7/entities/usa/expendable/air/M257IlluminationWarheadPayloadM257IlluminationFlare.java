// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.expendable.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M257IlluminationWarheadPayloadM257IlluminationFlare</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M257IlluminationWarheadPayloadM257IlluminationFlare.createInstance()</code> or <code>new M257IlluminationWarheadPayloadM257IlluminationFlare()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Expendable = <code>8</code>; </li>
 *     <li> Category: Signal/Illumination Flare = <code>7</code>; </li>
 *     <li> SubCategory: IlluminationFlare  = <code>2</code>; </li>
 *     <li> Specific: Hydra70wM257IlluminationWarhead  = <code>5</code>; </li>
 *     <li> Entity type uid: 24980; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@7b2d58e6. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#EXPENDABLE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SignalIlluminationFlare
 * @see SubCategory

 */
public final class M257IlluminationWarheadPayloadM257IlluminationFlare extends EntityType
{
    /** Default constructor */
    public M257IlluminationWarheadPayloadM257IlluminationFlare()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)7); // uid 24824, Signal/Illumination Flare
        setSubCategory((byte)2); // uid 24825, Illumination Flare
        setSpecific((byte)5); // uid 24979, Hydra 70 w/ M257 Illumination Warhead
        setExtra((byte)1); // uid 24980, M257 Illumination Warhead Payload (M257 Illumination Flare)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M257IlluminationWarheadPayloadM257IlluminationFlare createInstance()
    {
            return new M257IlluminationWarheadPayloadM257IlluminationFlare();
    }
}
