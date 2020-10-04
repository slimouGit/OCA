package _000_Sandbox._016_Concatinations;

/**
 * User: salim
 * Date: 03.10.2020 11:02
 */
public class Concatinations {
    public static void main(String[] arsg) {
        int a = 42;
        int b = 42;
        String string_a = "Käse";
        String string_b = "Kuchen";

        System.out.println(a+b);

        System.out.println(string_a+string_b);

        System.out.println(string_a+a+b);

        System.out.println(a+b+string_a);

        System.out.println(a+b+string_a+a+b);

        System.out.println(string_a + a/b);

    }
}
