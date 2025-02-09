/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */
// header autogenerated using string template dis7javalicense.txt

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;
import java.nio.ByteBuffer;

/**
 * 5.5.10 Used by the repairing entity to communicate the repair that has been performed for the entity that requested repair service.
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class RepairCompletePdu extends LogisticsFamilyPdu implements Serializable
{
   /** Entity that is receiving service.  See 6.2.28 */
   protected EntityID  receivingEntityID = new EntityID(); 

   /** Entity that is supplying.  See 6.2.28 */
   protected EntityID  repairingEntityID = new EntityID(); 

   /** Enumeration for type of repair.  See 6.2.74 uid 64 */
   protected RepairCompleteRepair repair = RepairCompleteRepair.values()[0];

   /** padding, number prevents conflict with superclass ivar name */
   protected short padding4 = (short)0;


/** Constructor creates and configures a new instance object */
 public RepairCompletePdu()
 {
    setPduType( DisPduType.REPAIR_COMPLETE );
 }
/** copy method creates a deep copy of current object using preferred marshalling method
 * @return deep copy of PDU */
 public RepairCompletePdu copy()
 {
     return copyDataOutputStream();
 }
/** Creates a "deep copy" of current object using ByteBuffer methods.
 * @return deep copy of PDU */
 public RepairCompletePdu copyByteBuffer()
 {
     RepairCompletePdu newCopy = new RepairCompletePdu();
     ByteBuffer byteBuffer = ByteBuffer.allocate(400);
     try
     {
         this.marshal(byteBuffer);      // working
         newCopy.unmarshal(byteBuffer); // not working
     }
     catch (Exception e)
     {
         System.out.println("RepairCompletePdu deep copy() marshall/unmarshall ByteBuffer exception " + e.getMessage());
         e.printStackTrace();
         System.exit(-1);
     }
     return newCopy;
 }

/** byteArrayOutputStream (baos) is used for marshal/unmarshal serialization
   * @see copyDataOutputStream() */
protected ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/** dataOutputStream (dos) is used for marshal/unmarshal serialization
   * @see copyDataOutputStream() */
protected DataOutputStream      dataOutputStream      = new DataOutputStream(byteArrayOutputStream);

/** copy method creates a deep copy of current object using DataOutputStream methods.
 * @return deep copy of PDU */
 public RepairCompletePdu copyDataOutputStream()
 {
     RepairCompletePdu newCopy = new RepairCompletePdu();
     try
     {
         this.marshal(dataOutputStream);
         byte[] byteArrayDOS = byteArrayOutputStream.toByteArray();
         newCopy.unmarshal(ByteBuffer.wrap(byteArrayDOS));
     }
     catch (Exception e)
     {
         System.out.println("RepairCompletePdu deep copy() marshall/unmarshall DataOutputStream exception " + e.getMessage());
         e.printStackTrace();
         System.exit(-1);
     }
        try
        {
                 dataOutputStream.flush();
            byteArrayOutputStream.flush();
            byteArrayOutputStream.reset();
        }
        catch (IOException ioe)
        {
            System.out.println("RepairCompletePdu copyDataOutputStream() flush IOException: " + ioe.getMessage());
        }
     return newCopy;
 }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = super.getMarshalledSize();
   if (receivingEntityID != null)
       marshalSize += receivingEntityID.getMarshalledSize();
   if (repairingEntityID != null)
       marshalSize += repairingEntityID.getMarshalledSize();
   if (repair != null)
       marshalSize += repair.getMarshalledSize();
   marshalSize += 2;  // padding4

   return marshalSize;
}


/** Setter for {@link RepairCompletePdu#receivingEntityID}
  * @param pReceivingEntityID new value of interest
  * @return same object to permit progressive setters */
public RepairCompletePdu setReceivingEntityID(EntityID pReceivingEntityID)
{
    receivingEntityID = pReceivingEntityID;
    return this;
}
/** Getter for {@link RepairCompletePdu#receivingEntityID}
  * @return value of interest */
public EntityID getReceivingEntityID()
{
    return receivingEntityID;
}


/** Setter for {@link RepairCompletePdu#repairingEntityID}
  * @param pRepairingEntityID new value of interest
  * @return same object to permit progressive setters */
public RepairCompletePdu setRepairingEntityID(EntityID pRepairingEntityID)
{
    repairingEntityID = pRepairingEntityID;
    return this;
}
/** Getter for {@link RepairCompletePdu#repairingEntityID}
  * @return value of interest */
public EntityID getRepairingEntityID()
{
    return repairingEntityID;
}


/** Setter for {@link RepairCompletePdu#repair}
  * @param pRepair new value of interest
  * @return same object to permit progressive setters */
public RepairCompletePdu setRepair(RepairCompleteRepair pRepair)
{
    repair = pRepair;
    return this;
}
/** Getter for {@link RepairCompletePdu#repair}
  * @return value of interest */
public RepairCompleteRepair getRepair()
{
    return repair; 
}

