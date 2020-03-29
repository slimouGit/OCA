package _027_006_StringManipulating;

public class Theory {
    public static void main(String[] args){
        String s1 = "abc";
        String s2 = s1;
        System.out.println(s1 + " " + s2 + " " + (s1==s2));     //abc abc true
        s1 += "d";
        System.out.println(s1 + " " + s2 + " " + (s1==s2));     //abcd abc false

        StringBuilder sb1 = new StringBuilder("abc");
        StringBuilder sb2 = sb1;
        sb2.append("d");
        System.out.println(sb1 + " " + sb2 + " " + (sb1==sb2)); //abcd abcd true

    }
}
