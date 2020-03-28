package _004_CastingTypes;

public class CastingTypes {
    byte b1 = 4;
    int i1 = 123456;
    long L1 = (long)i1;
    short s2 = (short)i1;
    byte b2 = (byte)i1;
    int i2 = (int)123.456;
    /**

    Fails, when mathimatical operation is performed on any primitives smaller than ints
    byte b3 = b1 + 7;
    short s3 = s2 + 6;

    */

    int i3 = i2 + 42;

}
