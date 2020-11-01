package _059_GarabargeCollector;

/**
 * User: salim
 * Date: 01.11.2020 18:10
 */
public class GC_Eligibility {
    public static void main(String[] args){
        StringBuilder s1 = new StringBuilder("hello");
        StringBuilder s2 = new StringBuilder("world");

        System.out.println(null == s1);
        System.out.println(null == s2);
        System.out.println(s1);
        System.out.println(s2);

        s1 = s2;

        System.out.println(null == s1);
        System.out.println(null == s2);
        System.out.println(s1);
        System.out.println(s2);
    }
}
