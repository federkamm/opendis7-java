// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.arg.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>FMAFAdeAPampa</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>FMAFAdeAPampa.createInstance()</code> or <code>new FMAFAdeAPampa()</code>. </p>
 * <ul>
 *     <li> Country: Argentina (ARG) = <code>10</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Trainer = <code>40</code>; </li>
 *     <li> SubCategory: FMAFAdeAPampa  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 24775; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@e2d56bf. </p>
 * @see Country#ARGENTINA_ARG
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Trainer
 * @see SubCategory

 */
public final class FMAFAdeAPampa extends EntityType
{
    /** Default constructor */
    public FMAFAdeAPampa()
    {
        setCountry(Country.ARGENTINA_ARG);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)40); // uid 24774, Trainer
        setSubCategory((byte)1); // uid 24775, FMA/FAdeA Pampa
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static FMAFAdeAPampa createInstance()
    {
            return new FMAFAdeAPampa();
    }
}
