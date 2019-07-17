package edu.nps.moves.dis;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis.enumerations.*;


/**
 * Represents the firing or detonation of a munition. Section 6.2.19.2
 *
 * Copyright (c) 2008-2019, MOVES Institute, Naval Postgraduate School. All rights reserved.
 * This work is licensed under the BSD open source license, available at https://www.movesinstitute.org/licenses/bsd.html
 *
 * @author DMcG
 */
public class MunitionDescriptor extends Object implements Serializable
{
   /** What munition was used in the burst */
   protected EntityType  munitionType = new EntityType(); 

   /** type of warhead enumeration uid 60 */
   protected MunitionDescriptorWarhead warhead = MunitionDescriptorWarhead.values()[0];

   /** type of fuse used enumeration uid 61 */
   protected MunitionDescriptorFuse fuse = MunitionDescriptorFuse.values()[0];

   /** how many of the munition were fired */
   protected short  quantity;

   /** rate at which the munition was fired */
   protected short  rate;


/** Constructor */
 public MunitionDescriptor()
 {
 }

public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize += munitionType.getMarshalledSize();
   marshalSize += warhead.getMarshalledSize();
   marshalSize += fuse.getMarshalledSize();
   marshalSize += 2;  // quantity
   marshalSize += 2;  // rate

   return marshalSize;
}


public MunitionDescriptor setMunitionType(EntityType pMunitionType)
{
    munitionType = pMunitionType;
    return this;
}

public EntityType getMunitionType()
{
    return munitionType; 
}

public MunitionDescriptor setWarhead(MunitionDescriptorWarhead pWarhead)
{
    warhead = pWarhead;
    return this;
}

public MunitionDescriptorWarhead getWarhead()
{
    return warhead; 
}

public MunitionDescriptor setFuse(MunitionDescriptorFuse pFuse)
{
    fuse = pFuse;
    return this;
}

public MunitionDescriptorFuse getFuse()
{
    return fuse; 
}

public MunitionDescriptor setQuantity(short pQuantity)
{
    quantity = pQuantity;
    return this;
}

public short getQuantity()
{
    return quantity; 
}

public MunitionDescriptor setRate(short pRate)
{
    rate = pRate;
    return this;
}

public short getRate()
{
    return rate; 
}

/**
 * Serializes an object to a DataOutputStream.
 * @see java.io.DataOutputStream
 * @param dos The DataOutputStream
 */
public void marshal(DataOutputStream dos)
{
    try 
    {
       munitionType.marshal(dos);
       warhead.marshal(dos);
       fuse.marshal(dos);
       dos.writeShort( (short)quantity);
       dos.writeShort( (short)rate);
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
    try 
    {
        uPosition += munitionType.unmarshal(dis);
        warhead = MunitionDescriptorWarhead.unmarshalEnum(dis);
        uPosition += warhead.getMarshalledSize();
        fuse = MunitionDescriptorFuse.unmarshalEnum(dis);
        uPosition += fuse.getMarshalledSize();
        quantity = (short)dis.readUnsignedShort();
        uPosition += 2;
        rate = (short)dis.readUnsignedShort();
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
   munitionType.marshal(buff);
   warhead.marshal(buff);
   fuse.marshal(buff);
   buff.putShort( (short)quantity);
   buff.putShort( (short)rate);
}

/**
 * Unpacks a Pdu from the underlying data.
 * @throws java.nio.BufferUnderflowException if buff is too small
 * @see java.nio.ByteBuffer
 * @param buff The ByteBuffer at the position to begin reading
 */
public int unmarshal(java.nio.ByteBuffer buff) throws Exception
{
    munitionType.unmarshal(buff);
    warhead = MunitionDescriptorWarhead.unmarshalEnum(buff);
    fuse = MunitionDescriptorFuse.unmarshalEnum(buff);
    quantity = (short)(buff.getShort() & 0xFFFF);
    rate = (short)(buff.getShort() & 0xFFFF);
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

 /**
  * Compare all fields that contribute to the state, ignoring
  * transient and static fields, for <code>this</code> and the supplied object
  * @param obj the object to compare to
  * @return true if the objects are equal, false otherwise.
  */
 public boolean equalsImpl(Object obj)
 {
     boolean ivarsEqual = true;

    if(!(obj instanceof MunitionDescriptor))
        return false;

     final MunitionDescriptor rhs = (MunitionDescriptor)obj;

     if( ! (munitionType.equals( rhs.munitionType) )) ivarsEqual = false;
     if( ! (warhead == rhs.warhead)) ivarsEqual = false;
     if( ! (fuse == rhs.fuse)) ivarsEqual = false;
     if( ! (quantity == rhs.quantity)) ivarsEqual = false;
     if( ! (rate == rhs.rate)) ivarsEqual = false;
    return ivarsEqual;
 }
} // end of class
