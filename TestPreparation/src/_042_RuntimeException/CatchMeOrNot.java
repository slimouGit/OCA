package _042_RuntimeException;

/**
 * User: salim
 * Date: 10.10.2020 17:28
 */
public class CatchMeOrNot {
    public static void throwit() {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        try {
            System.out.println("Hello world");
            throwit();
        }finally {
            System.out.println("Finaliy excecution");
        }
    }
}
