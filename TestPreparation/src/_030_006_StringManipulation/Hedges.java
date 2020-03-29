package _030_006_StringManipulation;

public class Hedges {
    public static void main(String[] args){
        String s = "JAVA";
        System.out.println(s);  //JAVA
        s = s + "rocks";
        System.out.println(s);  //JAVArocks
        s = s.substring(4,8);
        System.out.println(s);  //rocks
        s.toUpperCase();        // new String Object
        System.out.println(s);  //rocks
    }
}
