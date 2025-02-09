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
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class GridAxisDescriptor extends Object implements Serializable
{
   /** coordinate of the grid origin or initial value */
   protected double domainInitialXi;

   /** coordinate of the endpoint or final value */
   protected double domainFinalXi;

   /** The number of grid points along the Xi domain axis for the enviornmental state data */
   protected short domainPointsXi;

   /** interleaf factor along the domain axis. */
   protected byte interleafFactor;

   /** type of grid axis uid 377 */
   protected GridAxisDescriptorAxisType axisType = GridAxisDescriptorAxisType.values()[0];


/** Constructor creates and configures a new instance object */
 public GridAxisDescriptor()
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

   marshalSize += 8;  // domainInitialXi
   marshalSize += 8;  // domainFinalXi
   marshalSize += 2;  // domainPointsXi
   marshalSize += 1;  // interleafFactor
   if (axisType != null)
       marshalSize += axisType.getMarshalledSize();

   return marshalSize;
}


/** Setter for {@link GridAxisDescriptor#domainInitialXi}
  * @param pDomainInitialXi new value of interest
  * @return same object to permit progressive setters */
public GridAxisDescriptor setDomainInitialXi(double pDomainInitialXi)
{
    domainInitialXi = pDomainInitialXi;
    return this;
}
/** Getter for {@link GridAxisDescriptor#domainInitialXi}
  * @return value of interest */
public double getDomainInitialXi()
{
    return domainInitialXi; 
}

/** Setter for {@link GridAxisDescriptor#domainFinalXi}
  * @param pDomainFinalXi new value of interest
  * @return same object to permit progressive setters */
public GridAxisDescriptor setDomainFinalXi(double pDomainFinalXi)
{
    domainFinalXi = pDomainFinalXi;
    return this;
}
/** Getter for {@link GridAxisDescriptor#domainFinalXi}
  * @return value of interest */
public double getDomainFinalXi()
{
    return domainFinalXi; 
}

/** Setter for {@link GridAxisDescriptor#domainPointsXi}
  * @param pDomainPointsXi new value of interest
  * @return same object to permit progressive setters */
public GridAxisDescriptor setDomainPointsXi(short pDomainPointsXi)
{
    domainPointsXi = pDomainPointsXi;
    return this;
}
/** Utility setter for {@link GridAxisDescriptor#domainPointsXi}
  * @param pDomainPointsXi new value of interest
  * @return same object to permit progressive setters */
public GridAxisDescriptor setDomainPointsXi(int pDomainPointsXi){
    domainPointsXi = (short) pDomainPointsXi;
    return this;
}
/** Getter for {@link GridAxisDescriptor#domainPointsXi}
  * @return value of interest */
public short getDomainPointsXi()
{
    return domainPointsXi; 
}

/** Setter for {@link GridAxisDescriptor#interleafFactor}
  * @param pInterleafFactor new value of interest
  * @return same object to permit progressive setters */
public GridAxisDescriptor setInterleafFactor(byte pInterleafFactor)
{
    interleafFactor = pInterleafFactor;
    return this;
}
/** Utility setter for {@link GridAxisDescriptor#interleafFactor}
  * @param pInterleafFactor new value of interest
  * @return same object to permit progressive setters */
public GridAxisDescriptor setInterleafFactor(int pInterleafFactor){
    interleafFactor = (byte) pInterleafFactor;
    return this;
}
/** Getter for {@link GridAxisDescriptor#interleafFactor}
  * @return value of interest */
public byte getInterleafFactor()
{
    return interleafFactor; 
}

/** Setter for {@link GridAxisDescriptor#axisType}
  * @param pAxisType new value of interest
  * @return same object to permit progressive setters */
public GridAxisDescriptor setAxisType(GridAxisDescriptorAxisType pAxisType)
{
    axisType = pAxisType;
    return this;
}
/** Getter for {@link GridAxisDescriptor#axisType}
  * @return value of interest */
public GridAxisDescriptorAxisType getAxisType()
{
    return axisType; 
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
       dos.writeDouble(domainInitialXi);
       dos.writeDouble(domainFinalXi);
       dos.writeShort(domainPointsXi);
       dos.writeByte(interleafFactor);
       axisType.marshal(dos);
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
        domainInitialXi = dis.readDouble();
        uPosition += 4;
        domainFinalXi = dis.readDouble();
        uPosition += 4;
        domainPointsXi = (short)dis.readUnsignedShort();
        uPosition += 2;
        interleafFactor = (byte)dis.readUnsignedByte();
        uPosition += 1;
        axisType = GridAxisDescriptorAxisType.unmarshalEnum(dis);
        uPosition += axisType.getMarshalledSize();
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
   byteBuffer.putDouble( (double)domainInitialXi);
   byteBuffer.putDouble( (double)domainFinalXi);
   byteBuffer.putShort( (short)domainPointsXi);
   byteBuffer.put( (byte)interleafFactor);
   axisType.marshal(byteBuffer);
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
        // attribute domainInitialXi marked as not serialized
        domainInitialXi = byteBuffer.getDouble();
        // attribute domainFinalXi marked as not serialized
        domainFinalXi = byteBuffer.getDouble();
        // attribute domainPointsXi marked as not serialized
        domainPointsXi = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute interleafFactor marked as not serialized
        interleafFactor = (byte)(byteBuffer.get() & 0xFF);
        // attribute axisType marked as not serialized
        axisType = GridAxisDescriptorAxisType.unmarshalEnum(byteBuffer);
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

     final GridAxisDescriptor rhs = (GridAxisDescriptor)obj;

     if( ! (domainInitialXi == rhs.domainInitialXi)) ivarsEqual = false;
     if( ! (domainFinalXi == rhs.domainFinalXi)) ivarsEqual = false;
     if( ! (domainPointsXi == rhs.domainPointsXi)) ivarsEqual = false;
     if( ! (interleafFactor == rhs.interleafFactor)) ivarsEqual = false;
     if( ! (axisType == rhs.axisType)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" domainInitialXi:").append(domainInitialXi); // writeOneToString
    sb.append(" domainFinalXi:").append(domainFinalXi); // writeOneToString
    sb.append(" domainPointsXi:").append(domainPointsXi); // writeOneToString
    sb.append(" interleafFactor:").append(interleafFactor); // writeOneToString
    sb.append(" axisType:").append(axisType); // writeOneToString

   return sb.toString();
 }
} // end of class
