/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */
// header autogenerated using string template dis7javalicense.txt

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;
import java.nio.ByteBuffer;

/**
 * 7.3.5 Used to communicate detailed damage information sustained by an entity regardless of the source of the damage.
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class EntityDamageStatusPdu extends WarfareFamilyPdu implements Serializable
{
   /** Field shall identify the damaged entity (see 6.2.28), Section 7.3.4 */
   protected EntityID  damagedEntityID = new EntityID(); 

   /** padding1 is an undescribed parameter... */
   protected short padding1 = (short)0;

   /** padding2 is an undescribed parameter... */
   protected short padding2 = (short)0;

   /** field shall specify the number of Damage Description records, Section 7.3.5 */
   protected short numberOfDamageDescription = (short)0;

   /** Fields shall contain one or more Damage Description records (see 6.2.17) and may contain other Standard Variable records, Section 7.3.5 */
   protected List< DirectedEnergyDamage > damageDescriptionRecords = new ArrayList< DirectedEnergyDamage >();
 

/** Constructor creates and configures a new instance object */
 public EntityDamageStatusPdu()
 {
    setPduType( DisPduType.ENTITY_DAMAGE_STATUS );
 }
/** copy method creates a deep copy of current object using preferred marshalling method
 * @return deep copy of PDU */
 public EntityDamageStatusPdu copy()
 {
     return copyDataOutputStream();
 }
/** Creates a "deep copy" of current object using ByteBuffer methods.
 * @return deep copy of PDU */
 public EntityDamageStatusPdu copyByteBuffer()
 {
     EntityDamageStatusPdu newCopy = new EntityDamageStatusPdu();
     ByteBuffer byteBuffer = ByteBuffer.allocate(400);
     try
     {
         this.marshal(byteBuffer);      // working
         newCopy.unmarshal(byteBuffer); // not working
     }
     catch (Exception e)
     {
         System.out.println("EntityDamageStatusPdu deep copy() marshall/unmarshall ByteBuffer exception " + e.getMessage());
         e.printStackTrace();
         System.exit(-1);
     }
     return newCopy;
 }

/** byteArrayOutputStream (baos) is used for marshal/unmarshal serialization
   * @see copyDataOutputStream() */
protected ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/** dataOutputStream (dos) is used for marshal/unmarshal serialization
   * @see copyDataOutputStream() */
protected DataOutputStream      dataOutputStream      = new DataOutputStream(byteArrayOutputStream);

/** copy method creates a deep copy of current object using DataOutputStream methods.
 * @return deep copy of PDU */
 public EntityDamageStatusPdu copyDataOutputStream()
 {
     EntityDamageStatusPdu newCopy = new EntityDamageStatusPdu();
     try
     {
         this.marshal(dataOutputStream);
         byte[] byteArrayDOS = byteArrayOutputStream.toByteArray();
         newCopy.unmarshal(ByteBuffer.wrap(byteArrayDOS));
     }
     catch (Exception e)
     {
         System.out.println("EntityDamageStatusPdu deep copy() marshall/unmarshall DataOutputStream exception " + e.getMessage());
         e.printStackTrace();
         System.exit(-1);
     }
        try
        {
                 dataOutputStream.flush();
            byteArrayOutputStream.flush();
            byteArrayOutputStream.reset();
        }
        catch (IOException ioe)
        {
            System.out.println("EntityDamageStatusPdu copyDataOutputStream() flush IOException: " + ioe.getMessage());
        }
     return newCopy;
 }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = super.getMarshalledSize();
   if (damagedEntityID != null)
       marshalSize += damagedEntityID.getMarshalledSize();
   marshalSize += 2;  // padding1
   marshalSize += 2;  // padding2
   marshalSize += 2;  // numberOfDamageDescription
   if (damageDescriptionRecords != null)
       for (int idx=0; idx < damageDescriptionRecords.size(); idx++)
       {
            DirectedEnergyDamage listElement = damageDescriptionRecords.get(idx);
            marshalSize += listElement.getMarshalledSize();
       }

   return marshalSize;
}


/** Setter for {@link EntityDamageStatusPdu#damagedEntityID}
  * @param pDamagedEntityID new value of interest
  * @return same object to permit progressive setters */
public EntityDamageStatusPdu setDamagedEntityID(EntityID pDamagedEntityID)
{
    damagedEntityID = pDamagedEntityID;
    return this;
}
/** Getter for {@link EntityDamageStatusPdu#damagedEntityID}
  * @return value of interest */
public EntityID getDamagedEntityID()
{
    return damagedEntityID;
}


/** Setter for {@link EntityDamageStatusPdu#padding1}
  * @param pPadding1 new value of interest
  * @return same object to permit progressive setters */
public EntityDamageStatusPdu setPadding1(short pPadding1)
{
    padding1 = pPadding1;
    return this;
}
/** Utility setter for {@link EntityDamageStatusPdu#padding1}
  * @param pPadding1 new value of interest
  * @return same object to permit progressive setters */
public EntityDamageStatusPdu setPadding1(int pPadding1){
    padding1 = (short) pPadding1;
    return this;
}
/** Getter for {@link EntityDamageStatusPdu#padding1}
  * @return value of interest */
