package _007_CompareObjects;

public class Fizz {
    int x = 5;
    public static void main(String[] args){
        final Fizz f1 = new Fizz();
        Fizz f2 = new Fizz();
        Fizz f3 = FizzSwitsch(f1, f2);
        System.out.println((f1 == f3) + " " + " " + (f1.x == f3.x));
    }

    private static Fizz FizzSwitsch(Fizz x, Fizz y) {
        final Fizz z = x;
        z.x = 6;
        return z;
    }

    //OUTPUT is true true
    //because f1 and f3 all refer to the same instance of Fizz
}
