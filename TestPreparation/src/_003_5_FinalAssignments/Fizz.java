package _003_5_FinalAssignments;

public class Fizz {
    int x = 5;
    public static void main(String[] args){
        final Fizz f1 = new Fizz();
        Fizz f2 = new Fizz();
        System.out.println("f1.x "+f1.x);   //5
        Fizz f3 = FizzSwitch(f1,f2);
        System.out.println((f1 == f3) + " " + (f1.x == f3.x));
        System.out.println("f1.x "+f1.x);   //6
        System.out.println("f2.x "+f2.x);   //5
        System.out.println("f3.x "+f3.x);   //6
    }

    private static Fizz FizzSwitch(Fizz x, Fizz y) {
        final Fizz z = x;
        z.x = 6;
        return z;
    }
}
