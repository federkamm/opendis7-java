package edu.nps.moves.dis;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis.enumerations.*;


/**
 * Identifies an event in the world. Use this format for ONLY the LiveEntityPdu. Section 6.2.34.
 *
 * Copyright (c) 2008-2019, MOVES Institute, Naval Postgraduate School. All rights reserved.
 * This work is licensed under the BSD open source license, available at https://www.movesinstitute.org/licenses/bsd.html
 *
 * @author DMcG
 */
public class EventIdentifierLiveEntity extends Object implements Serializable
{
   protected byte  siteNumber;

   protected byte  applicationNumber;

   protected short  eventNumber;


/** Constructor */
 public EventIdentifierLiveEntity()
 {
 }

public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize += 1;  // siteNumber
   marshalSize += 1;  // applicationNumber
   marshalSize += 2;  // eventNumber

   return marshalSize;
}


public EventIdentifierLiveEntity setSiteNumber(byte pSiteNumber)
{
    siteNumber = pSiteNumber;
    return this;
}

public byte getSiteNumber()
{
    return siteNumber; 
}

public EventIdentifierLiveEntity setApplicationNumber(byte pApplicationNumber)
{
    applicationNumber = pApplicationNumber;
    return this;
}

public byte getApplicationNumber()
{
    return applicationNumber; 
}

public EventIdentifierLiveEntity setEventNumber(short pEventNumber)
{
    eventNumber = pEventNumber;
    return this;
}

public short getEventNumber()
{
    return eventNumber; 
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
       dos.writeByte( (byte)siteNumber);
       dos.writeByte( (byte)applicationNumber);
       dos.writeShort( (short)eventNumber);
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
        siteNumber = (byte)dis.readUnsignedByte();
        uPosition += 1;
        applicationNumber = (byte)dis.readUnsignedByte();
        uPosition += 1;
        eventNumber = (short)dis.readUnsignedShort();
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
   buff.put( (byte)siteNumber);
   buff.put( (byte)applicationNumber);
   buff.putShort( (short)eventNumber);
}

/**
 * Unpacks a Pdu from the underlying data.
 * @throws java.nio.BufferUnderflowException if buff is too small
 * @see java.nio.ByteBuffer
 * @param buff The ByteBuffer at the position to begin reading
 */
public int unmarshal(java.nio.ByteBuffer buff) throws Exception
{
    siteNumber = (byte)(buff.get() & 0xFF);
    applicationNumber = (byte)(buff.get() & 0xFF);
    eventNumber = (short)(buff.getShort() & 0xFFFF);
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

    if(!(obj instanceof EventIdentifierLiveEntity))
        return false;

     final EventIdentifierLiveEntity rhs = (EventIdentifierLiveEntity)obj;

     if( ! (siteNumber == rhs.siteNumber)) ivarsEqual = false;
     if( ! (applicationNumber == rhs.applicationNumber)) ivarsEqual = false;
     if( ! (eventNumber == rhs.eventNumber)) ivarsEqual = false;
    return ivarsEqual;
 }
} // end of class
