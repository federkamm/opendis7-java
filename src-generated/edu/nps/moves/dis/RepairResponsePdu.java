package edu.nps.moves.dis;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis.enumerations.*;


/**
 * Section 7.4.7. Sent after repair complete PDU.
 *
 * Copyright (c) 2008-2019, MOVES Institute, Naval Postgraduate School. All rights reserved.
 * This work is licensed under the BSD open source license, available at https://www.movesinstitute.org/licenses/bsd.html
 *
 * @author DMcG
 */
public class RepairResponsePdu extends LogisticsFamilyPdu implements Serializable
{
   /** Entity that requested repairs.  See 6.2.28 */
   protected EntityID  receivingEntityID = new EntityID(); 

   /** Entity that is repairing.  See 6.2.28 */
   protected EntityID  repairingEntityID = new EntityID(); 

   /** Result of repair operation uid 64 */
   protected RepairResponseRepairResult repairResult = RepairResponseRepairResult.values()[0];

   /** padding */
   protected byte  padding1 = (byte)0;

   /** padding */
   protected short  padding2 = (short)0;


/** Constructor */
 public RepairResponsePdu()
 {
    setPduType( DISPDUType.REPAIR_RESPONSE );
 }

public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = super.getMarshalledSize();
   marshalSize += receivingEntityID.getMarshalledSize();
   marshalSize += repairingEntityID.getMarshalledSize();
   marshalSize += repairResult.getMarshalledSize();
   marshalSize += 1;  // padding1
   marshalSize += 2;  // padding2

   return marshalSize;
}


public RepairResponsePdu setReceivingEntityID(EntityID pReceivingEntityID)
{
    receivingEntityID = pReceivingEntityID;
    return this;
}

public EntityID getReceivingEntityID()
{
    return receivingEntityID; 
}

public RepairResponsePdu setRepairingEntityID(EntityID pRepairingEntityID)
{
    repairingEntityID = pRepairingEntityID;
    return this;
}

public EntityID getRepairingEntityID()
{
    return repairingEntityID; 
}

public RepairResponsePdu setRepairResult(RepairResponseRepairResult pRepairResult)
{
    repairResult = pRepairResult;
    return this;
}

public RepairResponseRepairResult getRepairResult()
{
    return repairResult; 
}

public RepairResponsePdu setPadding1(byte pPadding1)
{
    padding1 = pPadding1;
    return this;
}

public byte getPadding1()
{
    return padding1; 
}

public RepairResponsePdu setPadding2(short pPadding2)
{
    padding2 = pPadding2;
    return this;
}

public short getPadding2()
{
    return padding2; 
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
       receivingEntityID.marshal(dos);
       repairingEntityID.marshal(dos);
       repairResult.marshal(dos);
       dos.writeByte( (byte)padding1);
       dos.writeShort( (short)padding2);
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
        uPosition += receivingEntityID.unmarshal(dis);
        uPosition += repairingEntityID.unmarshal(dis);
        repairResult = RepairResponseRepairResult.unmarshalEnum(dis);
        uPosition += repairResult.getMarshalledSize();
        padding1 = (byte)dis.readUnsignedByte();
        uPosition += 1;
        padding2 = (short)dis.readUnsignedShort();
        uPosition += 2;
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
   receivingEntityID.marshal(buff);
   repairingEntityID.marshal(buff);
   repairResult.marshal(buff);
   buff.put( (byte)padding1);
   buff.putShort( (short)padding2);
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

    receivingEntityID.unmarshal(buff);
    repairingEntityID.unmarshal(buff);
    repairResult = RepairResponseRepairResult.unmarshalEnum(buff);
    padding1 = (byte)(buff.get() & 0xFF);
    padding2 = (short)(buff.getShort() & 0xFFFF);
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

    if(!(obj instanceof RepairResponsePdu))
        return false;

     final RepairResponsePdu rhs = (RepairResponsePdu)obj;

     if( ! (receivingEntityID.equals( rhs.receivingEntityID) )) ivarsEqual = false;
     if( ! (repairingEntityID.equals( rhs.repairingEntityID) )) ivarsEqual = false;
     if( ! (repairResult == rhs.repairResult)) ivarsEqual = false;
     if( ! (padding1 == rhs.padding1)) ivarsEqual = false;
     if( ! (padding2 == rhs.padding2)) ivarsEqual = false;
    return ivarsEqual && super.equalsImpl(rhs);
 }
} // end of class
