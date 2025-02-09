// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.mar.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_408DaoudBenAicha</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_408DaoudBenAicha.createInstance()</code> or <code>new _408DaoudBenAicha()</code>. </p>
 * <ul>
 *     <li> Country: Morocco (MAR) = <code>147</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: DakhlaClass  = <code>1</code>; </li>
 *     <li> Specific: _408DaoudBenAicha  = <code>1</code>; </li>
 *     <li> Entity type uid: 27728; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3b809711. </p>
 * @see Country#MOROCCO_MAR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class _408DaoudBenAicha extends EntityType
{
    /** Default constructor */
    public _408DaoudBenAicha()
    {
        setCountry(Country.MOROCCO_MAR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 27726, Auxiliary
        setSubCategory((byte)1); // uid 27727, Dakhla Class
        setSpecific((byte)1); // uid 27728, 408 Daoud Ben Aicha
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _408DaoudBenAicha createInstance()
    {
            return new _408DaoudBenAicha();
    }
}
