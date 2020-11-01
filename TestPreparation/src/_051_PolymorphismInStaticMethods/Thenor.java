package _051_PolymorphismInStaticMethods;



/**
 * User: salim
 * Date: 01.11.2020 09:39
 */
public class Thenor extends Singer {
    public static String sing(){return "Thenor";}

    public static void main(String[] args){
        Thenor t = new Thenor();
        Singer s = new Thenor();
        System.out.println(t.sing() + " " + s.sing());
    }
}
