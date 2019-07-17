package edu.nps.moves.dis.jammers.Deception.GateStealer;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis.*;

/* marshal size 8 bits*/
public enum SubCategory implements edu.nps.moves.dis.JammerSubCategory
{
    CHIRPGATESTEALERCGS (5, "Chirp Gate Stealer (CGS)"),
    RANGEGATEPULL_OFFRGPO (10, "Range Gate Pull-Off (RGPO)"),
    RGPOANDVGPO (15, "RGPO and VGPO"),
    VGPOAKAVELOCITYGATESTEALER_VGS (20, "VGPO (aka Velocity Gate Stealer, VGS)");

    private byte value;
    private final String description;

    SubCategory(int value, String description)
    {
        this.value = (byte)value;
        this.description = description;
    }

    public byte getValue()
    {
        return value;
    }

    public String getDescription()
    {
        return description;
    }
    
    public static SubCategory getEnumerationForValue(int i)
    {
       for(SubCategory val: values()) {
          if(val.getValue()==i)
              return val;
       }
       System.err.println("No enumeration found for value " + i + " of enumeration SubCategory");
       return null;
    }

    @Override
    public void marshal(DataOutputStream dos)
    {
        try {
            dos.writeByte(getValue());
        }
        catch(IOException ex) {
            System.err.println(ex.getClass().getSimpleName()+": "+ex.getMessage());
        }
    }
    
    @Override
    public int unmarshal(DataInputStream dis)
    {
        try {
            value = dis.readByte();
        }
        catch(IOException ex) {
            showError(ex);
        }
        return 1;
    } 

    @Override
    public void marshal(ByteBuffer buff)
    {
        try {
            buff.put(getValue());
        }
       catch(Exception ex) {
            showError(ex);
        }
    }

    @Override
    public int unmarshal(ByteBuffer buff)
    {
        try {
            value = buff.get();
        }
        catch(Exception ex) {
            showError(ex);
        }
        return 1;
    }

    @Override
    public int getMarshalledSize()
    {
        return 1; // 8 bits
    }

    private void showError(Exception ex)
    {
        System.err.println(ex.getClass().getSimpleName()+": "+ex.getMessage());
    }
}
