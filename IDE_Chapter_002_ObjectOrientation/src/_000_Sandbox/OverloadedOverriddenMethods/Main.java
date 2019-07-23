package _000_Sandbox.OverloadedOverriddenMethods;

public class Main {
    public static void main(String[] args){
        BigBottle bb = new BigBottle();
        bb.fillBottle();
        bb.fillBottle(1.0);
    }
}
