/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */
// header autogenerated using string template dis7javalicense.txt

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * 3 x 8-bit fixed binary
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class LEVector3FixedByte extends Object implements Serializable
{
   /** X value */
   protected byte x;

   /** y Value */
   protected byte y;

   /** Z value */
   protected byte z;


/** Constructor creates and configures a new instance object */
 public LEVector3FixedByte()
 {
 }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize += 1;  // x
   marshalSize += 1;  // y
   marshalSize += 1;  // z

   return marshalSize;
}


/** Setter for {@link LEVector3FixedByte#x}
  * @param pX new value of interest
  * @return same object to permit progressive setters */
public LEVector3FixedByte setX(byte pX)
{
    x = pX;
    return this;
}
/** Utility setter for {@link LEVector3FixedByte#x}
  * @param pX new value of interest
  * @return same object to permit progressive setters */
public LEVector3FixedByte setX(int pX){
    x = (byte) pX;
    return this;
}
/** Getter for {@link LEVector3FixedByte#x}
  * @return value of interest */
public byte getX()
{
    return x; 
}

/** Setter for {@link LEVector3FixedByte#y}
  * @param pY new value of interest
  * @return same object to permit progressive setters */
public LEVector3FixedByte setY(byte pY)
{
    y = pY;
    return this;
}
/** Utility setter for {@link LEVector3FixedByte#y}
  * @param pY new value of interest
  * @return same object to permit progressive setters */
public LEVector3FixedByte setY(int pY){
    y = (byte) pY;
    return this;
}
/** Getter for {@link LEVector3FixedByte#y}
  * @return value of interest */
public byte getY()
{
    return y; 
}

/** Setter for {@link LEVector3FixedByte#z}
  * @param pZ new value of interest
  * @return same object to permit progressive setters */
public LEVector3FixedByte setZ(byte pZ)
{
    z = pZ;
    return this;
}
/** Utility setter for {@link LEVector3FixedByte#z}
  * @param pZ new value of interest
  * @return same object to permit progressive setters */
public LEVector3FixedByte setZ(int pZ){
    z = (byte) pZ;
    return this;
}
/** Getter for {@link LEVector3FixedByte#z}
  * @return value of interest */
public byte getZ()
{
    return z; 
}

/**
 * Serializes an object to a DataOutputStream.
 * @throws java.lang.Exception if something goes wrong
 * @see java.io.DataOutputStream
 * @param dos the OutputStream
 */
public void marshal(DataOutputStream dos) throws Exception
{
    try 
    {
       dos.writeByte(x);
       dos.writeByte(y);
       dos.writeByte(z);
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
    try 
    {
        x = (byte)dis.readUnsignedByte();
        uPosition += 1;
        y = (byte)dis.readUnsignedByte();
        uPosition += 1;
        z = (byte)dis.readUnsignedByte();
        uPosition += 1;
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
   byteBuffer.put( (byte)x);
   byteBuffer.put( (byte)y);
   byteBuffer.put( (byte)z);
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
    try
    {
        // attribute x marked as not serialized
        x = (byte)(byteBuffer.get() & 0xFF);
        // attribute y marked as not serialized
        y = (byte)(byteBuffer.get() & 0xFF);
        // attribute z marked as not serialized
        z = (byte)(byteBuffer.get() & 0xFF);
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

 /**
  * Compare all fields that contribute to the state, ignoring
  * transient and static fields, for <code>this</code> and the supplied object
  * @param obj the object to compare to
  * @return true if the objects are equal, false otherwise.
  */
 public boolean equalsImpl(Object obj)
 {
     boolean ivarsEqual = true;

     final LEVector3FixedByte rhs = (LEVector3FixedByte)obj;

     if( ! (x == rhs.x)) ivarsEqual = false;
     if( ! (y == rhs.y)) ivarsEqual = false;
     if( ! (z == rhs.z)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" x:").append(x); // writeOneToString
    sb.append(" y:").append(y); // writeOneToString
    sb.append(" z:").append(z); // writeOneToString

   return sb.toString();
 }
} // end of class
