// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.prk.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SohungClassfastattackcraftmissile</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SohungClassfastattackcraftmissile.createInstance()</code> or <code>new SohungClassfastattackcraftmissile()</code>. </p>
 * <ul>
 *     <li> Country: Korea (Democratic Peoples Republic of) (PRK) = <code>119</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: SohungClassfastattackcraftmissile  = <code>3</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 17771; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@241a53ef. </p>
 * @see Country#KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightpatrolCraft
 * @see SubCategory

 */
public final class SohungClassfastattackcraftmissile extends EntityType
{
    /** Default constructor */
    public SohungClassfastattackcraftmissile()
    {
        setCountry(Country.KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 17768, Light/patrol Craft
        setSubCategory((byte)3); // uid 17771, Sohung Class (fast attack craft-missile)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SohungClassfastattackcraftmissile createInstance()
    {
            return new SohungClassfastattackcraftmissile();
    }
}
