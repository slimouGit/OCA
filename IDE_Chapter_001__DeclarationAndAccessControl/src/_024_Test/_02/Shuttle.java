package _024_Test._02;


public class Shuttle extends Rocket {
    public static void main(String[] args){
        new Shuttle().go();
    }

    void go() {
        blasOff();
//        class__.blastOff();
    }

    private void blasOff() {
        System.out.println("sh-bang");
    }
}
