package _007_IncrementValueTest;

public class MathTest {
    static int players = 0;
    public static void main(String[] args){
        System.out.println("players online " + players++);
        System.out.println("players value is " + players);
        System.out.println("players value is " + ++players);
        System.out.println("players value is " + players);
    }
}
