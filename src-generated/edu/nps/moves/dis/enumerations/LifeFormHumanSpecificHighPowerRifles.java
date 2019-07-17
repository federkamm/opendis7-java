package edu.nps.moves.dis.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis.*;

/**
 * Generated from XML, SISO-REF-010-v25, 2018-08-29<br>
 * UID 475 marshal size 8<br>
 * Life Form-Human-Specific-High Power Rifles
 */
public enum LifeFormHumanSpecificHighPowerRifles 
{
    /** Other */
    OTHER (0, "Other"),
    /** 7.62mm M14 */
    $762MM_M14 (10, "7.62mm M14"),
    /** 7.62mm Remington 700 */
    $762MM_REMINGTON_700 (11, "7.62mm Remington 700"),
    /** 7.62mm SIG-Sauer SSG-2000 */
    $762MM_SIG_SAUER_SSG_2000 (12, "7.62mm SIG-Sauer SSG-2000"),
    /** 7.62mm Stoner SR-25 */
    $762MM_STONER_SR_25 (13, "7.62mm Stoner SR-25"),
    /** 7.62mm Mosin-Nagant Model 1891/30 */
    $762MM_MOSIN_NAGANT_MODEL_1891_30 (14, "7.62mm Mosin-Nagant Model 1891/30"),
    /** 7.62mm HK417 */
    $762MM_HK417 (15, "7.62mm HK417"),
    /** 7.62mm HK417 16" Recce */
    $762MM_HK417_16_RECCE (16, "7.62mm HK417 16' Recce"),
    /** 7.65mm BAR M1918 */
    $765MM_BAR_M1918 (50, "7.65mm BAR M1918"),
    /** 7.65mm M1 Garand */
    $765MM_M1_GARAND (51, "7.65mm M1 Garand");

    private int value;
    private final String description;

    LifeFormHumanSpecificHighPowerRifles(int value, String description)
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
      return 8;
    }

    public static LifeFormHumanSpecificHighPowerRifles getEnumForValue(int i)
    {
       for(LifeFormHumanSpecificHighPowerRifles val: LifeFormHumanSpecificHighPowerRifles.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.err.println("No enumeration found for value " + i + " of enumeration LifeFormHumanSpecificHighPowerRifles");
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

    public static LifeFormHumanSpecificHighPowerRifles unmarshalEnum (DataInputStream dis) throws Exception
    {
       /* try {
            value = dis.readUnsignedByte();
        }
        catch(IOException ex) {
            showError(ex);
        } */
        
        return getEnumForValue((int)dis.readByte());
    } 

    public static LifeFormHumanSpecificHighPowerRifles unmarshalEnum(ByteBuffer buff) throws Exception
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
