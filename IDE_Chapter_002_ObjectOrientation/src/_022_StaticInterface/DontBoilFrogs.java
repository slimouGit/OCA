package _022_StaticInterface;

public class DontBoilFrogs implements FrogBoilable {
    public static void main(String[] args){
        new DontBoilFrogs().go();
    }

    private void go() {
        System.out.println(hop());                              //OK
        //System.out.println(getCtoF(100));                     //cannot find symbol

        //HOW TO INVOKE STATIC METHOD FROM INTERFACE -> DOT OPERATOR
        System.out.println(FrogBoilable.getCtoF(100));   //OK

        DontBoilFrogs dbf = new DontBoilFrogs();                // -> not possible with new object
        //System.out.println(dbf.getCtoF(100));                 //cannot find symbol

    }
}
