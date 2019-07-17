package edu.nps.moves.dis;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis.enumerations.*;


/**
 * Information about the addition/modification of an oobject that is geometrically anchored to the terrain with a set of three or more points that come to a closure. Section 7.10.6
 *
 * Copyright (c) 2008-2019, MOVES Institute, Naval Postgraduate School. All rights reserved.
 * This work is licensed under the BSD open source license, available at https://www.movesinstitute.org/licenses/bsd.html
 *
 * @author DMcG
 */
public class ArealObjectStatePdu extends SyntheticEnvironmentFamilyPdu implements Serializable
{
   /** Object in synthetic environment */
   protected ObjectIdentifier  objectID = new ObjectIdentifier(); 

   /** Object with which this point object is associated */
   protected ObjectIdentifier  referencedObjectID = new ObjectIdentifier(); 

   /** unique update number of each state transition of an object */
   protected short  updateNumber;

   /** force ID uid 6 */
   protected ForceID forceID = ForceID.values()[0];

   /** modifications enumeration uid 242 */
   protected ObjectStateModificationArealObject modifications = new ObjectStateModificationArealObject();

   /** Object type */
   protected ObjectType  objectType = new ObjectType(); 

   /** Object appearance */
   protected int  specificObjectAppearance;

   /** Object appearance */
   protected short  generalObjectAppearance;

   /** Number of points */
   protected short  numberOfPoints;

   /** requesterID */
   protected SimulationAddress  requesterID = new SimulationAddress(); 

   /** receiver ID */
   protected SimulationAddress  receivingID = new SimulationAddress(); 

   /** location of object */
   protected List< Vector3Double > objectLocation = new ArrayList< Vector3Double >();
 

/** Constructor */
 public ArealObjectStatePdu()
 {
    setPduType( DISPDUType.AREAL_OBJECT_STATE );
 }

public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = super.getMarshalledSize();
   marshalSize += objectID.getMarshalledSize();
   marshalSize += referencedObjectID.getMarshalledSize();
   marshalSize += 2;  // updateNumber
   marshalSize += forceID.getMarshalledSize();
   marshalSize += objectType.getMarshalledSize();
   marshalSize += 4;  // specificObjectAppearance
   marshalSize += 2;  // generalObjectAppearance
   marshalSize += 2;  // numberOfPoints
   marshalSize += requesterID.getMarshalledSize();
   marshalSize += receivingID.getMarshalledSize();
   for(int idx=0; idx < objectLocation.size(); idx++)
   {
        Vector3Double listElement = objectLocation.get(idx);
        marshalSize += listElement.getMarshalledSize();
   }

   return marshalSize;
}


public ArealObjectStatePdu setObjectID(ObjectIdentifier pObjectID)
{
    objectID = pObjectID;
    return this;
}

public ObjectIdentifier getObjectID()
{
    return objectID; 
}

public ArealObjectStatePdu setReferencedObjectID(ObjectIdentifier pReferencedObjectID)
{
    referencedObjectID = pReferencedObjectID;
    return this;
}

public ObjectIdentifier getReferencedObjectID()
{
    return referencedObjectID; 
}

public ArealObjectStatePdu setUpdateNumber(short pUpdateNumber)
{
    updateNumber = pUpdateNumber;
    return this;
}

public short getUpdateNumber()
{
    return updateNumber; 
}

public ArealObjectStatePdu setForceID(ForceID pForceID)
{
    forceID = pForceID;
    return this;
}

public ForceID getForceID()
{
    return forceID; 
}

public ArealObjectStatePdu setModifications(ObjectStateModificationArealObject pModifications)
{
    modifications = pModifications;
    return this;
}

public ObjectStateModificationArealObject getModifications()
{
    return modifications; 
}

public ArealObjectStatePdu setObjectType(ObjectType pObjectType)
{
    objectType = pObjectType;
    return this;
}

public ObjectType getObjectType()
{
    return objectType; 
}

public ArealObjectStatePdu setSpecificObjectAppearance(int pSpecificObjectAppearance)
{
    specificObjectAppearance = pSpecificObjectAppearance;
    return this;
}

public int getSpecificObjectAppearance()
{
    return specificObjectAppearance; 
}

public ArealObjectStatePdu setGeneralObjectAppearance(short pGeneralObjectAppearance)
{
    generalObjectAppearance = pGeneralObjectAppearance;
    return this;
}

public short getGeneralObjectAppearance()
{
    return generalObjectAppearance; 
}

public ArealObjectStatePdu setRequesterID(SimulationAddress pRequesterID)
{
    requesterID = pRequesterID;
    return this;
}

public SimulationAddress getRequesterID()
{
    return requesterID; 
}

public ArealObjectStatePdu setReceivingID(SimulationAddress pReceivingID)
{
    receivingID = pReceivingID;
    return this;
}

public SimulationAddress getReceivingID()
{
    return receivingID; 
}

public ArealObjectStatePdu setObjectLocation(List<Vector3Double> pObjectLocation)
{
    objectLocation = pObjectLocation;
    return this;
}

public List<Vector3Double> getObjectLocation()
{
    return objectLocation; 
}

/**
 * Serializes an object to a DataOutputStream.
 * @see java.io.DataOutputStream
 * @param dos The DataOutputStream
 */
public void marshal(DataOutputStream dos)
{
    super.marshal(dos);
    try 
    {
       objectID.marshal(dos);
       referencedObjectID.marshal(dos);
       dos.writeShort( (short)updateNumber);
       forceID.marshal(dos);
       modifications.marshal(dos);
       objectType.marshal(dos);
       dos.writeInt( (int)specificObjectAppearance);
       dos.writeShort( (short)generalObjectAppearance);
       dos.writeShort( (short)objectLocation.size());
       requesterID.marshal(dos);
       receivingID.marshal(dos);

       for(int idx = 0; idx < objectLocation.size(); idx++)
       {
            Vector3Double aVector3Double = objectLocation.get(idx);
            aVector3Double.marshal(dos);
       }

    }
    catch(Exception e)
    {
      System.err.println(e);
    }
}

