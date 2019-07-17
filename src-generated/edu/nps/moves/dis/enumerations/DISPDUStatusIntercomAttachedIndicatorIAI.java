package edu.nps.moves.dis.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis.*;

/**
 * Generated from XML, SISO-REF-010-v25, 2018-08-29<br>
 * UID 307 marshal size 2<br>
 * DIS-PDU Status-Intercom Attached Indicator (IAI)
 */
public enum DISPDUStatusIntercomAttachedIndicatorIAI 
{
    /** No Statement */
    NO_STATEMENT (0, "No Statement"),
    /** Unattached */
    UNATTACHED (1, "Unattached"),
    /** Attached */
    ATTACHED (2, "Attached");

    private int value;
    private final String description;

    DISPDUStatusIntercomAttachedIndicatorIAI(int value, String description)
    {
        this.value = value;
        this.description = description;
    }

    public int getValue()
    {
        return value;
    }

    public String getDescription()
    {
        return description;
    }
    
    public static int getEnumBitWidth()
    {
      return 2;
    }

    public static DISPDUStatusIntercomAttachedIndicatorIAI getEnumForValue(int i)
    {
       for(DISPDUStatusIntercomAttachedIndicatorIAI val: DISPDUStatusIntercomAttachedIndicatorIAI.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.err.println("No enumeration found for value " + i + " of enumeration DISPDUStatusIntercomAttachedIndicatorIAI");
       return null;
    }


    public void marshal(DataOutputStream dos) throws IOException
    {
        dos.writeByte(getValue());
    }
    
    public void marshal(ByteBuffer buff) throws Exception
    {
        buff.put((byte)getValue());
    }

    public static DISPDUStatusIntercomAttachedIndicatorIAI unmarshalEnum (DataInputStream dis) throws Exception
    {
       /* try {
            value = dis.readUnsignedByte();
        }
        catch(IOException ex) {
            showError(ex);
        } */
        
        return getEnumForValue((int)dis.readByte());
    } 

    public static DISPDUStatusIntercomAttachedIndicatorIAI unmarshalEnum(ByteBuffer buff) throws Exception
    {
        /*
        try {
            value = (int)buff.get();
        }
        catch(Exception ex) {
            showError(ex);
        }
        */
        return getEnumForValue((int)buff.get());
    }

    public int getMarshalledSize()
    {
        return 1; // 8 bits
    }
}
