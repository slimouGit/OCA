package _041_CastingClasses;

/**
 * User: salim
 * Date: 09.10.2020 18:20
 */
public class CastingClasses {
    public static void main(String[] args){
        Super sp1 = new Sub();
        Super sp0 = new Super();

        System.out.println(sp1 instanceof Sub);

        Sub sb1 = new Sub();
        Super sp2 = new Sub();
        Super sp3 = sp1;
        Sub sb3 = (Sub)sp1;


        String s = null;

        System.out.println(0/7);


    }
}
