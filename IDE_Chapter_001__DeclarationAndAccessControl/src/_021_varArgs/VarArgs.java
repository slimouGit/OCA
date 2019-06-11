package _021_varArgs;

/**
 * User: salim
 * Date: 11.06.2019 20:22
 */
public class VarArgs {
    public static void main(String[] args){
        giveMeArgumentsFillMyParams("Argument", 2,1,3,4,5);
    }

    public static void giveMeArgumentsFillMyParams(String parameter, int ... x){
        System.out.println(x.length);
        System.out.println(parameter);
    }
}
