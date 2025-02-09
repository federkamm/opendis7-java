// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.afg.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_9mmMakarovPM1</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_9mmMakarovPM1.createInstance()</code> or <code>new _9mmMakarovPM1()</code>. </p>
 * <ul>
 *     <li> Country: Afghanistan (AFG) = <code>1</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Life form = <code>3</code>; </li>
 *     <li> Category: Afghan Border Police (ABP) = <code>53</code>; </li>
 *     <li> SubCategory: HandGuns  = <code>80</code>; </li>
 *     <li> Specific: _9mmMakarovPM  = <code>34</code>; </li>
 *     <li> Entity type uid: 32198; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2bcb1414. </p>
 * @see Country#AFGHANISTAN_AFG
 * @see EntityKind#LIFE_FORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AfghanBorderPoliceABP
 * @see SubCategory

 */
public final class _9mmMakarovPM1 extends EntityType
{
    /** Default constructor */
    public _9mmMakarovPM1()
    {
        setCountry(Country.AFGHANISTAN_AFG);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)53); // uid 32196, Afghan Border Police (ABP)
        setSubCategory((byte)80); // uid 32197, Hand Guns
        setSpecific((byte)34); // uid 32198, 9mm Makarov PM
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _9mmMakarovPM1 createInstance()
    {
            return new _9mmMakarovPM1();
    }
}
