package _005_003_Literally;

public class Literally {
    public static void main(String[] args){
        int i1 = 1_000;
        int i2 = 10_00;
        int i3 = 0b101010;
        int i4 = 0B10_1010;
        int i5 = 0x2_a;
        /**
         //underscore cant include at the beginning of numeric literals
         int i6 = _10_000
         */

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);
    }
}
