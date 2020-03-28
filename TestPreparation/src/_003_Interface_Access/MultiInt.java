package _003_Interface_Access;

public class MultiInt implements I1, I2 {


    public static void main(String[] args){
        new MultiInt().go();
    }

    void go() {
        System.out.print(doStuff());
    }

    public int doStuff(){ //HAS TO HAVE PUBLIC ACCESSOR OR ONE INTERFACE METHOD HAS TO BE OVERRIDDEN
        return 3;
    }
}
