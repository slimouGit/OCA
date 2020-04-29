package _002_16_Interfaces;

public class IfaceTest implements MyInterface {
    public static void main(String[] args){

        new IfaceTest().go();

    }

    private void go() {
        //INSERT CODE HERE
        System.out.println("class " + doStuff()); // Class Method is called
        System.out.println("class static " + doStaticStuff()); // Class Static Method is called
        System.out.println("interface " + MyInterface.super.doStuff()); // call NON STATIC METHOD FROM INTERFACE
        System.out.println("interface static " + MyInterface.doStaticStuff()); // call STATIC METHOD FROM INTERFACE
    }

    public int doStuff(){
        return 44;
    }

    static int doStaticStuff(){
        return 45;
    }
}
