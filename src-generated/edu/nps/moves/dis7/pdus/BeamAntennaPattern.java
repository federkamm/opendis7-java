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
 * Used when the antenna pattern type field has a value of 1. Specifies the direction, pattern, and polarization of radiation from an antenna. Section 6.2.9.2
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class BeamAntennaPattern extends Object implements Serializable
{
   /** The rotation that transforms the reference coordinate sytem into the beam coordinate system. Either world coordinates or entity coordinates may be used as the reference coordinate system, as specified by the reference system field of the antenna pattern record. */
   protected EulerAngles  beamDirection = new EulerAngles(); 

   /** Full width of the beam to the -3dB power density points in the x-y plane of the beam coordinnate system.  Elevation beamwidth is represented by a 32-bit floating point number in units of radians. */
   protected float azimuthBeamwidth = (float)0;

   /** This field shall specify the full width of the beam to the –3 dB power density points in the x-z plane of the beam coordinate system. Elevation beamwidth shall be represented by a 32-bit floating point number in units of radians. */
   protected float elevationBeamwidth = (float)0;

   /** The reference coordinate system wrt which beam direction  is specified. This field should not change over the duration of an exercise. World coordindate systemis prefered for exercises. The entity coordinate system should be used only when highly directional antennas must be precisely modeled. uid 168 */
   protected TransmitterAntennaPatternReferenceSystem referenceSystem = TransmitterAntennaPatternReferenceSystem.values()[0];

   /** Padding */
   protected byte padding1 = (byte)0;

   /** Padding */
   protected short padding2 = (short)0;

   /** This field shall specify the magnitude of the Z-component (in beam coordinates) of the Electrical field at some arbitrary single point in the main beam and in the far field of the antenna.  */
   protected float ez = (float)0.0;

   /** This field shall specify the magnitude of the X-component (in beam coordinates) of the Electri- cal field at some arbitrary single point in the main beam and in the far field of the antenna. */
   protected float ex = (float)0.0;

   /** This field shall specify the phase angle between EZ and EX in radians. If fully omni-direc- tional antenna is modeled using beam pattern type one, the omni-directional antenna shall be repre- sented by beam direction Euler angles psi, theta, and phi of zero, an azimuth beamwidth of 2PI, and an elevation beamwidth of PI */
   protected float phase = (float)0.0;

   /** padding */
   protected int padding3 = (int)0;


/** Constructor creates and configures a new instance object */
 public BeamAntennaPattern()
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

   if (beamDirection != null)
       marshalSize += beamDirection.getMarshalledSize();
   marshalSize += 4;  // azimuthBeamwidth
   marshalSize += 4;  // elevationBeamwidth
   if (referenceSystem != null)
       marshalSize += referenceSystem.getMarshalledSize();
   marshalSize += 1;  // padding1
   marshalSize += 2;  // padding2
   marshalSize += 4;  // ez
   marshalSize += 4;  // ex
   marshalSize += 4;  // phase
   marshalSize += 4;  // padding3

   return marshalSize;
}


/** Setter for {@link BeamAntennaPattern#beamDirection}
  * @param pBeamDirection new value of interest
  * @return same object to permit progressive setters */
public BeamAntennaPattern setBeamDirection(EulerAngles pBeamDirection)
{
    beamDirection = pBeamDirection;
    return this;
}
/** Getter for {@link BeamAntennaPattern#beamDirection}
  * @return value of interest */
public EulerAngles getBeamDirection()
{
    return beamDirection;
}


/** Setter for {@link BeamAntennaPattern#azimuthBeamwidth}
  * @param pAzimuthBeamwidth new value of interest
  * @return same object to permit progressive setters */
public BeamAntennaPattern setAzimuthBeamwidth(float pAzimuthBeamwidth)
{
    azimuthBeamwidth = pAzimuthBeamwidth;
    return this;
}
/** Getter for {@link BeamAntennaPattern#azimuthBeamwidth}
  * @return value of interest */
public float getAzimuthBeamwidth()
{
    return azimuthBeamwidth; 
}