public short getPadding1()
{
    return padding1; 
}

/** Setter for {@link EntityDamageStatusPdu#padding2}
  * @param pPadding2 new value of interest
  * @return same object to permit progressive setters */
public EntityDamageStatusPdu setPadding2(short pPadding2)
{
    padding2 = pPadding2;
    return this;
}
/** Utility setter for {@link EntityDamageStatusPdu#padding2}
  * @param pPadding2 new value of interest
  * @return same object to permit progressive setters */
public EntityDamageStatusPdu setPadding2(int pPadding2){
    padding2 = (short) pPadding2;
    return this;
}
/** Getter for {@link EntityDamageStatusPdu#padding2}
  * @return value of interest */
public short getPadding2()
{
    return padding2; 
}

/** Setter for {@link EntityDamageStatusPdu#damageDescriptionRecords}
  * @param pDamageDescriptionRecords new value of interest
  * @return same object to permit progressive setters */
public EntityDamageStatusPdu setDamageDescriptionRecords(List<DirectedEnergyDamage> pDamageDescriptionRecords)
{
    damageDescriptionRecords = pDamageDescriptionRecords;
    return this;
}
/** Getter for {@link EntityDamageStatusPdu#damageDescriptionRecords}
  * @return value of interest */
public List<DirectedEnergyDamage> getDamageDescriptionRecords()
{
    return damageDescriptionRecords; 
}

/**
 * Serializes an object to a DataOutputStream.
 * @throws java.lang.Exception if something goes wrong
 * @see java.io.DataOutputStream
 * @param dos the OutputStream
 */
public void marshal(DataOutputStream dos) throws Exception
{
    super.marshal(dos);
    try 
    {
       damagedEntityID.marshal(dos);
       dos.writeShort(padding1);
       dos.writeShort(padding2);
       dos.writeShort(damageDescriptionRecords.size());

       for (int idx = 0; idx < damageDescriptionRecords.size(); idx++)
       {
            DirectedEnergyDamage aDirectedEnergyDamage = damageDescriptionRecords.get(idx);
            aDirectedEnergyDamage.marshal(dos);
       }

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
    uPosition += super.unmarshal(dis);

    try 
    {
        uPosition += damagedEntityID.unmarshal(dis);
        padding1 = (short)dis.readUnsignedShort();
        uPosition += 2;
        padding2 = (short)dis.readUnsignedShort();
        uPosition += 2;
        numberOfDamageDescription = (short)dis.readUnsignedShort();
        uPosition += 2;
        for (int idx = 0; idx < numberOfDamageDescription; idx++)
        {
            DirectedEnergyDamage anX = new DirectedEnergyDamage();
            uPosition += anX.unmarshal(dis);
            damageDescriptionRecords.add(anX);
        }

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
   super.marshal(byteBuffer);
   damagedEntityID.marshal(byteBuffer);
   byteBuffer.putShort( (short)padding1);
   byteBuffer.putShort( (short)padding2);
   byteBuffer.putShort( (short)damageDescriptionRecords.size());

   for (int idx = 0; idx < damageDescriptionRecords.size(); idx++)
   {
        DirectedEnergyDamage aDirectedEnergyDamage = damageDescriptionRecords.get(idx);
        aDirectedEnergyDamage.marshal(byteBuffer);
   }

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
    super.unmarshal(byteBuffer);

    try
    {
        // attribute damagedEntityID marked as not serialized
        damagedEntityID.unmarshal(byteBuffer);
        // attribute padding1 marked as not serialized
        padding1 = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute padding2 marked as not serialized
        padding2 = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute numberOfDamageDescription marked as not serialized
        numberOfDamageDescription = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute damageDescriptionRecords marked as not serialized
        for (int idx = 0; idx < numberOfDamageDescription; idx++)
        {
        DirectedEnergyDamage anX = new DirectedEnergyDamage();
        anX.unmarshal(byteBuffer);
        damageDescriptionRecords.add(anX);
        }

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

@Override
 public boolean equalsImpl(Object obj)
 {
     boolean ivarsEqual = true;

     final EntityDamageStatusPdu rhs = (EntityDamageStatusPdu)obj;

     if( ! (damagedEntityID.equals( rhs.damagedEntityID) )) ivarsEqual = false;
     if( ! (padding1 == rhs.padding1)) ivarsEqual = false;
     if( ! (padding2 == rhs.padding2)) ivarsEqual = false;

     for (int idx = 0; idx < damageDescriptionRecords.size(); idx++)
        if( ! ( damageDescriptionRecords.get(idx).equals(rhs.damageDescriptionRecords.get(idx)))) ivarsEqual = false;

    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" damagedEntityID:").append(damagedEntityID); // writeOneToString
    sb.append(" padding1:").append(padding1); // writeOneToString
    sb.append(" padding2:").append(padding2); // writeOneToString
    sb.append(" damageDescriptionRecords: ");
    damageDescriptionRecords.forEach(r->{ sb2.append(" ").append(r);}); // writeList
    sb.append(sb2.toString().trim());
    // https://stackoverflow.com/questions/2242471/clearing-a-string-buffer-builder-after-loop
    sb2.setLength(0); // reset

   return sb.toString();
 }
} // end of class
