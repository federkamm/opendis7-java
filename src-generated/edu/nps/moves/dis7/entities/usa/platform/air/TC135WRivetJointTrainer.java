// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TC135WRivetJointTrainer</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TC135WRivetJointTrainer.createInstance()</code> or <code>new TC135WRivetJointTrainer()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Trainer = <code>40</code>; </li>
 *     <li> SubCategory: BoeingTC135  = <code>9</code>; </li>
 *     <li> Specific: TC135WRivetJointTrainer  = <code>1</code>; </li>
 *     <li> Entity type uid: 11223; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@553d2579. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Trainer
 * @see SubCategory

 */
public final class TC135WRivetJointTrainer extends EntityType
{
    /** Default constructor */
    public TC135WRivetJointTrainer()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)40); // uid 11205, Trainer
        setSubCategory((byte)9); // uid 11222, Boeing TC-135
        setSpecific((byte)1); // uid 11223, TC-135W Rivet Joint Trainer
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TC135WRivetJointTrainer createInstance()
    {
            return new TC135WRivetJointTrainer();
    }
}
