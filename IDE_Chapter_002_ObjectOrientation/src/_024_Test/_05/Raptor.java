package _024_Test._05;

/**
 * User: salim
 * Date: 24.08.2019 17:01
 */
public class Raptor extends Bird {
    static { System.out.println("r1 STATIC BLOCK");}
    public Raptor() {
        System.out.println("r2 FROM RAPTOR CONSTRUCTOR");
    }
    { System.out.println("r3 INSTANCE INIT BLOCK"); }
    static { System.out.println("r4 STATIC BLOCK");}
}
