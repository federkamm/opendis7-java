// autogenerated using string template objecttype.txt

package edu.nps.moves.dis7.objectTypes.PointObject.Preparedposition.InfantryFightingPosition;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v29 (2021-05-19)
 *
 * ObjectType uid: 226
 */
public class NonCoveredMachineGunBunker extends ObjectType
{
    /** Default constructor */
    public NonCoveredMachineGunBunker()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(2)); // Prepared position
        setCategory((byte)2); // Infantry Fighting Position
        setSubCategory((byte)4); // Non-Covered Machine Gun Bunker
    }
}
