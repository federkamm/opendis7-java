package edu.nps.moves.dis;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis.enumerations.*;


/**
 * 16 bit fixed binaries
 *
 * Copyright (c) 2008-2019, MOVES Institute, Naval Postgraduate School. All rights reserved.
 * This work is licensed under the BSD open source license, available at https://www.movesinstitute.org/licenses/bsd.html
 *
 * @author DMcG
 */
public class LiveEntityLinearVelocity extends Object implements Serializable
{
   protected short  xComponent;

   protected short  yComponent;

   protected short  zComponent;


/** Constructor */
 public LiveEntityLinearVelocity()
 {
 }

public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize += 2;  // xComponent
   marshalSize += 2;  // yComponent
   marshalSize += 2;  // zComponent

   return marshalSize;
}


public LiveEntityLinearVelocity setXComponent(short pXComponent)
{
    xComponent = pXComponent;
    return this;
}

public short getXComponent()
{
    return xComponent; 
}

public LiveEntityLinearVelocity setYComponent(short pYComponent)
{
    yComponent = pYComponent;
    return this;
}

public short getYComponent()
{
    return yComponent; 
}

public LiveEntityLinearVelocity setZComponent(short pZComponent)
{
    zComponent = pZComponent;
    return this;
}

public short getZComponent()
{
    return zComponent; 
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
       dos.writeShort( (short)xComponent);
       dos.writeShort( (short)yComponent);
       dos.writeShort( (short)zComponent);
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
        xComponent = (short)dis.readUnsignedShort();
        uPosition += 2;
        yComponent = (short)dis.readUnsignedShort();
        uPosition += 2;
        zComponent = (short)dis.readUnsignedShort();
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
   buff.putShort( (short)xComponent);
   buff.putShort( (short)yComponent);
   buff.putShort( (short)zComponent);
}

/**
 * Unpacks a Pdu from the underlying data.
 * @throws java.nio.BufferUnderflowException if buff is too small
 * @see java.nio.ByteBuffer
 * @param buff The ByteBuffer at the position to begin reading
 */
public int unmarshal(java.nio.ByteBuffer buff) throws Exception
{
    xComponent = (short)(buff.getShort() & 0xFFFF);
    yComponent = (short)(buff.getShort() & 0xFFFF);
    zComponent = (short)(buff.getShort() & 0xFFFF);
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

    if(!(obj instanceof LiveEntityLinearVelocity))
        return false;

     final LiveEntityLinearVelocity rhs = (LiveEntityLinearVelocity)obj;

     if( ! (xComponent == rhs.xComponent)) ivarsEqual = false;
     if( ! (yComponent == rhs.yComponent)) ivarsEqual = false;
     if( ! (zComponent == rhs.zComponent)) ivarsEqual = false;
    return ivarsEqual;
 }
} // end of class
