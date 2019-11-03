package _010_ShortCircuitLogicalOperators;

public class ShortCircuitLogicalOperators2 {
    public static void main(String[] args) {
        if ((isItSmall(3)) || (isItSmall(7))) {
            System.out.println("Result is true");
        }
        if ((isItSmall(6)) || (isItSmall(9))) {
            System.out.println("Result is true");
        }
    }

    private static boolean isItSmall(int i) {
        boolean smallerThan;
        if (i < 5) {
            System.out.println("i < 5");
            smallerThan = true;
        } else {
            System.out.println("i > 5");
            smallerThan = false;
        }
        return smallerThan;
    }
}
