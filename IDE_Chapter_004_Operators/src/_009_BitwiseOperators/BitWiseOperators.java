package _009_BitwiseOperators;

public class BitWiseOperators {
    public static void main(String[] args){
        byte b1 = 6 & 9;
        byte b2 = 6 | 9;
        byte b3 = 6 ^ 9;
        System.out.println(b1 + " " + b2 + " " + b3);
    }

    /**
     * OUTPUT
     *
     * 0 15 15
     */
}
