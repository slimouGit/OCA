package _003_2_CastingPrimitives;

public class Fishing {
    public static void main(String[] args){
        byte b1 = 4;
        int i1 = 123456;
        long L1 = (long)i1;
        short s2 = (short)i1;
        byte b2 = (byte)i1;
        int i2 = (int)123.456;
        //byte b3 = b1 +7;     //mathimatical operations are not allowed to primitives smaller than int
        //short s4 = s2 + 9;
        short s5 = 3 + 9;
    }
}
