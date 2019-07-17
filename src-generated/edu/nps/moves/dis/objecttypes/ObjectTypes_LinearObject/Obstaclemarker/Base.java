package edu.nps.moves.dis.objecttypes.ObjectTypes_LinearObject.Obstaclemarker;

import edu.nps.moves.dis.enumerations.*;
import edu.nps.moves.dis.objecttypes.ObjectTypes_LinearObject.LinearObject;

abstract public class Base extends LinearObject
{
    public Base()
    {
    	setDomain(PlatformDomain.LAND);
        setObjectKind(ObjectKind.OBSTACLE_MARKER);
    }
}
