/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */
package edu.nps.moves.dis7.test;

import edu.nps.moves.dis7.pdus.FirePdu;
import edu.nps.moves.dis7.pdus.Pdu;
import edu.nps.moves.dis7.utilities.PduFactory;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for satisfactory handling of Fire PDU fields and values.
 */
@DisplayName("Fire Pdu Test")
public class FirePduTest extends PduTest
{
  /** Test PDU sending, receiving, marshalling (serialization) and unmarshalling (deserialization) */
  @Test
  @Override
  public void testRoundTrip()
  {
    PduFactory pduFactory = new PduFactory();
    
    FirePdu    firePdu = pduFactory.makeFirePdu();
    // TODO alternate constructors and utility methods
    
    // TODO update PDU-specific tests

    testOnePdu(firePdu);
    testOnePdu(firePdu.setRange(1000.0f).setFireMissionIndex(2)); // pipelining);
  }
  
  /** Test single PDU for correctness according to all contained fields in this PDU type
   * See <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @param createdPdu separate PDU for comparison
   */
  @Override
  protected void testOnePdu(Pdu createdPdu)
  {
     testPduSendReceiveHeaderMatch (createdPdu); // shared tests in superclass
     
     // can cast PDUs at this point since PduType matched
     FirePdu  createdFirePdu = (FirePdu)  createdPdu;
     FirePdu receivedFirePdu = (FirePdu) receivedPdu;

     assertEquals (createdFirePdu.getFiringEntityID(),            receivedFirePdu.getFiringEntityID(),           "mismatched FiringEntityID");
     assertEquals (createdFirePdu.getTargetEntityID(),            receivedFirePdu.getTargetEntityID(),           "mismatched TargetEntityID");
     // TODO Target Entity ID (App, Entity)
     // TODO Munition/Expendable Entity ID (Site, App)
     // TODO Munition/Expendable Entity ID (Entity)
     assertEquals (createdFirePdu.getEventID(),                   receivedFirePdu.getEventID(),                   "mismatched EventID");
     assertEquals (createdFirePdu.getLocationInWorldCoordinates(),receivedFirePdu.getLocationInWorldCoordinates(),"mismatched  LocationInWorldCoordinates");
     assertEquals (createdFirePdu.getVelocity(),                  receivedFirePdu.getVelocity(),                  "mismatched  Velocity");
     assertEquals (createdFirePdu.getFireMissionIndex(),          receivedFirePdu.getFireMissionIndex(),          "mismatched  FireMissionIndex");
     assertEquals (createdFirePdu.getMunitionExpendibleID(),      receivedFirePdu.getMunitionExpendibleID(),      "mismatched  MunitionExpendibleID");
     // TODO Munition Descriptor
     assertEquals (createdFirePdu.getPadding(),                   receivedFirePdu.getPadding(),                   "mismatched  Padding");
     assertEquals (createdFirePdu.getRange(),                     receivedFirePdu.getRange(),                     "mismatched  Range");
     // TODO Fire Type, Padding2, Num Variable Records
     // TODO Variable Records
     
     testPduFinishingChecks(createdPdu); // shared tests in superclass
  }
  
    /**
     * Main method for testing.
     * @see <a href="https://docs.oracle.com/javase/tutorial/getStarted/application/index.html">Java Tutorials: A Closer Look at the "Hello World!" Application</a>
     * @param args [address, port, descriptor] command-line arguments are an array of optional String parameters that are passed from execution environment during invocation
     */
    public static void main(String[] args)
    {
        FirePduTest firePduTest = new FirePduTest();
        
        firePduTest.setUp();
        firePduTest.testRoundTrip();
        firePduTest.tearDown();
    }
}
