// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SklinnaNorway</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SklinnaNorway.createInstance()</code> or <code>new SklinnaNorway()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SS (Conventional attack-torpedo patrol) = <code>5</code>; </li>
 *     <li> SubCategory: ModernizedKobbenclasstype207  = <code>5</code>; </li>
 *     <li> Specific: SklinnaNorway  = <code>1</code>; </li>
 *     <li> Entity type uid: 16788; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1e636ea3. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSConventionalattacktorpedopatrol
 * @see SubCategory

 */
public final class SklinnaNorway extends EntityType
{
    /** Default constructor */
    public SklinnaNorway()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 16757, SS (Conventional attack-torpedo patrol)
        setSubCategory((byte)5); // uid 16787, Modernized Kobben class (type 207)
        setSpecific((byte)1); // uid 16788, Sklinna (Norway)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SklinnaNorway createInstance()
    {
            return new SklinnaNorway();
    }
}