/** Setter for {@link BeamAntennaPattern#elevationBeamwidth}
  * @param pElevationBeamwidth new value of interest
  * @return same object to permit progressive setters */
public BeamAntennaPattern setElevationBeamwidth(float pElevationBeamwidth)
{
    elevationBeamwidth = pElevationBeamwidth;
    return this;
}
/** Getter for {@link BeamAntennaPattern#elevationBeamwidth}
  * @return value of interest */
public float getElevationBeamwidth()
{
    return elevationBeamwidth; 
}

/** Setter for {@link BeamAntennaPattern#referenceSystem}
  * @param pReferenceSystem new value of interest
  * @return same object to permit progressive setters */
public BeamAntennaPattern setReferenceSystem(TransmitterAntennaPatternReferenceSystem pReferenceSystem)
{
    referenceSystem = pReferenceSystem;
    return this;
}
/** Getter for {@link BeamAntennaPattern#referenceSystem}
  * @return value of interest */
public TransmitterAntennaPatternReferenceSystem getReferenceSystem()
{
    return referenceSystem; 
}

/** Setter for {@link BeamAntennaPattern#padding1}
  * @param pPadding1 new value of interest
  * @return same object to permit progressive setters */
public BeamAntennaPattern setPadding1(byte pPadding1)
{
    padding1 = pPadding1;
    return this;
}
/** Utility setter for {@link BeamAntennaPattern#padding1}
  * @param pPadding1 new value of interest
  * @return same object to permit progressive setters */
public BeamAntennaPattern setPadding1(int pPadding1){
    padding1 = (byte) pPadding1;
    return this;
}
/** Getter for {@link BeamAntennaPattern#padding1}
  * @return value of interest */
public byte getPadding1()
{
    return padding1; 
}

/** Setter for {@link BeamAntennaPattern#padding2}
  * @param pPadding2 new value of interest
  * @return same object to permit progressive setters */
public BeamAntennaPattern setPadding2(short pPadding2)
{
    padding2 = pPadding2;
    return this;
}
/** Utility setter for {@link BeamAntennaPattern#padding2}
  * @param pPadding2 new value of interest
  * @return same object to permit progressive setters */
public BeamAntennaPattern setPadding2(int pPadding2){
    padding2 = (short) pPadding2;
    return this;
}
/** Getter for {@link BeamAntennaPattern#padding2}
  * @return value of interest */
public short getPadding2()
{
    return padding2; 
}

/** Setter for {@link BeamAntennaPattern#ez}
  * @param pEz new value of interest
  * @return same object to permit progressive setters */
public BeamAntennaPattern setEz(float pEz)
{
    ez = pEz;
    return this;
}
/** Getter for {@link BeamAntennaPattern#ez}
  * @return value of interest */
public float getEz()
{
    return ez; 
}

/** Setter for {@link BeamAntennaPattern#ex}
  * @param pEx new value of interest
  * @return same object to permit progressive setters */
public BeamAntennaPattern setEx(float pEx)
{
    ex = pEx;
    return this;
}
/** Getter for {@link BeamAntennaPattern#ex}
  * @return value of interest */
public float getEx()
{
    return ex; 
}

/** Setter for {@link BeamAntennaPattern#phase}
  * @param pPhase new value of interest
  * @return same object to permit progressive setters */
public BeamAntennaPattern setPhase(float pPhase)
{
    phase = pPhase;
    return this;
}
/** Getter for {@link BeamAntennaPattern#phase}
  * @return value of interest */
public float getPhase()
{
    return phase; 
}

/** Setter for {@link BeamAntennaPattern#padding3}
  * @param pPadding3 new value of interest
  * @return same object to permit progressive setters */
public BeamAntennaPattern setPadding3(int pPadding3)
{
    padding3 = pPadding3;
    return this;
}
/** Getter for {@link BeamAntennaPattern#padding3}
  * @return value of interest */
