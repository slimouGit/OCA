package _009_Interface_Static_Methods;

public class Number implements Omniscient{
    public static void main(String[] args){
        System.out.println("Omniscient number is: " + Omniscient.omniscientNumber());
    }

    @Override
    public int omniscientNumber_2() {
        return 42;
    }
}
