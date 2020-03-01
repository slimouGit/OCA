package _000_Sandbox.prefixes;

public class Prefixes {

    public static void main(String[] args) {
        int x;
        int y;

        System.out.println("------------------------");

        x = 42;
        y = 42;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("COMPARE (y > --x)");
        if (y > --x) {
            System.out.println("y > x (y > --x)");
        } else {
            System.out.println("y < x (y > --x)");
        }
        System.out.println("new y: " + y);
        System.out.println("new x: " + x);

        System.out.println("------------------------");

        x = 42;
        y = 42;
        System.out.println("x: " + x);
        System.out.println("y: " + y);

        System.out.println("COMPARE (y > x--)");
        if (y > x--) {
            System.out.println("y > x");
        } else {
            System.out.println("y < x");
        }
        System.out.println("new y: " + y);
        System.out.println("new x: " + x);
        System.out.println("------------------------");

    }
}