/** Setter for {@link RepairCompletePdu#padding4}
  * @param pPadding4 new value of interest
  * @return same object to permit progressive setters */
public RepairCompletePdu setPadding4(short pPadding4)
{
    padding4 = pPadding4;
    return this;
}
/** Utility setter for {@link RepairCompletePdu#padding4}
  * @param pPadding4 new value of interest
  * @return same object to permit progressive setters */
public RepairCompletePdu setPadding4(int pPadding4){
    padding4 = (short) pPadding4;
    return this;
}
/** Getter for {@link RepairCompletePdu#padding4}
  * @return value of interest */
public short getPadding4()
{
    return padding4; 
}

/**
 * Serializes an object to a DataOutputStream.
 * @throws java.lang.Exception if something goes wrong
 * @see java.io.DataOutputStream
 * @param dos the OutputStream
 */
public void marshal(DataOutputStream dos) throws Exception
{
    super.marshal(dos);
    try 
    {
       receivingEntityID.marshal(dos);
       repairingEntityID.marshal(dos);
       repair.marshal(dos);
       dos.writeShort(padding4);
    }
    catch(Exception e)
    {
      System.err.println(e);
    }
}

/**
 * Deserializes an object from a DataInputStream.
 * @throws java.lang.Exception if something goes wrong
 * @see java.io.DataInputStream
 * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
 * @param dis the InputStream
 * @return marshalled serialized size in bytes
 */
public int unmarshal(DataInputStream dis) throws Exception
{
    int uPosition = 0;
    uPosition += super.unmarshal(dis);

    try 
    {
        uPosition += receivingEntityID.unmarshal(dis);
        uPosition += repairingEntityID.unmarshal(dis);
        repair = RepairCompleteRepair.unmarshalEnum(dis);
        uPosition += repair.getMarshalledSize();
        padding4 = (short)dis.readUnsignedShort();
        uPosition += 2;
    }
    catch(Exception e)
    { 
      System.err.println(e); 
    }
    return getMarshalledSize();
}

/**
 * Packs an object into the ByteBuffer.
 * @throws java.nio.BufferOverflowException if byteBuffer is too small
 * @throws java.nio.ReadOnlyBufferException if byteBuffer is read only
 * @see java.nio.ByteBuffer
 * @param byteBuffer The ByteBuffer at the position to begin writing
 * @throws Exception ByteBuffer-generated exception
 */
public void marshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
   super.marshal(byteBuffer);
   receivingEntityID.marshal(byteBuffer);
   repairingEntityID.marshal(byteBuffer);
   repair.marshal(byteBuffer);
   byteBuffer.putShort( (short)padding4);
}

/**
 * Unpacks a Pdu from the underlying data.
 * @throws java.nio.BufferUnderflowException if byteBuffer is too small
 * @see java.nio.ByteBuffer
 * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
 * @param byteBuffer The ByteBuffer at the position to begin reading
 * @return marshalled serialized size in bytes
 * @throws Exception ByteBuffer-generated exception
 */
public int unmarshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
    super.unmarshal(byteBuffer);

    try
    {
        // attribute receivingEntityID marked as not serialized
        receivingEntityID.unmarshal(byteBuffer);
        // attribute repairingEntityID marked as not serialized
        repairingEntityID.unmarshal(byteBuffer);
        // attribute repair marked as not serialized
        repair = RepairCompleteRepair.unmarshalEnum(byteBuffer);
        // attribute padding4 marked as not serialized
        padding4 = (short)(byteBuffer.getShort() & 0xFFFF);
    }
    catch (java.nio.BufferUnderflowException bue)
    {
        System.err.println("*** buffer underflow error while unmarshalling " + this.getClass().getName());
    }
    return getMarshalledSize();
}

 /*
  * Override of default equals method.  Calls equalsImpl() for content comparison.
  */
@Override
 public boolean equals(Object obj)
 {
    if(this == obj)
      return true;

    if(obj == null)
       return false;

    if(!getClass().isAssignableFrom(obj.getClass())) //if(getClass() != obj.getClass())
        return false;

    return equalsImpl(obj);
 }

@Override
 public boolean equalsImpl(Object obj)
 {
     boolean ivarsEqual = true;

     final RepairCompletePdu rhs = (RepairCompletePdu)obj;

     if( ! (receivingEntityID.equals( rhs.receivingEntityID) )) ivarsEqual = false;
     if( ! (repairingEntityID.equals( rhs.repairingEntityID) )) ivarsEqual = false;
     if( ! (repair == rhs.repair)) ivarsEqual = false;
     if( ! (padding4 == rhs.padding4)) ivarsEqual = false;
    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" receivingEntityID:").append(receivingEntityID); // writeOneToString
    sb.append(" repairingEntityID:").append(repairingEntityID); // writeOneToString
    sb.append(" repair:").append(repair); // writeOneToString
    sb.append(" padding4:").append(padding4); // writeOneToString

   return sb.toString();
 }
} // end of class
