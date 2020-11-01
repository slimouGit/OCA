package _056_StringImmutable;

/**
 * User: salim
 * Date: 01.11.2020 17:07
 */
public class ImmutableString {
    public static void main(String[] args){
        String s1 = "abc";
        System.out.println(s1);
        s1.concat("def");
        System.out.println(s1);
        s1 = s1.concat("def");
        System.out.println(s1);
    }
}
