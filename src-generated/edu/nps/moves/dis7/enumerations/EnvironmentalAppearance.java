// autogenerated using string template disbitset1.txt

package edu.nps.moves.dis7.enumerations;

import edu.nps.moves.dis7.pdus.*;

/**
 * Generated from XML,
 *  UID 38, marshal size 32,
 * EnvironmentalAppearance
 */
public class EnvironmentalAppearance extends DisBitSet 
{

  // autogenerated using string template disbitsetcommentxref.txt
  /**
   * (bit position 16, length=4) Describes the density,  use {@link AppearanceEnvironmentalDensity} values for this field
   */
  // autogenerated using string template disbitset16.txt
  public static Bits DENSITY = new Bits(16, 4, AppearanceEnvironmentalDensity.class);

  // autogenerated using string template disbitsetcomment.txt
  /**
   * (bit position 21, boolean) Describes whether the entity is frozen and should not be dead reckoned
   */
  // autogenerated using string template disbitset15.txt
  public static Bits ISFROZEN = new Bits(21, 1);

  // autogenerated using string template disbitsetcommentxref.txt
  /**
   * (bit position 23, boolean) Describes whether the entity is active or deactivated,  use {@link AppearanceEntityorObjectState} values for this field
   */
  // autogenerated using string template disbitset16.txt
  public static Bits STATE = new Bits(23, 1, AppearanceEntityorObjectState.class);

  // autogenerated using string template disbitsetcomment.txt
  /**
   * (bit position 31, boolean) Describes whether or not the entity is masked or cloaked
   */
  // autogenerated using string template disbitset15.txt
  public static Bits MASKEDCLOAKED = new Bits(31, 1);;
  // autogenerated using string template disbitset2.txt
  /** Internal class */
  public static class Bits
  {
    private int position;
    private int length;
    private int inputmask;
    private Class cls;

    private Bits(int position) {
      this(position,1, null);
    }
    
    private Bits(int position, Class cls) {
      this(position,1, cls);
    }

    private Bits(int position, int length ) {
      this(position,length,null);
    }

    private Bits(int position, int length, Class cls) {
      this.position = position;
      this.length = length;
      this.cls = cls;
      inputmask = calculateMask(length);
    }
  }

  /** Default constructor */
  public EnvironmentalAppearance()
  {
    super(32); // length from bitfield element
  }

  /** Default constructor with parameters
   * @param wh Bits custom data structure
   * @param value bits of interest  */
  public EnvironmentalAppearance(Bits wh, int value)
  {
    this();
    set(wh,value);
  }

  /** Accessor method to set value
   * @param wh Bits custom data structure
   * @param value bits of interest
   * @return this object */
  public EnvironmentalAppearance set(Bits wh, int value)
  {
    //if((value & ~wh.inputmask) != 0)
    //  throw new EnumNotFoundException("bad bits passed to "+getClass().getSimpleName()+", field "+wh.name() + " cannot be "+value);

    setbits(wh.position,wh.length,value);
    return this;
  }
/*
  public EnvironmentalAppearance set(Bits wh, Object val) throws Exception
  {
    if(val.getClass() != wh.cls)
      throw new EnumNotFoundException("bad enum passed to "+getClass().getSimpleName()+", field "+wh.name() + " cannot be "+val.getClass().getSimpleName());;
    Method getValueMethod = wh.cls.getMethod("getValue",null);
    int bits = (int)getValueMethod.invoke(val, (Object[])null);
    setbits(wh.position,wh.length,bits);
    return this;
  }
*/
  /** Some bitfields are defined without specific bits enumerated
   * @param start initial position in bit array
   * @param length number of bits
   * @param value bits of interest
   * @return this object */
  public EnvironmentalAppearance set(int start, int length, int value)
  {
      setbits(start,length,value);
      return this;
  }

  /** Provide string representation
   * @return string representation */
  @Override
  public String toString()
  {
      return "EnvironmentalAppearance: " + super.toString();
  }
}