public int getPadding3()
{
    return padding3; 
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
       beamDirection.marshal(dos);
       dos.writeFloat(azimuthBeamwidth);
       dos.writeFloat(elevationBeamwidth);
       referenceSystem.marshal(dos);
       dos.writeByte(padding1);
       dos.writeShort(padding2);
       dos.writeFloat(ez);
       dos.writeFloat(ex);
       dos.writeFloat(phase);
       dos.writeInt(padding3);
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
        uPosition += beamDirection.unmarshal(dis);
        azimuthBeamwidth = dis.readFloat();
        uPosition += 4;
        elevationBeamwidth = dis.readFloat();
        uPosition += 4;
        referenceSystem = TransmitterAntennaPatternReferenceSystem.unmarshalEnum(dis);
        uPosition += referenceSystem.getMarshalledSize();
        padding1 = (byte)dis.readUnsignedByte();
        uPosition += 1;
        padding2 = (short)dis.readUnsignedShort();
        uPosition += 2;
        ez = dis.readFloat();
        uPosition += 4;
        ex = dis.readFloat();
        uPosition += 4;
        phase = dis.readFloat();
        uPosition += 4;
        padding3 = dis.readInt();
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
   beamDirection.marshal(byteBuffer);
   byteBuffer.putFloat( (float)azimuthBeamwidth);
   byteBuffer.putFloat( (float)elevationBeamwidth);
   referenceSystem.marshal(byteBuffer);
   byteBuffer.put( (byte)padding1);
   byteBuffer.putShort( (short)padding2);
   byteBuffer.putFloat( (float)ez);
   byteBuffer.putFloat( (float)ex);
   byteBuffer.putFloat( (float)phase);
   byteBuffer.putInt( (int)padding3);
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
        // attribute beamDirection marked as not serialized
        beamDirection.unmarshal(byteBuffer);
        // attribute azimuthBeamwidth marked as not serialized
        azimuthBeamwidth = byteBuffer.getFloat();
        // attribute elevationBeamwidth marked as not serialized
        elevationBeamwidth = byteBuffer.getFloat();
        // attribute referenceSystem marked as not serialized
        referenceSystem = TransmitterAntennaPatternReferenceSystem.unmarshalEnum(byteBuffer);
        // attribute padding1 marked as not serialized
        padding1 = (byte)(byteBuffer.get() & 0xFF);
        // attribute padding2 marked as not serialized
        padding2 = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute ez marked as not serialized
        ez = byteBuffer.getFloat();
        // attribute ex marked as not serialized
        ex = byteBuffer.getFloat();
        // attribute phase marked as not serialized
        phase = byteBuffer.getFloat();
        // attribute padding3 marked as not serialized
        padding3 = byteBuffer.getInt();
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

     final BeamAntennaPattern rhs = (BeamAntennaPattern)obj;

     if( ! (beamDirection.equals( rhs.beamDirection) )) ivarsEqual = false;
     if( ! (azimuthBeamwidth == rhs.azimuthBeamwidth)) ivarsEqual = false;
     if( ! (elevationBeamwidth == rhs.elevationBeamwidth)) ivarsEqual = false;
     if( ! (referenceSystem == rhs.referenceSystem)) ivarsEqual = false;
     if( ! (padding1 == rhs.padding1)) ivarsEqual = false;
     if( ! (padding2 == rhs.padding2)) ivarsEqual = false;
     if( ! (ez == rhs.ez)) ivarsEqual = false;
     if( ! (ex == rhs.ex)) ivarsEqual = false;
     if( ! (phase == rhs.phase)) ivarsEqual = false;
     if( ! (padding3 == rhs.padding3)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" beamDirection:").append(beamDirection); // writeOneToString
    sb.append(" azimuthBeamwidth:").append(azimuthBeamwidth); // writeOneToString
    sb.append(" elevationBeamwidth:").append(elevationBeamwidth); // writeOneToString
    sb.append(" referenceSystem:").append(referenceSystem); // writeOneToString
    sb.append(" padding1:").append(padding1); // writeOneToString
    sb.append(" padding2:").append(padding2); // writeOneToString
    sb.append(" ez:").append(ez); // writeOneToString
    sb.append(" ex:").append(ex); // writeOneToString
    sb.append(" phase:").append(phase); // writeOneToString
    sb.append(" padding3:").append(padding3); // writeOneToString

   return sb.toString();
 }
} // end of class
