package _004_9_Operators;

public class Spock {
    public static void main(String[] args) {
        int mask = 0;
        int count = 0;

        if (((5 < 7) || (++count < 10)) | mask++ < 10) {
            mask = mask + 1;
            System.out.println("mask " + mask + " count " + count);
        }
        if ((6 > 8) ^ false) {
            mask = mask + 10;
            System.out.println("mask " + mask + " count " + count);
        }
        if (!(mask > 1) && ++count > 1) {
            mask = mask + 100;
            System.out.println("mask " + mask + " count " + count);
        }
        System.out.println("mask " + mask + " count " + count);

        System.out.println("");
        System.out.println((6 > 8) ^ false);    //false
        System.out.println((6 > 8) ^ true);     //true
        System.out.println((6 < 8) ^ false);    //true
        System.out.println((6 < 8) ^ true);     //false
    }
}
