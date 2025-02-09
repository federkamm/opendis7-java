// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.swe.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Slpprjm95120mmAPFSDS</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Slpprjm95120mmAPFSDS.createInstance()</code> or <code>new Slpprjm95120mmAPFSDS()</code>. </p>
 * <ul>
 *     <li> Country: Sweden (SWE) = <code>205</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_ARMOR</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _120mm  = <code>4</code>; </li>
 *     <li> Specific: Slpprjm95120mmAPFSDS  = <code>1</code>; </li>
 *     <li> Entity type uid: 25723; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@443af394. </p>
 * @see Country#SWEDEN_SWE
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class Slpprjm95120mmAPFSDS extends EntityType
{
    /** Default constructor */
    public Slpprjm95120mmAPFSDS()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)2); // uid 21647, Ballistic
        setSubCategory((byte)4); // uid 25722, 120 mm
        setSpecific((byte)1); // uid 25723, Slpprj m/95, 120 mm APFSDS
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Slpprjm95120mmAPFSDS createInstance()
    {
            return new Slpprjm95120mmAPFSDS();
    }
}
