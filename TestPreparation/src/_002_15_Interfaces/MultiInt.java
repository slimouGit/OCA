package _002_15_Interfaces;

public class MultiInt implements I1, I2 {
    public static void main(String[] args){
        new MultiInt().go();
    }

    private void go() {
        System.out.println(doStuff());
    }

    public int doStuff(){
        return 3;
    }
}
