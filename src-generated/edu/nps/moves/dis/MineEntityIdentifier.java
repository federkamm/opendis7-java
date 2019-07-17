package edu.nps.moves.dis;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis.enumerations.*;


/**
 * The unique designation of a mine contained in the Minefield Data PDU. No espdus are issued for mine entities.  Section 6.2.55 
 *
 * Copyright (c) 2008-2019, MOVES Institute, Naval Postgraduate School. All rights reserved.
 * This work is licensed under the BSD open source license, available at https://www.movesinstitute.org/licenses/bsd.html
 *
 * @author DMcG
 */
public class MineEntityIdentifier extends Object implements Serializable
{
   /**  */
   protected SimulationAddress  simulationAddress = new SimulationAddress(); 

   /**  */
   protected short  mineEntityNumber;


/** Constructor */
 public MineEntityIdentifier()
 {
 }

public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize += simulationAddress.getMarshalledSize();
   marshalSize += 2;  // mineEntityNumber

   return marshalSize;
}


public MineEntityIdentifier setSimulationAddress(SimulationAddress pSimulationAddress)
{
    simulationAddress = pSimulationAddress;
    return this;
}

public SimulationAddress getSimulationAddress()
{
    return simulationAddress; 
}

public MineEntityIdentifier setMineEntityNumber(short pMineEntityNumber)
{
    mineEntityNumber = pMineEntityNumber;
    return this;
}

public short getMineEntityNumber()
{
    return mineEntityNumber; 
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
       simulationAddress.marshal(dos);
       dos.writeShort( (short)mineEntityNumber);
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
        uPosition += simulationAddress.unmarshal(dis);
        mineEntityNumber = (short)dis.readUnsignedShort();
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
   simulationAddress.marshal(buff);
   buff.putShort( (short)mineEntityNumber);
}

/**
 * Unpacks a Pdu from the underlying data.
 * @throws java.nio.BufferUnderflowException if buff is too small
 * @see java.nio.ByteBuffer
 * @param buff The ByteBuffer at the position to begin reading
 */
public int unmarshal(java.nio.ByteBuffer buff) throws Exception
{
    simulationAddress.unmarshal(buff);
    mineEntityNumber = (short)(buff.getShort() & 0xFFFF);
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

    if(!(obj instanceof MineEntityIdentifier))
        return false;

     final MineEntityIdentifier rhs = (MineEntityIdentifier)obj;

     if( ! (simulationAddress.equals( rhs.simulationAddress) )) ivarsEqual = false;
     if( ! (mineEntityNumber == rhs.mineEntityNumber)) ivarsEqual = false;
    return ivarsEqual;
 }
} // end of class
