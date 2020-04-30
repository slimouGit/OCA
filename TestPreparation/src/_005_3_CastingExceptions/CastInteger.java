package _005_3_CastingExceptions;

public class CastInteger {
    public static void main(String[] args) {
        try {
            int x = Integer.parseInt("two");
        } catch (NumberFormatException nme) {
            System.out.println(nme.getMessage());
            System.out.println(nme.getStackTrace());
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
            System.out.println(iae.getStackTrace());
        }
    }
}
