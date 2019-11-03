package _000_Sandbox._006_IncrementDecrementTests;

public class TestinIncrementAndDecrement {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;

        if (y == ++x) {
            System.out.println("y==++x " + ""); //WILL BE PRINTED OUT
        }
        System.out.println("x: " + x + " y: " + y);

        if (y == x++) {
            System.out.println("y==x++ " + ""); //WILL BE PRINTED OUT
        }
        System.out.println("x: " + x + " y: " + y);

        if (y == x++ || x < ++y) {
            System.out.println("y==x++ || x<++y"); //WONT BE PRINTED
        }
        System.out.println("x: " + x + " y: " + y);

        if (y == ++x) {
            System.out.println("y==++x"); //WONT BE PRINTED
        }
        System.out.println("x: " + x + " y: " + y);

        if (x < ++y) {
            System.out.println("x<++y"); //WONT BE PRINTED
        }
        System.out.println("x: " + x + " y: " + y);
    }

    /**
     * OUTPUT
     * y==++x
     * x: 3 y: 3
     * y==x++
     * x: 4 y: 3
     * x: 5 y: 4
     * x: 6 y: 4
     * x: 6 y: 5
     */
}
