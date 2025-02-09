// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.che.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>HEIBF</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HEIBF.createInstance()</code> or <code>new HEIBF()</code>. </p>
 * <ul>
 *     <li> Country: Switzerland (CHE) = <code>206</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_AIR</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _35mm  = <code>1</code>; </li>
 *     <li> Specific: HEIBF  = <code>6</code>; </li>
 *     <li> Entity type uid: 21732; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6f106af8. </p>
 * @see Country#SWITZERLAND_CHE
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class HEIBF extends EntityType
{
    /** Default constructor */
    public HEIBF()
    {
        setCountry(Country.SWITZERLAND_CHE);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)2); // uid 21725, Ballistic
        setSubCategory((byte)1); // uid 21726, 35 mm
        setSpecific((byte)6); // uid 21732, HEI-BF
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HEIBF createInstance()
    {
            return new HEIBF();
    }
}
