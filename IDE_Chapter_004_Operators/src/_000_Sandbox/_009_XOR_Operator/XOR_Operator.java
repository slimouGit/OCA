package _000_Sandbox._009_XOR_Operator;

/**
 * User: salim
 * Date: 27.09.2020 17:55
 */
public class XOR_Operator {
    public static void main(String[] args) {
        int x = 2;
        System.out.println("true true = " + ((4 > x) ^ (1 < x)));
        System.out.println("false false = " + ((4 < x) ^ (1 > x)));

        System.out.println("true false = " + ((4 > x) ^ (1 > x)));
        System.out.println("false true = " + ((4 < x) ^ (1 < x)));
    }
}
