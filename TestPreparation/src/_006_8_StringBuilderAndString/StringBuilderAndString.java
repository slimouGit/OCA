package _006_8_StringBuilderAndString;

public class StringBuilderAndString {
    public static void main(String[] args){
        String s1 = "abc";
        String s2 = s1;
        s1 += "d";      // ist equal to s1 = s1+"d"; => a new String Object is created
        System.out.println(s1 + " " + s2 + " " + (s1==s2));         //abcd abc false

        StringBuilder sb1 = new StringBuilder("abc");
        StringBuilder sb2 = sb1;
        sb1.append("d");
        System.out.println(sb1 + " " + sb2 + " " + (sb1==sb2));     //abcd abcd true

    }
}
