package _010_ShortCircuitLogicalOperators;

public class ShortCircuitLogicalOperators {
    public static void main(String[] args){
        boolean b1 = false, b2 = false;
        boolean b3 = (b1 == true) && (b2 = true); //b2 is never run because of short circuit operator
        System.out.println(b3 + " " + b2);
        //OUTPUT: false false

        boolean b4 = false, b5 = false;
        boolean b6 = (b4 == false) && (b5 = true); //because b4 is true, b5 is running
        System.out.println(b6 + " " + b5);
        //OUTPUT: true true
    }
}
