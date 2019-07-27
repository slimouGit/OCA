package _016_ConstructorFAIL;

public class ConstructorFail {

    /**

     RECURSIV INVOKING

     public ConstructorFail() {
        this("foo");
    }
    public ConstructorFail(String s) {
        this();
    }

     **/

    //ITS LIKE THE FOLLOWING CODE
    //MACHINE WILL EXPLODE
    public void go(){
        doStuff();
    }

    private void doStuff() {
        go();
    }
}
