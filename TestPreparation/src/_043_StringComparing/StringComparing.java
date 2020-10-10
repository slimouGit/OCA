package _043_StringComparing;

/**
 * User: salim
 * Date: 10.10.2020 18:20
 */
public class StringComparing {
    public static void main(String[] args){
        String a = "abc";
        String b = new String("abc");

        System.out.println(a==b);
        System.out.println(a.equals(b));

        StringBuilder c = new StringBuilder("abc");
        StringBuilder d = new StringBuilder("abc");

        System.out.println(c==d);
        System.out.println(c.equals(d));
    }
}
