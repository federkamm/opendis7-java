// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.isr.munition.tactical;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Jericho2SecondStageVehicle</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Jericho2SecondStageVehicle.createInstance()</code> or <code>new Jericho2SecondStageVehicle()</code>. </p>
 * <ul>
 *     <li> Country: Israel (ISR) = <code>105</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>TACTICAL</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: Jericho2  = <code>3</code>; </li>
 *     <li> Specific: Jericho2SecondStageVehicle  = <code>1</code>; </li>
 *     <li> Entity type uid: 32526; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@50dc49e1. </p>
 * @see Country#ISRAEL_ISR
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class Jericho2SecondStageVehicle extends EntityType
{
    /** Default constructor */
    public Jericho2SecondStageVehicle()
    {
        setCountry(Country.ISRAEL_ISR);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.TACTICAL));

        setCategory((byte)1); // uid 29011, Guided
        setSubCategory((byte)3); // uid 32525, Jericho 2
        setSpecific((byte)1); // uid 32526, Jericho 2 Second Stage Vehicle
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Jericho2SecondStageVehicle createInstance()
    {
            return new Jericho2SecondStageVehicle();
    }
}
