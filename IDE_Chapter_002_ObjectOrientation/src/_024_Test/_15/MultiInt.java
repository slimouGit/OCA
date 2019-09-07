package _024_Test._15;

public class MultiInt implements I1, I2 {
    public static void main(String[] args){
        new MultiInt().go();
    }

    void go() {
        System.out.println(doStuff());
    }
    /*
    THIS METHOD WOULD BE CALLED, BUT
    IMPLEMENTED METHOD MUST BE MARKED AS PUBLIC
    int doStuff() {
        return 3;*
    }
    */

    //SOLUTION, MARKE METHOD AS PUBLIC
    public int doStuff() {
        return 3;
    }
}
