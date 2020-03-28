package _003_Interface_001;

public class IfaceTest implements MyInterface {
    public static void main(String[] args){
        new IfaceTest().go();
    }

    private void go() {
        System.out.println(doStuff());
        System.out.println(MyInterface.super.doStuff());
    }

    public int doStuff(){
        return 43;
    }
}
