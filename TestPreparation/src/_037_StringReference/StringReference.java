package _037_StringReference;

public class StringReference {
    public static void main(String[] args){
        String a = "abc";
        String b = a;

        System.out.println(a);
        System.out.println(b);

        System.out.println(a.concat("def"));

        System.out.println(a);
        System.out.println(b);


        String c = "0123456";

        System.out.println(c);
        System.out.println(c.substring(1,3));
        System.out.println(c);

        int x = -1;


    }
}
