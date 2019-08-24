package _024_Test._05;

public class Bird {
    { System.out.println("b1 FROM INSTANCE INIT BLOCK"); }
    public Bird(){
        System.out.println("b2 FROM BIRD CONSTRUCTOR");
    }
    static { System.out.println("b3 STATIC BLOCK");}
}
