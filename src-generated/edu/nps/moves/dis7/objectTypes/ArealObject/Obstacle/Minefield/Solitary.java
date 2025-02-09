// autogenerated using string template objecttype.txt

package edu.nps.moves.dis7.objectTypes.ArealObject.Obstacle.Minefield;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v29 (2021-05-19)
 *
 * ObjectType uid: 228
 */
public class Solitary extends ObjectType
{
    /** Default constructor */
    public Solitary()
    {
        setDomain(PlatformDomain.getEnumForValue(0));
        setObjectKind(ObjectKind.getEnumForValue(1)); // Obstacle
        setCategory((byte)1); // Minefield
        setSubCategory((byte)4); // Solitary
    }
}
