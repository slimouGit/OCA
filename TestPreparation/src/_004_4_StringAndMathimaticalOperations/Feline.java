package _004_4_StringAndMathimaticalOperations;

public class Feline {
    public static void main(String[] args){
        long x = 42L;
        long y = 44L;
        System.out.print(" " + 7 + 2 + " ");        //72            => starts with String, no mathimatical Operations
        System.out.print(foo() + x + 5 + " ");      //foo 42 5      => starts with String, no mathimatical Operations
        System.out.print(x + y + foo());            //86 foo        => dont start with String, mathimatical Operations will be done first
    }

    private static String foo() {
        return "foo";
    }

    //Outcome:  72 foo 42 5 86 foo
}
