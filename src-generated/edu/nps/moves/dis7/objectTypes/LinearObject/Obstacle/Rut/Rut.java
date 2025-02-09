// autogenerated using string template objecttype.txt

package edu.nps.moves.dis7.objectTypes.LinearObject.Obstacle.Rut;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v29 (2021-05-19)
 *
 * ObjectType uid: 227
 */
public class Rut extends ObjectType
{
    /** Default constructor */
    public Rut()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(1)); // Obstacle
        setCategory((byte)5); // Rut
    }
}
