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
 * For each type or location of Storage Fuel, this record shall specify the type, location, fuel measure- ment units, reload quantity and maximum quantity for storage fuel either for the whole entity or a specific storage fuel location (tank). Section 6.2.85.
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class StorageFuelReload extends Object implements Serializable
{
   /**  the standard quantity of this fuel type normally loaded at this station/launcher if a station/launcher is specified. If the Station/Launcher field is set to zero, then this is the total quantity of this fuel type that would be present in a standard reload of all appli- cable stations/launchers associated with this entity. */
   protected int standardQuantity;

   /** The maximum quantity of this fuel type that this sta- tion/launcher is capable of holding when a station/launcher is specified. This would be the value used when a maximum reload was desired to be set for this station/launcher. If the Station/launcher field is set to zero, then this is the maximum quantity of this fuel type that would be present on this entity at all stations/launchers that can accept this fuel type. */
   protected int maximumQuantity;

   /** The seconds normally required to reload the standard quantity of this fuel type at this specific station/launcher. When the Station/Launcher field is set to zero, this shall be the time it takes to perform a standard quantity reload of this fuel type at all applicable stations/launchers for this entity. */
   protected int standardQuantityReloadTime;

   /** The seconds normally required to reload the maximum possible quantity of this fuel type at this station/launcher. When the Station/Launcher field is set to zero, this shall be the time it takes to perform a maximum quantity load/reload of this fuel type at all applicable stations/launchers for this entity. */
   protected int maximumQuantityReloadTime;

   /** The fuel measurement units. Enumeration uid 328 */
   protected FuelMeasurementUnits fuelMeasurementUnits = FuelMeasurementUnits.values()[0];

   /** Fuel type uid 413 */
   protected SupplyFuelType fuelType = SupplyFuelType.values()[0];

   /** Location of fuel as related to entity. See section 14 of EBV document uid 329 */
   protected FuelLocation fuelLocation = FuelLocation.values()[0];

   /** padding */
   protected byte padding = (byte)0;


/** Constructor creates and configures a new instance object */
 public StorageFuelReload()
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

   marshalSize += 4;  // standardQuantity
   marshalSize += 4;  // maximumQuantity
   marshalSize += 4;  // standardQuantityReloadTime
   marshalSize += 4;  // maximumQuantityReloadTime
   if (fuelMeasurementUnits != null)
       marshalSize += fuelMeasurementUnits.getMarshalledSize();
   if (fuelType != null)
       marshalSize += fuelType.getMarshalledSize();
   if (fuelLocation != null)
       marshalSize += fuelLocation.getMarshalledSize();
   marshalSize += 1;  // padding

   return marshalSize;
}


/** Setter for {@link StorageFuelReload#standardQuantity}
  * @param pStandardQuantity new value of interest
  * @return same object to permit progressive setters */
public StorageFuelReload setStandardQuantity(int pStandardQuantity)
{
    standardQuantity = pStandardQuantity;
    return this;
}
/** Getter for {@link StorageFuelReload#standardQuantity}
  * @return value of interest */
public int getStandardQuantity()
{
    return standardQuantity; 
}

/** Setter for {@link StorageFuelReload#maximumQuantity}
  * @param pMaximumQuantity new value of interest
  * @return same object to permit progressive setters */
public StorageFuelReload setMaximumQuantity(int pMaximumQuantity)
{
    maximumQuantity = pMaximumQuantity;
    return this;
}
/** Getter for {@link StorageFuelReload#maximumQuantity}
  * @return value of interest */
public int getMaximumQuantity()
{
    return maximumQuantity; 
}

/** Setter for {@link StorageFuelReload#standardQuantityReloadTime}
  * @param pStandardQuantityReloadTime new value of interest
  * @return same object to permit progressive setters */
public StorageFuelReload setStandardQuantityReloadTime(int pStandardQuantityReloadTime)
{
    standardQuantityReloadTime = pStandardQuantityReloadTime;
    return this;
}
/** Getter for {@link StorageFuelReload#standardQuantityReloadTime}
  * @return value of interest */
public int getStandardQuantityReloadTime()
{
    return standardQuantityReloadTime; 
}

/** Setter for {@link StorageFuelReload#maximumQuantityReloadTime}
  * @param pMaximumQuantityReloadTime new value of interest
  * @return same object to permit progressive setters */
public StorageFuelReload setMaximumQuantityReloadTime(int pMaximumQuantityReloadTime)
{
    maximumQuantityReloadTime = pMaximumQuantityReloadTime;
    return this;
}
/** Getter for {@link StorageFuelReload#maximumQuantityReloadTime}
  * @return value of interest */
public int getMaximumQuantityReloadTime()
{
    return maximumQuantityReloadTime; 
}

/** Setter for {@link StorageFuelReload#fuelMeasurementUnits}
  * @param pFuelMeasurementUnits new value of interest
  * @return same object to permit progressive setters */
public StorageFuelReload setFuelMeasurementUnits(FuelMeasurementUnits pFuelMeasurementUnits)
{
    fuelMeasurementUnits = pFuelMeasurementUnits;
    return this;
}
/** Getter for {@link StorageFuelReload#fuelMeasurementUnits}
  * @return value of interest */
public FuelMeasurementUnits getFuelMeasurementUnits()
{
    return fuelMeasurementUnits; 
}

/** Setter for {@link StorageFuelReload#fuelType}
  * @param pFuelType new value of interest
  * @return same object to permit progressive setters */
