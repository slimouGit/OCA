package _000_Sandbox._014_ComparingStrings;

/**
 * User: salim
 * Date: 03.10.2020 10:27
 */
public class ComparingStrings {
    public static void main(String[] args){
        String a = "eating cheese";
        String b = new String("eating cheese");
        StringBuilder c = new StringBuilder("eating cheese");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(a == b);         //FALSE
        System.out.println(a.equals(b));    //TRUE

//        System.out.println(a == c);       //COMPAIL ERROR
        System.out.println(a.equals(c));    //FALSE

        System.out.println(a = b);          //eating cheese
        System.out.println(a == b);         //TRUE

    }


}
