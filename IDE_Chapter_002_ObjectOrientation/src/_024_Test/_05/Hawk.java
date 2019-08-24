package _024_Test._05;

public class Hawk extends Raptor {
    public static void main(String[] args){
        System.out.println("pre ");
        new Hawk(); //CAUSE THIS SUBCLASS BIRD IS CALLED
        System.out.println("hawk ");
    }

    /**
     * OUTPUT:
     b3 STATIC BLOCK
     r1 STATIC BLOCK
     r4 STATIC BLOCK
     pre
     b1 FROM INSTANCE INIT BLOCK
     b2 FROM BIRD CONSTRUCTOR
     r3 INSTANCE INIT BLOCK
     r2 FROM RAPTOR CONSTRUCTOR
     hawk
     */

    //FIRST FROM TREE ARE STATIC METHODS
    //AFTER CREATING INSTANCE OF SUBCLASS THE TREE IS CALLED FROM SUPER TO SUB (FIRST THE INIT THAN CONSTRUCTORS)

    /**
     * Static init blocks are executed at class loading time; instance init
     * blocks run right after the call to super() in a constructor. When multiple init blocks of a
     * single type occur in a class, they run in order, from the top down.
     */
}
