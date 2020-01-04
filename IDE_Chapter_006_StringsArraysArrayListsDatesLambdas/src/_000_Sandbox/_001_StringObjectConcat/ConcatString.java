package _000_Sandbox._001_StringObjectConcat;

/**
 * User: salim
 * Date: 03.01.2020 16:19
 */
public class ConcatString {
    public static void main(String[] args){
        String s = "Java";
        System.out.println(s); //Java
        s.concat(" Geek");
        System.out.println(s); //still Java
        s = s.concat(" Geek");
        System.out.println(s); //now Java Geek
    }
}
