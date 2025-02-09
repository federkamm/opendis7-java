// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_185mmRemington87012Gauge1</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_185mmRemington87012Gauge1.createInstance()</code> or <code>new _185mmRemington87012Gauge1()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Life form = <code>3</code>; </li>
 *     <li> Category: Australian Special Operations Command (SOCOMD) = <code>30</code>; </li>
 *     <li> SubCategory: ShotGuns  = <code>25</code>; </li>
 *     <li> Specific: _185mmRemington87012Gauge  = <code>50</code>; </li>
 *     <li> Entity type uid: 31572; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@793d09e. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#LIFE_FORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AustralianSpecialOperationsCommandSOCOMD
 * @see SubCategory

 */
public final class _185mmRemington87012Gauge1 extends EntityType
{
    /** Default constructor */
    public _185mmRemington87012Gauge1()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)30); // uid 31543, Australian Special Operations Command (SOCOMD)
        setSubCategory((byte)25); // uid 31571, Shot Guns
        setSpecific((byte)50); // uid 31572, 18.5mm Remington 870 12 Gauge
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _185mmRemington87012Gauge1 createInstance()
    {
            return new _185mmRemington87012Gauge1();
    }
}
