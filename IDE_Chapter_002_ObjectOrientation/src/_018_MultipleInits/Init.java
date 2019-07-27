package _018_MultipleInits;

public class Init {
    Init(int x){
        System.out.println("1-arg const " + x);         // 6.
    }
    Init(){
        System.out.println("no-arg const");             // 5.
    }

    //FIRST INVOKED BLOCK
    static {System.out.println("1st static init");}     // 1.
    {System.out.println("1st instance init");}          // 3.
    {System.out.println("2nd instance init");}          // 4.
    static {System.out.println("2nd static init");}     // 2.

    //SECOND INVOKED BLOCK
    public static void main(String[] args){
        new Init();                                     // 5.
        new Init(42);                                // 6.
    }

    /*

    INVOKE ORDER

    1st static init
    2nd static init
    1st instance init
    2nd instance init
    no-arg const
    1st instance init
    2nd instance init
    1-arg const 42

     */
}
