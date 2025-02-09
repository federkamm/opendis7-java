// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.csk.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SojkaIII</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SojkaIII.createInstance()</code> or <code>new SojkaIII()</code>. </p>
 * <ul>
 *     <li> Country: Czechoslovakia (CSK) = <code>56</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Unmanned = <code>50</code>; </li>
 *     <li> SubCategory: Sojka  = <code>1</code>; </li>
 *     <li> Specific: SojkaIII  = <code>1</code>; </li>
 *     <li> Entity type uid: 25376; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@313b2ea6. </p>
 * @see Country#ACTION_REQUEST_RELIABLE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Unmanned
 * @see SubCategory

 */
public final class SojkaIII extends EntityType
{
    /** Default constructor */
    public SojkaIII()
    {
        setCountry(Country.ACTION_REQUEST_RELIABLE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)50); // uid 25374, Unmanned
        setSubCategory((byte)1); // uid 25375, Sojka
        setSpecific((byte)1); // uid 25376, Sojka III
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SojkaIII createInstance()
    {
            return new SojkaIII();
    }
}
