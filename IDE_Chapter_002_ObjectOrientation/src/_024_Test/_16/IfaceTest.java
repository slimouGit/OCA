package _024_Test._16;

public class IfaceTest {
    public static void main(String[] args){
        new IfaceTest().go();
    }

    void go() {
        //INSERT CODE HERE
        IfaceTest ifaceTest = new IfaceTest();
        System.out.println(ifaceTest.doStuff());

        System.out.println(doStuff());
    }

    public int doStuff(){
        return 42;
    }
}
