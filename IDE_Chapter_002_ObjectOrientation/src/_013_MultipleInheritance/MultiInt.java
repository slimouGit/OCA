package _013_MultipleInheritance;

public class MultiInt implements I1, I2 {

    public static void main(String[] args){
        new MultiInt().go();
    }

    private void go() {
        System.out.println("doStuff with result: " + doStuff());
        System.out.println("unique method from interface: " + doUniqueStuff());
    }

    //DOSTUFF HAS TO BE OVERRIDDEN BECAUSE COMPILER DONT KNOW WHICH METHOD TO IMPLIMENTING
    @Override
    public int doStuff() {
        return 3;
    }
}