public StorageFuelReload setFuelType(SupplyFuelType pFuelType)
{
    fuelType = pFuelType;
    return this;
}
/** Getter for {@link StorageFuelReload#fuelType}
  * @return value of interest */
public SupplyFuelType getFuelType()
{
    return fuelType; 
}

/** Setter for {@link StorageFuelReload#fuelLocation}
  * @param pFuelLocation new value of interest
  * @return same object to permit progressive setters */
public StorageFuelReload setFuelLocation(FuelLocation pFuelLocation)
{
    fuelLocation = pFuelLocation;
    return this;
}
/** Getter for {@link StorageFuelReload#fuelLocation}
  * @return value of interest */
public FuelLocation getFuelLocation()
{
    return fuelLocation; 
}

/** Setter for {@link StorageFuelReload#padding}
  * @param pPadding new value of interest
  * @return same object to permit progressive setters */
public StorageFuelReload setPadding(byte pPadding)
{
    padding = pPadding;
    return this;
}
/** Utility setter for {@link StorageFuelReload#padding}
  * @param pPadding new value of interest
  * @return same object to permit progressive setters */
public StorageFuelReload setPadding(int pPadding){
    padding = (byte) pPadding;
    return this;
}
/** Getter for {@link StorageFuelReload#padding}
  * @return value of interest */
public byte getPadding()
{
    return padding; 
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
       dos.writeInt(standardQuantity);
       dos.writeInt(maximumQuantity);
       dos.writeInt(standardQuantityReloadTime);
       dos.writeInt(maximumQuantityReloadTime);
       fuelMeasurementUnits.marshal(dos);
       fuelType.marshal(dos);
       fuelLocation.marshal(dos);
       dos.writeByte(padding);
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
        standardQuantity = dis.readInt();
        uPosition += 4;
        maximumQuantity = dis.readInt();
        uPosition += 4;
        standardQuantityReloadTime = dis.readInt();
        uPosition += 4;
        maximumQuantityReloadTime = dis.readInt();
        uPosition += 4;
        fuelMeasurementUnits = FuelMeasurementUnits.unmarshalEnum(dis);
        uPosition += fuelMeasurementUnits.getMarshalledSize();
        fuelType = SupplyFuelType.unmarshalEnum(dis);
        uPosition += fuelType.getMarshalledSize();
        fuelLocation = FuelLocation.unmarshalEnum(dis);
        uPosition += fuelLocation.getMarshalledSize();
        padding = (byte)dis.readUnsignedByte();
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
   byteBuffer.putInt( (int)standardQuantity);
   byteBuffer.putInt( (int)maximumQuantity);
   byteBuffer.putInt( (int)standardQuantityReloadTime);
   byteBuffer.putInt( (int)maximumQuantityReloadTime);
   fuelMeasurementUnits.marshal(byteBuffer);
   fuelType.marshal(byteBuffer);
   fuelLocation.marshal(byteBuffer);
   byteBuffer.put( (byte)padding);
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
        // attribute standardQuantity marked as not serialized
        standardQuantity = byteBuffer.getInt();
        // attribute maximumQuantity marked as not serialized
        maximumQuantity = byteBuffer.getInt();
        // attribute standardQuantityReloadTime marked as not serialized
        standardQuantityReloadTime = byteBuffer.getInt();
        // attribute maximumQuantityReloadTime marked as not serialized
        maximumQuantityReloadTime = byteBuffer.getInt();
        // attribute fuelMeasurementUnits marked as not serialized
        fuelMeasurementUnits = FuelMeasurementUnits.unmarshalEnum(byteBuffer);
        // attribute fuelType marked as not serialized
        fuelType = SupplyFuelType.unmarshalEnum(byteBuffer);
        // attribute fuelLocation marked as not serialized
        fuelLocation = FuelLocation.unmarshalEnum(byteBuffer);
        // attribute padding marked as not serialized
        padding = (byte)(byteBuffer.get() & 0xFF);
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

     final StorageFuelReload rhs = (StorageFuelReload)obj;

     if( ! (standardQuantity == rhs.standardQuantity)) ivarsEqual = false;
     if( ! (maximumQuantity == rhs.maximumQuantity)) ivarsEqual = false;
     if( ! (standardQuantityReloadTime == rhs.standardQuantityReloadTime)) ivarsEqual = false;
     if( ! (maximumQuantityReloadTime == rhs.maximumQuantityReloadTime)) ivarsEqual = false;
     if( ! (fuelMeasurementUnits == rhs.fuelMeasurementUnits)) ivarsEqual = false;
     if( ! (fuelType == rhs.fuelType)) ivarsEqual = false;
     if( ! (fuelLocation == rhs.fuelLocation)) ivarsEqual = false;
     if( ! (padding == rhs.padding)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" standardQuantity:").append(standardQuantity); // writeOneToString
    sb.append(" maximumQuantity:").append(maximumQuantity); // writeOneToString
    sb.append(" standardQuantityReloadTime:").append(standardQuantityReloadTime); // writeOneToString
    sb.append(" maximumQuantityReloadTime:").append(maximumQuantityReloadTime); // writeOneToString
    sb.append(" fuelMeasurementUnits:").append(fuelMeasurementUnits); // writeOneToString
    sb.append(" fuelType:").append(fuelType); // writeOneToString
    sb.append(" fuelLocation:").append(fuelLocation); // writeOneToString
    sb.append(" padding:").append(padding); // writeOneToString

   return sb.toString();
 }
} // end of class
