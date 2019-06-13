package _021_varArgs;

/**
 * User: salim
 * Date: 11.06.2019 20:22
 */
public class VarArgs {
    public static void main(String[] args){
        foo("3 Argumente", 1,2,42);
        foo("5 Argumente", 1,2,3,4,5);
    }

    private static void foo(String s, int ... x) {
        System.out.println("");
        System.out.println(s);
        for(int i:x){
            System.out.print(i + " ");
        }
    }

  
}
