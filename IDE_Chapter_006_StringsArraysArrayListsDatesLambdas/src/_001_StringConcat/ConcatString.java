package _001_StringConcat;

public class ConcatString {
    public static void main(String[] args){
    String s1 = "spring ";
    String s2 = s1 + "summer";
    s1.concat("fall");                  //no result Strings are immutable
    s2.concat(s1);                      //no result Strings are immutable
    s1 += "winter";
    System.out.println(s1 + " " + s2);  //spring winter spring summer
    }
}
