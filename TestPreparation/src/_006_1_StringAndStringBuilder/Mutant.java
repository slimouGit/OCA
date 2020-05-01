package _006_1_StringAndStringBuilder;

public class Mutant {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("abc");
        String s = "abc";
        sb.reverse().append("d");
        s.toUpperCase().concat("s");    //String operations are working on a new (lost) String, not string s
        System.out.println(sb); //cbad
        System.out.println(s);  //abc
    }
}
