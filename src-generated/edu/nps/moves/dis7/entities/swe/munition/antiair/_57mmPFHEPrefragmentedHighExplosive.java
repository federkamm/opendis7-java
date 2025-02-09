// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.swe.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_57mmPFHEPrefragmentedHighExplosive</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_57mmPFHEPrefragmentedHighExplosive.createInstance()</code> or <code>new _57mmPFHEPrefragmentedHighExplosive()</code>. </p>
 * <ul>
 *     <li> Country: Sweden (SWE) = <code>205</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_AIR</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _57mm  = <code>2</code>; </li>
 *     <li> Specific: _57mmPFHEPrefragmentedHighExplosive  = <code>1</code>; </li>
 *     <li> Entity type uid: 27448; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@48632f69. </p>
 * @see Country#SWEDEN_SWE
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class _57mmPFHEPrefragmentedHighExplosive extends EntityType
{
    /** Default constructor */
    public _57mmPFHEPrefragmentedHighExplosive()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)2); // uid 21641, Ballistic
        setSubCategory((byte)2); // uid 21645, 57 mm
        setSpecific((byte)1); // uid 27448, 57 mm PFHE (Prefragmented High Explosive)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _57mmPFHEPrefragmentedHighExplosive createInstance()
    {
            return new _57mmPFHEPrefragmentedHighExplosive();
    }
}
