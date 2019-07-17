package edu.nps.moves.dis;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis.enumerations.*;


/**
 * Section 5.3.12.11: reports the occurance of a significatnt event to the simulation manager.
 *
 * Copyright (c) 2008-2019, MOVES Institute, Naval Postgraduate School. All rights reserved.
 * This work is licensed under the BSD open source license, available at https://www.movesinstitute.org/licenses/bsd.html
 *
 * @author DMcG
 */
public class EventReportReliablePdu extends SimulationManagementWithReliabilityFamilyPdu implements Serializable
{
   /** Event type uid 73 */
   protected EventReportEventType eventType = EventReportEventType.values()[0];

   /** padding */
   protected int  pad1;

   /** Fixed datum record count */
   protected int  numberOfFixedDatumRecords;

   /** variable datum record count */
   protected int  numberOfVariableDatumRecords;

   /** Fixed datum records */
   protected List< FixedDatum > fixedDatumRecords = new ArrayList< FixedDatum >();
 
   /** Variable datum records */
   protected List< VariableDatum > variableDatumRecords = new ArrayList< VariableDatum >();
 

/** Constructor */
 public EventReportReliablePdu()
 {
    setPduType( DISPDUType.EVENT_REPORT_R );
 }

public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = super.getMarshalledSize();
   marshalSize += eventType.getMarshalledSize();
   marshalSize += 4;  // pad1
   marshalSize += 4;  // numberOfFixedDatumRecords
   marshalSize += 4;  // numberOfVariableDatumRecords
   for(int idx=0; idx < fixedDatumRecords.size(); idx++)
   {
        FixedDatum listElement = fixedDatumRecords.get(idx);
        marshalSize += listElement.getMarshalledSize();
   }
   for(int idx=0; idx < variableDatumRecords.size(); idx++)
   {
        VariableDatum listElement = variableDatumRecords.get(idx);
        marshalSize += listElement.getMarshalledSize();
   }

   return marshalSize;
}


public EventReportReliablePdu setEventType(EventReportEventType pEventType)
{
    eventType = pEventType;
    return this;
}

public EventReportEventType getEventType()
{
    return eventType; 
}

public EventReportReliablePdu setPad1(int pPad1)
{
    pad1 = pPad1;
    return this;
}

public int getPad1()
{
    return pad1; 
}

public EventReportReliablePdu setFixedDatumRecords(List<FixedDatum> pFixedDatumRecords)
{
    fixedDatumRecords = pFixedDatumRecords;
    return this;
}

public List<FixedDatum> getFixedDatumRecords()
{
    return fixedDatumRecords; 
}

public EventReportReliablePdu setVariableDatumRecords(List<VariableDatum> pVariableDatumRecords)
{
    variableDatumRecords = pVariableDatumRecords;
    return this;
}

public List<VariableDatum> getVariableDatumRecords()
{
    return variableDatumRecords; 
}

/**
 * Serializes an object to a DataOutputStream.
 * @see java.io.DataOutputStream
 * @param dos The DataOutputStream
 */
public void marshal(DataOutputStream dos)
{
    super.marshal(dos);
    try 
    {
       eventType.marshal(dos);
       dos.writeInt( (int)pad1);
       dos.writeInt( (int)fixedDatumRecords.size());
       dos.writeInt( (int)variableDatumRecords.size());

       for(int idx = 0; idx < fixedDatumRecords.size(); idx++)
       {
            FixedDatum aFixedDatum = fixedDatumRecords.get(idx);
            aFixedDatum.marshal(dos);
       }


       for(int idx = 0; idx < variableDatumRecords.size(); idx++)
       {
            VariableDatum aVariableDatum = variableDatumRecords.get(idx);
            aVariableDatum.marshal(dos);
       }

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
    uPosition += super.unmarshal(dis);

    try 
    {
        eventType = EventReportEventType.unmarshalEnum(dis);
        uPosition += eventType.getMarshalledSize();
        pad1 = dis.readInt();
        uPosition += 4;
        numberOfFixedDatumRecords = dis.readInt();
        uPosition += 4;
        numberOfVariableDatumRecords = dis.readInt();
        uPosition += 4;
        for(int idx = 0; idx < numberOfFixedDatumRecords; idx++)
        {
            FixedDatum anX = new FixedDatum();
            uPosition += anX.unmarshal(dis);
            fixedDatumRecords.add(anX);
        }

        for(int idx = 0; idx < numberOfVariableDatumRecords; idx++)
        {
            VariableDatum anX = new VariableDatum();
            uPosition += anX.unmarshal(dis);
            variableDatumRecords.add(anX);
        }

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
   super.marshal(buff);
   eventType.marshal(buff);
   buff.putInt( (int)pad1);
   buff.putInt( (int)fixedDatumRecords.size());
   buff.putInt( (int)variableDatumRecords.size());

   for(int idx = 0; idx < fixedDatumRecords.size(); idx++)
   {
        FixedDatum aFixedDatum = (FixedDatum)fixedDatumRecords.get(idx);
        aFixedDatum.marshal(buff);
   }


   for(int idx = 0; idx < variableDatumRecords.size(); idx++)
   {
        VariableDatum aVariableDatum = (VariableDatum)variableDatumRecords.get(idx);
        aVariableDatum.marshal(buff);
   }

}

/**
 * Unpacks a Pdu from the underlying data.
 * @throws java.nio.BufferUnderflowException if buff is too small
 * @see java.nio.ByteBuffer
 * @param buff The ByteBuffer at the position to begin reading
 */
public int unmarshal(java.nio.ByteBuffer buff) throws Exception
{
    super.unmarshal(buff);

    eventType = EventReportEventType.unmarshalEnum(buff);
    pad1 = buff.getInt();
    numberOfFixedDatumRecords = buff.getInt();
    numberOfVariableDatumRecords = buff.getInt();
    for(int idx = 0; idx < numberOfFixedDatumRecords; idx++)
    {
    FixedDatum anX = new FixedDatum();
    anX.unmarshal(buff);
    fixedDatumRecords.add(anX);
    }

    for(int idx = 0; idx < numberOfVariableDatumRecords; idx++)
    {
    VariableDatum anX = new VariableDatum();
    anX.unmarshal(buff);
    variableDatumRecords.add(anX);
    }

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

@Override
 public boolean equalsImpl(Object obj)
 {
     boolean ivarsEqual = true;

    if(!(obj instanceof EventReportReliablePdu))
        return false;

     final EventReportReliablePdu rhs = (EventReportReliablePdu)obj;

     if( ! (eventType == rhs.eventType)) ivarsEqual = false;
     if( ! (pad1 == rhs.pad1)) ivarsEqual = false;
     if( ! (numberOfFixedDatumRecords == rhs.numberOfFixedDatumRecords)) ivarsEqual = false;
     if( ! (numberOfVariableDatumRecords == rhs.numberOfVariableDatumRecords)) ivarsEqual = false;

     for(int idx = 0; idx < fixedDatumRecords.size(); idx++)
        if( ! ( fixedDatumRecords.get(idx).equals(rhs.fixedDatumRecords.get(idx)))) ivarsEqual = false;


     for(int idx = 0; idx < variableDatumRecords.size(); idx++)
        if( ! ( variableDatumRecords.get(idx).equals(rhs.variableDatumRecords.get(idx)))) ivarsEqual = false;

    return ivarsEqual && super.equalsImpl(rhs);
 }
} // end of class