/**
 * Unserializes an object from a DataInputStream.
 * @see java.io.DataInputStream
 * @param dis The DataInputStream
 */
public int unmarshal(DataInputStream dis)
{
    int uPosition = 0;
    uPosition += super.unmarshal(dis);

    try 
    {
        uPosition += objectID.unmarshal(dis);
        uPosition += referencedObjectID.unmarshal(dis);
        updateNumber = (short)dis.readUnsignedShort();
        uPosition += 2;
        forceID = ForceID.unmarshalEnum(dis);
        uPosition += forceID.getMarshalledSize();
        uPosition += modifications.unmarshal(dis);
        uPosition += objectType.unmarshal(dis);
        specificObjectAppearance = dis.readInt();
        uPosition += 4;
        generalObjectAppearance = (short)dis.readUnsignedShort();
        uPosition += 2;
        numberOfPoints = (short)dis.readUnsignedShort();
        uPosition += 2;
        uPosition += requesterID.unmarshal(dis);
        uPosition += receivingID.unmarshal(dis);
        for(int idx = 0; idx < numberOfPoints; idx++)
        {
            Vector3Double anX = new Vector3Double();
            uPosition += anX.unmarshal(dis);
            objectLocation.add(anX);
        }

    }
    catch(Exception e)
    { 
      System.out.println(e); 
    }
    return getMarshalledSize();
}

/**
 * Packs an object into the ByteBuffer.
 * @throws java.nio.BufferOverflowException if buff is too small
 * @throws java.nio.ReadOnlyBufferException if buff is read only
 * @see java.nio.ByteBuffer
 * @param buff The ByteBuffer at the position to begin writing
 */
public void marshal(java.nio.ByteBuffer buff) throws Exception
{
   super.marshal(buff);
   objectID.marshal(buff);
   referencedObjectID.marshal(buff);
   buff.putShort( (short)updateNumber);
   forceID.marshal(buff);
   modifications.marshal(buff);
   objectType.marshal(buff);
   buff.putInt( (int)specificObjectAppearance);
   buff.putShort( (short)generalObjectAppearance);
   buff.putShort( (short)objectLocation.size());
   requesterID.marshal(buff);
   receivingID.marshal(buff);

   for(int idx = 0; idx < objectLocation.size(); idx++)
   {
        Vector3Double aVector3Double = (Vector3Double)objectLocation.get(idx);
        aVector3Double.marshal(buff);
   }

}

/**
 * Unpacks a Pdu from the underlying data.
 * @throws java.nio.BufferUnderflowException if buff is too small
 * @see java.nio.ByteBuffer
 * @param buff The ByteBuffer at the position to begin reading
 */
public int unmarshal(java.nio.ByteBuffer buff) throws Exception
{
    super.unmarshal(buff);

    objectID.unmarshal(buff);
    referencedObjectID.unmarshal(buff);
    updateNumber = (short)(buff.getShort() & 0xFFFF);
    forceID = ForceID.unmarshalEnum(buff);
    modifications.unmarshal(buff);
    objectType.unmarshal(buff);
    specificObjectAppearance = buff.getInt();
    generalObjectAppearance = (short)(buff.getShort() & 0xFFFF);
    numberOfPoints = (short)(buff.getShort() & 0xFFFF);
    requesterID.unmarshal(buff);
    receivingID.unmarshal(buff);
    for(int idx = 0; idx < numberOfPoints; idx++)
    {
    Vector3Double anX = new Vector3Double();
    anX.unmarshal(buff);
    objectLocation.add(anX);
    }

    return getMarshalledSize();
}

 /*
  * The equals method doesn't always work--mostly it works only on classes that consist only of primitives. Be careful.
  */
@Override
 public boolean equals(Object obj)
 {
    if(this == obj)
      return true;

    if(obj == null)
       return false;

    if(getClass() != obj.getClass())
        return false;

    return equalsImpl(obj);
 }

@Override
 public boolean equalsImpl(Object obj)
 {
     boolean ivarsEqual = true;

    if(!(obj instanceof ArealObjectStatePdu))
        return false;

     final ArealObjectStatePdu rhs = (ArealObjectStatePdu)obj;

     if( ! (objectID.equals( rhs.objectID) )) ivarsEqual = false;
     if( ! (referencedObjectID.equals( rhs.referencedObjectID) )) ivarsEqual = false;
     if( ! (updateNumber == rhs.updateNumber)) ivarsEqual = false;
     if( ! (forceID == rhs.forceID)) ivarsEqual = false;
     if( ! (objectType.equals( rhs.objectType) )) ivarsEqual = false;
     if( ! (specificObjectAppearance == rhs.specificObjectAppearance)) ivarsEqual = false;
     if( ! (generalObjectAppearance == rhs.generalObjectAppearance)) ivarsEqual = false;
     if( ! (numberOfPoints == rhs.numberOfPoints)) ivarsEqual = false;
     if( ! (requesterID.equals( rhs.requesterID) )) ivarsEqual = false;
     if( ! (receivingID.equals( rhs.receivingID) )) ivarsEqual = false;

     for(int idx = 0; idx < objectLocation.size(); idx++)
        if( ! ( objectLocation.get(idx).equals(rhs.objectLocation.get(idx)))) ivarsEqual = false;

    return ivarsEqual && super.equalsImpl(rhs);
 }
} // end of class
