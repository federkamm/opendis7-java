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
 * 7.2.6. Information about individual attributes for a particular entity, other object, or event may be communicated using an Attribute PDU. The Attribute PDU shall not be used to exchange data available in any other PDU except where explicitly mentioned in the PDU issuance instructions within this standard. See 5.3.6.
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class AttributePdu extends EntityInformationInteractionFamilyPdu implements Serializable
{
   /** This field shall identify the simulation issuing the Attribute PDU. It shall be represented by a Simulation Address record (see 6.2.79). */
   protected SimulationAddress  originatingSimulationAddress = new SimulationAddress(); 

   /** Padding */
   protected int padding1;

   /** Padding */
   protected short padding2;

   /** This field shall represent the type of the PDU that is being extended or updated, if applicable. It shall be represented by an 8-bit enumeration. uid 4 */
   protected DisPduType attributeRecordPduType = DisPduType.values()[0];

   /** This field shall indicate the Protocol Version associated with the Attribute Record PDU Type. It shall be represented by an 8-bit enumeration. uid 5 */
   protected DISProtocolFamily attributeRecordProtocolVersion = DISProtocolFamily.values()[0];

   /** This field shall contain the Attribute record type of the Attribute records in the PDU if they all have the same Attribute record type. It shall be represented by a 32-bit enumeration. uid 66 */
   protected VariableRecordType masterAttributeRecordType = VariableRecordType.values()[0];

   /** This field shall identify the action code applicable to this Attribute PDU. The Action Code shall apply to all Attribute records contained in the PDU. It shall be represented by an 8-bit enumeration. uid 295 */
   protected DISAttributeActionCode actionCode = DISAttributeActionCode.values()[0];

   /** Padding */
   protected byte padding3;

   /** This field shall specify the number of Attribute Record Sets that make up the remainder of the PDU. It shall be represented by a 16-bit unsigned integer. */
   protected short numberAttributeRecordSet;

   /** attributeRecordSets is an undescribed parameter... */
   protected List< AttributeRecordSet > attributeRecordSets = new ArrayList< AttributeRecordSet >();
 

/** Constructor creates and configures a new instance object */
 public AttributePdu()
 {
    setPduType( DisPduType.ATTRIBUTE );
 }
/** copy method creates a deep copy of current object using preferred marshalling method
 * @return deep copy of PDU */
 public AttributePdu copy()
 {
     return copyDataOutputStream();
 }
/** Creates a "deep copy" of current object using ByteBuffer methods.
 * @return deep copy of PDU */
 public AttributePdu copyByteBuffer()
 {
     AttributePdu newCopy = new AttributePdu();
     ByteBuffer byteBuffer = ByteBuffer.allocate(400);
     try
     {
         this.marshal(byteBuffer);      // working
         newCopy.unmarshal(byteBuffer); // not working
     }
     catch (Exception e)
     {
         System.out.println("AttributePdu deep copy() marshall/unmarshall ByteBuffer exception " + e.getMessage());
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
 public AttributePdu copyDataOutputStream()
 {
     AttributePdu newCopy = new AttributePdu();
     try
     {
         this.marshal(dataOutputStream);
         byte[] byteArrayDOS = byteArrayOutputStream.toByteArray();
         newCopy.unmarshal(ByteBuffer.wrap(byteArrayDOS));
     }
     catch (Exception e)
     {
         System.out.println("AttributePdu deep copy() marshall/unmarshall DataOutputStream exception " + e.getMessage());
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
            System.out.println("AttributePdu copyDataOutputStream() flush IOException: " + ioe.getMessage());
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
   if (originatingSimulationAddress != null)
       marshalSize += originatingSimulationAddress.getMarshalledSize();
   marshalSize += 4;  // padding1
   marshalSize += 2;  // padding2
   if (attributeRecordPduType != null)
       marshalSize += attributeRecordPduType.getMarshalledSize();
   if (attributeRecordProtocolVersion != null)
       marshalSize += attributeRecordProtocolVersion.getMarshalledSize();
   if (masterAttributeRecordType != null)
       marshalSize += masterAttributeRecordType.getMarshalledSize();
   if (actionCode != null)
       marshalSize += actionCode.getMarshalledSize();
   marshalSize += 1;  // padding3
   marshalSize += 2;  // numberAttributeRecordSet
   if (attributeRecordSets != null)
       for (int idx=0; idx < attributeRecordSets.size(); idx++)
       {
            AttributeRecordSet listElement = attributeRecordSets.get(idx);
            marshalSize += listElement.getMarshalledSize();
       }

   return marshalSize;
}


/** Setter for {@link AttributePdu#originatingSimulationAddress}
  * @param pOriginatingSimulationAddress new value of interest
  * @return same object to permit progressive setters */
public AttributePdu setOriginatingSimulationAddress(SimulationAddress pOriginatingSimulationAddress)
{
    originatingSimulationAddress = pOriginatingSimulationAddress;
    return this;
}
/** Getter for {@link AttributePdu#originatingSimulationAddress}
  * @return value of interest */
public SimulationAddress getOriginatingSimulationAddress()
{
    return originatingSimulationAddress;
}


/** Setter for {@link AttributePdu#padding1}
  * @param pPadding1 new value of interest
  * @return same object to permit progressive setters */
public AttributePdu setPadding1(int pPadding1)
{
    padding1 = pPadding1;
    return this;
}
/** Getter for {@link AttributePdu#padding1}
  * @return value of interest */
public int getPadding1()
{
    return padding1; 
}

/** Setter for {@link AttributePdu#padding2}
  * @param pPadding2 new value of interest
  * @return same object to permit progressive setters */
public AttributePdu setPadding2(short pPadding2)
{
    padding2 = pPadding2;
    return this;
}
/** Utility setter for {@link AttributePdu#padding2}
  * @param pPadding2 new value of interest
  * @return same object to permit progressive setters */
public AttributePdu setPadding2(int pPadding2){
    padding2 = (short) pPadding2;
    return this;
}
/** Getter for {@link AttributePdu#padding2}
  * @return value of interest */
public short getPadding2()
{
    return padding2; 
}

/** Setter for {@link AttributePdu#attributeRecordPduType}
  * @param pAttributeRecordPduType new value of interest
  * @return same object to permit progressive setters */
public AttributePdu setAttributeRecordPduType(DisPduType pAttributeRecordPduType)
{
    attributeRecordPduType = pAttributeRecordPduType;
    return this;
}
/** Getter for {@link AttributePdu#attributeRecordPduType}
  * @return value of interest */
public DisPduType getAttributeRecordPduType()
{
    return attributeRecordPduType; 
}

/** Setter for {@link AttributePdu#attributeRecordProtocolVersion}
  * @param pAttributeRecordProtocolVersion new value of interest
  * @return same object to permit progressive setters */
public AttributePdu setAttributeRecordProtocolVersion(DISProtocolFamily pAttributeRecordProtocolVersion)
{
    attributeRecordProtocolVersion = pAttributeRecordProtocolVersion;
    return this;
}
/** Getter for {@link AttributePdu#attributeRecordProtocolVersion}
  * @return value of interest */
public DISProtocolFamily getAttributeRecordProtocolVersion()
{
    return attributeRecordProtocolVersion; 
}

/** Setter for {@link AttributePdu#masterAttributeRecordType}
  * @param pMasterAttributeRecordType new value of interest
  * @return same object to permit progressive setters */
public AttributePdu setMasterAttributeRecordType(VariableRecordType pMasterAttributeRecordType)
{
    masterAttributeRecordType = pMasterAttributeRecordType;
    return this;
}
/** Getter for {@link AttributePdu#masterAttributeRecordType}
  * @return value of interest */
public VariableRecordType getMasterAttributeRecordType()
{
    return masterAttributeRecordType; 
}

/** Setter for {@link AttributePdu#actionCode}
  * @param pActionCode new value of interest
  * @return same object to permit progressive setters */
public AttributePdu setActionCode(DISAttributeActionCode pActionCode)
{
    actionCode = pActionCode;
    return this;
}
/** Getter for {@link AttributePdu#actionCode}
  * @return value of interest */
public DISAttributeActionCode getActionCode()
{
    return actionCode; 
}

/** Setter for {@link AttributePdu#padding3}
  * @param pPadding3 new value of interest
  * @return same object to permit progressive setters */
public AttributePdu setPadding3(byte pPadding3)
{
    padding3 = pPadding3;
    return this;
}
/** Utility setter for {@link AttributePdu#padding3}
  * @param pPadding3 new value of interest
  * @return same object to permit progressive setters */
public AttributePdu setPadding3(int pPadding3){
    padding3 = (byte) pPadding3;
    return this;
}
/** Getter for {@link AttributePdu#padding3}
  * @return value of interest */
public byte getPadding3()
{
    return padding3; 
}

/** Setter for {@link AttributePdu#attributeRecordSets}
  * @param pAttributeRecordSets new value of interest
  * @return same object to permit progressive setters */
public AttributePdu setAttributeRecordSets(List<AttributeRecordSet> pAttributeRecordSets)
{
    attributeRecordSets = pAttributeRecordSets;
    return this;
}
/** Getter for {@link AttributePdu#attributeRecordSets}
  * @return value of interest */
public List<AttributeRecordSet> getAttributeRecordSets()
{
    return attributeRecordSets; 
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
       originatingSimulationAddress.marshal(dos);
       dos.writeInt(padding1);
       dos.writeShort(padding2);
       attributeRecordPduType.marshal(dos);
       attributeRecordProtocolVersion.marshal(dos);
       masterAttributeRecordType.marshal(dos);
       actionCode.marshal(dos);
       dos.writeByte(padding3);
       dos.writeShort(attributeRecordSets.size());

       for (int idx = 0; idx < attributeRecordSets.size(); idx++)
       {
            AttributeRecordSet aAttributeRecordSet = attributeRecordSets.get(idx);
            aAttributeRecordSet.marshal(dos);
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
        uPosition += originatingSimulationAddress.unmarshal(dis);
        padding1 = dis.readInt();
        uPosition += 4;
        padding2 = dis.readShort();
        uPosition += 4;
        attributeRecordPduType = DisPduType.unmarshalEnum(dis);
        uPosition += attributeRecordPduType.getMarshalledSize();
        attributeRecordProtocolVersion = DISProtocolFamily.unmarshalEnum(dis);
        uPosition += attributeRecordProtocolVersion.getMarshalledSize();
        masterAttributeRecordType = VariableRecordType.unmarshalEnum(dis);
        uPosition += masterAttributeRecordType.getMarshalledSize();
        actionCode = DISAttributeActionCode.unmarshalEnum(dis);
        uPosition += actionCode.getMarshalledSize();
        padding3 = (byte)dis.readUnsignedByte();
        uPosition += 1;
        numberAttributeRecordSet = (short)dis.readUnsignedShort();
        uPosition += 2;
        for (int idx = 0; idx < numberAttributeRecordSet; idx++)
        {
            AttributeRecordSet anX = new AttributeRecordSet();
            uPosition += anX.unmarshal(dis);
            attributeRecordSets.add(anX);
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
   originatingSimulationAddress.marshal(byteBuffer);
   byteBuffer.putInt( (int)padding1);
   byteBuffer.putShort( (short)padding2);
   attributeRecordPduType.marshal(byteBuffer);
   attributeRecordProtocolVersion.marshal(byteBuffer);
   masterAttributeRecordType.marshal(byteBuffer);
   actionCode.marshal(byteBuffer);
   byteBuffer.put( (byte)padding3);
   byteBuffer.putShort( (short)attributeRecordSets.size());

   for (int idx = 0; idx < attributeRecordSets.size(); idx++)
   {
        AttributeRecordSet aAttributeRecordSet = attributeRecordSets.get(idx);
        aAttributeRecordSet.marshal(byteBuffer);
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
        // attribute originatingSimulationAddress marked as not serialized
        originatingSimulationAddress.unmarshal(byteBuffer);
        // attribute padding1 marked as not serialized
        padding1 = byteBuffer.getInt();
        // attribute padding2 marked as not serialized
        padding2 = byteBuffer.getShort();
        // attribute attributeRecordPduType marked as not serialized
        attributeRecordPduType = DisPduType.unmarshalEnum(byteBuffer);
        // attribute attributeRecordProtocolVersion marked as not serialized
        attributeRecordProtocolVersion = DISProtocolFamily.unmarshalEnum(byteBuffer);
        // attribute masterAttributeRecordType marked as not serialized
        masterAttributeRecordType = VariableRecordType.unmarshalEnum(byteBuffer);
        // attribute actionCode marked as not serialized
        actionCode = DISAttributeActionCode.unmarshalEnum(byteBuffer);
        // attribute padding3 marked as not serialized
        padding3 = (byte)(byteBuffer.get() & 0xFF);
        // attribute numberAttributeRecordSet marked as not serialized
        numberAttributeRecordSet = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute attributeRecordSets marked as not serialized
        for (int idx = 0; idx < numberAttributeRecordSet; idx++)
        {
        AttributeRecordSet anX = new AttributeRecordSet();
        anX.unmarshal(byteBuffer);
        attributeRecordSets.add(anX);
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

     final AttributePdu rhs = (AttributePdu)obj;

     if( ! (originatingSimulationAddress.equals( rhs.originatingSimulationAddress) )) ivarsEqual = false;
     if( ! (padding1 == rhs.padding1)) ivarsEqual = false;
     if( ! (padding2 == rhs.padding2)) ivarsEqual = false;
     if( ! (attributeRecordPduType == rhs.attributeRecordPduType)) ivarsEqual = false;
     if( ! (attributeRecordProtocolVersion == rhs.attributeRecordProtocolVersion)) ivarsEqual = false;
     if( ! (masterAttributeRecordType == rhs.masterAttributeRecordType)) ivarsEqual = false;
     if( ! (actionCode == rhs.actionCode)) ivarsEqual = false;
     if( ! (padding3 == rhs.padding3)) ivarsEqual = false;

     for (int idx = 0; idx < attributeRecordSets.size(); idx++)
        if( ! ( attributeRecordSets.get(idx).equals(rhs.attributeRecordSets.get(idx)))) ivarsEqual = false;

    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" originatingSimulationAddress:").append(originatingSimulationAddress); // writeOneToString
    sb.append(" padding1:").append(padding1); // writeOneToString
    sb.append(" padding2:").append(padding2); // writeOneToString
    sb.append(" attributeRecordPduType:").append(attributeRecordPduType); // writeOneToString
    sb.append(" attributeRecordProtocolVersion:").append(attributeRecordProtocolVersion); // writeOneToString
    sb.append(" masterAttributeRecordType:").append(masterAttributeRecordType); // writeOneToString
    sb.append(" actionCode:").append(actionCode); // writeOneToString
    sb.append(" padding3:").append(padding3); // writeOneToString
    sb.append(" attributeRecordSets: ");
    attributeRecordSets.forEach(r->{ sb2.append(" ").append(r);}); // writeList
    sb.append(sb2.toString().trim());
    // https://stackoverflow.com/questions/2242471/clearing-a-string-buffer-builder-after-loop
    sb2.setLength(0); // reset

   return sb.toString();
 }
} // end of class
