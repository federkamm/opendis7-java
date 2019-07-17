package edu.nps.moves.dis;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis.enumerations.*;


/**
 * Describes the scan volue of an emitter beam. Section 6.2.11.
 *
 * Copyright (c) 2008-2019, MOVES Institute, Naval Postgraduate School. All rights reserved.
 * This work is licensed under the BSD open source license, available at https://www.movesinstitute.org/licenses/bsd.html
 *
 * @author DMcG
 */
public class BeamData extends Object implements Serializable
{
   /** Specifies the beam azimuth an elevation centers and corresponding half-angles to describe the scan volume */
   protected float  beamAzimuthCenter;

   /** Specifies the beam azimuth sweep to determine scan volume */
   protected float  beamAzimuthSweep;

   /** Specifies the beam elevation center to determine scan volume */
   protected float  beamElevationCenter;

   /** Specifies the beam elevation sweep to determine scan volume */
   protected float  beamElevationSweep;

   /** allows receiver to synchronize its regenerated scan pattern to that of the emmitter. Specifies the percentage of time a scan is through its pattern from its origion. */
   protected float  beamSweepSync;


/** Constructor */
 public BeamData()
 {
 }

public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize += 4;  // beamAzimuthCenter
   marshalSize += 4;  // beamAzimuthSweep
   marshalSize += 4;  // beamElevationCenter
   marshalSize += 4;  // beamElevationSweep
   marshalSize += 4;  // beamSweepSync

   return marshalSize;
}


public BeamData setBeamAzimuthCenter(float pBeamAzimuthCenter)
{
    beamAzimuthCenter = pBeamAzimuthCenter;
    return this;
}

public float getBeamAzimuthCenter()
{
    return beamAzimuthCenter; 
}

public BeamData setBeamAzimuthSweep(float pBeamAzimuthSweep)
{
    beamAzimuthSweep = pBeamAzimuthSweep;
    return this;
}

public float getBeamAzimuthSweep()
{
    return beamAzimuthSweep; 
}

public BeamData setBeamElevationCenter(float pBeamElevationCenter)
{
    beamElevationCenter = pBeamElevationCenter;
    return this;
}

public float getBeamElevationCenter()
{
    return beamElevationCenter; 
}

public BeamData setBeamElevationSweep(float pBeamElevationSweep)
{
    beamElevationSweep = pBeamElevationSweep;
    return this;
}

public float getBeamElevationSweep()
{
    return beamElevationSweep; 
}

public BeamData setBeamSweepSync(float pBeamSweepSync)
{
    beamSweepSync = pBeamSweepSync;
    return this;
}

public float getBeamSweepSync()
{
    return beamSweepSync; 
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
       dos.writeFloat( (float)beamAzimuthCenter);
       dos.writeFloat( (float)beamAzimuthSweep);
       dos.writeFloat( (float)beamElevationCenter);
       dos.writeFloat( (float)beamElevationSweep);
       dos.writeFloat( (float)beamSweepSync);
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
        beamAzimuthCenter = dis.readFloat();
        uPosition += 4;
        beamAzimuthSweep = dis.readFloat();
        uPosition += 4;
        beamElevationCenter = dis.readFloat();
        uPosition += 4;
        beamElevationSweep = dis.readFloat();
        uPosition += 4;
        beamSweepSync = dis.readFloat();
        uPosition += 4;
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
   buff.putFloat( (float)beamAzimuthCenter);
   buff.putFloat( (float)beamAzimuthSweep);
   buff.putFloat( (float)beamElevationCenter);
   buff.putFloat( (float)beamElevationSweep);
   buff.putFloat( (float)beamSweepSync);
}

/**
 * Unpacks a Pdu from the underlying data.
 * @throws java.nio.BufferUnderflowException if buff is too small
 * @see java.nio.ByteBuffer
 * @param buff The ByteBuffer at the position to begin reading
 */
public int unmarshal(java.nio.ByteBuffer buff) throws Exception
{
    beamAzimuthCenter = buff.getFloat();
    beamAzimuthSweep = buff.getFloat();
    beamElevationCenter = buff.getFloat();
    beamElevationSweep = buff.getFloat();
    beamSweepSync = buff.getFloat();
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

    if(!(obj instanceof BeamData))
        return false;

     final BeamData rhs = (BeamData)obj;

     if( ! (beamAzimuthCenter == rhs.beamAzimuthCenter)) ivarsEqual = false;
     if( ! (beamAzimuthSweep == rhs.beamAzimuthSweep)) ivarsEqual = false;
     if( ! (beamElevationCenter == rhs.beamElevationCenter)) ivarsEqual = false;
     if( ! (beamElevationSweep == rhs.beamElevationSweep)) ivarsEqual = false;
     if( ! (beamSweepSync == rhs.beamSweepSync)) ivarsEqual = false;
    return ivarsEqual;
 }
} // end of class
