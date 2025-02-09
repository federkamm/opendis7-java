// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>FBC1FlyingLeopard</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>FBC1FlyingLeopard.createInstance()</code> or <code>new FBC1FlyingLeopard()</code>. </p>
 * <ul>
 *     <li> Country: China, Peoples Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Attack/Strike = <code>2</code>; </li>
 *     <li> SubCategory: XianAircraftCompanyJH7  = <code>4</code>; </li>
 *     <li> Specific: FBC1FlyingLeopard  = <code>4</code>; </li>
 *     <li> Entity type uid: 28896; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1460a8c0. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AttackStrike
 * @see SubCategory

 */
public final class FBC1FlyingLeopard extends EntityType
{
    /** Default constructor */
    public FBC1FlyingLeopard()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)2); // uid 16977, Attack/Strike
        setSubCategory((byte)4); // uid 16986, Xian Aircraft Company JH-7
        setSpecific((byte)4); // uid 28896, FBC-1 Flying Leopard
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static FBC1FlyingLeopard createInstance()
    {
            return new FBC1FlyingLeopard();
    }
}
