package _000_Sandbox._012_Prefixes;

public class Prefixes {

    public static void main(String[] args) {
        int x;
        int y;
        int z;

        System.out.println("------------------------");

        x = 42;
        y = 42;
        z = 42;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("COMPARE (y > --x)");

        if (y > --x) {
            System.out.println("y > x (y > --x)");
        } else {
            System.out.println("y < x (y > --x)");
        }
        if (y == z++) {
            System.out.println("y == z++");
        }
        System.out.println("new y: " + y);
        System.out.println("new x: " + x);
        System.out.println("new z: " + z);

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
