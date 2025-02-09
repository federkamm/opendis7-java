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
 * Operational data for describing the vectoring nozzle systems Section 6.2.96
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class VectoringNozzleSystem extends Object implements Serializable
{
   /** In degrees */
   protected float horizontalDeflectionAngle;

   /** In degrees */
   protected float verticalDeflectionAngle;


/** Constructor creates and configures a new instance object */
 public VectoringNozzleSystem()
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

   marshalSize += 4;  // horizontalDeflectionAngle
   marshalSize += 4;  // verticalDeflectionAngle

   return marshalSize;
}


/** Setter for {@link VectoringNozzleSystem#horizontalDeflectionAngle}
  * @param pHorizontalDeflectionAngle new value of interest
  * @return same object to permit progressive setters */
public VectoringNozzleSystem setHorizontalDeflectionAngle(float pHorizontalDeflectionAngle)
{
    horizontalDeflectionAngle = pHorizontalDeflectionAngle;
    return this;
}
/** Getter for {@link VectoringNozzleSystem#horizontalDeflectionAngle}
  * @return value of interest */
public float getHorizontalDeflectionAngle()
{
    return horizontalDeflectionAngle; 
}

/** Setter for {@link VectoringNozzleSystem#verticalDeflectionAngle}
  * @param pVerticalDeflectionAngle new value of interest
  * @return same object to permit progressive setters */
public VectoringNozzleSystem setVerticalDeflectionAngle(float pVerticalDeflectionAngle)
{
    verticalDeflectionAngle = pVerticalDeflectionAngle;
    return this;
}
/** Getter for {@link VectoringNozzleSystem#verticalDeflectionAngle}
  * @return value of interest */
public float getVerticalDeflectionAngle()
{
    return verticalDeflectionAngle; 
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
       dos.writeFloat(horizontalDeflectionAngle);
       dos.writeFloat(verticalDeflectionAngle);
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
        horizontalDeflectionAngle = dis.readFloat();
        uPosition += 4;
        verticalDeflectionAngle = dis.readFloat();
        uPosition += 4;
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
   byteBuffer.putFloat( (float)horizontalDeflectionAngle);
   byteBuffer.putFloat( (float)verticalDeflectionAngle);
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
        // attribute horizontalDeflectionAngle marked as not serialized
        horizontalDeflectionAngle = byteBuffer.getFloat();
        // attribute verticalDeflectionAngle marked as not serialized
        verticalDeflectionAngle = byteBuffer.getFloat();
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

     final VectoringNozzleSystem rhs = (VectoringNozzleSystem)obj;

     if( ! (horizontalDeflectionAngle == rhs.horizontalDeflectionAngle)) ivarsEqual = false;
     if( ! (verticalDeflectionAngle == rhs.verticalDeflectionAngle)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" horizontalDeflectionAngle:").append(horizontalDeflectionAngle); // writeOneToString
    sb.append(" verticalDeflectionAngle:").append(verticalDeflectionAngle); // writeOneToString

   return sb.toString();
 }
} // end of class
