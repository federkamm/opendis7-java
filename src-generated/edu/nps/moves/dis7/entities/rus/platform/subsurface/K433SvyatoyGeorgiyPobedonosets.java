// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>K433SvyatoyGeorgiyPobedonosets</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>K433SvyatoyGeorgiyPobedonosets.createInstance()</code> or <code>new K433SvyatoyGeorgiyPobedonosets()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SSBN (Nuclear Ballistic Missile) = <code>1</code>; </li>
 *     <li> SubCategory: DeltaIIIClass  = <code>3</code>; </li>
 *     <li> Specific: K433SvyatoyGeorgiyPobedonosets  = <code>6</code>; </li>
 *     <li> Entity type uid: 27190; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@227a47. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSBNNuclearBallisticMissile
 * @see SubCategory

 */
public final class K433SvyatoyGeorgiyPobedonosets extends EntityType
{
    /** Default constructor */
    public K433SvyatoyGeorgiyPobedonosets()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)1); // uid 14759, SSBN (Nuclear Ballistic Missile)
        setSubCategory((byte)3); // uid 14762, Delta III Class
        setSpecific((byte)6); // uid 27190, K-433 Svyatoy Georgiy Pobedonosets
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static K433SvyatoyGeorgiyPobedonosets createInstance()
    {
            return new K433SvyatoyGeorgiyPobedonosets();
    }
}
