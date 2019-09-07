package _024_Test._14;

public class DontBoilFrogs implements FrogBoilable {
    public static void main(String[] args){
        new DontBoilFrogs().go();
    }

    private void go() {
        System.out.println(hop());

        //  NOT THE CORRECT SYNTAX TO INVOKE INTERFACES
        //  System.out.println(getCtoF(100));

        //SOLUTION:
        System.out.println(FrogBoilable.getCtoF(100));

        DontBoilFrogs dbf = new DontBoilFrogs();

        //  NOT THE CORRECT SYNTAX TO INVOKE INTERFACES
        // System.out.println(dbf.getCtoF(100));
        //  NOT POSSIBLE CALLING STATIC METHOD FROM INSTANCE

        System.out.println(FrogBoilable.getCtoF(100));

    }


}
