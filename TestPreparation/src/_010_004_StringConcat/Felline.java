package _010_004_StringConcat;

public class Felline {
    public static void main(String[] args){
        long x = 42L;
        long y = 44L;
        System.out.println(" "+ 7 + 2 + " ");       //_72_
        System.out.println(foo() + x + 5 + " ");    //foo425_
        System.out.println(x + y + foo());          //86foo

        System.out.println(x + y);                  //86
        System.out.println(x + y + " ");            //86_
        System.out.println(" " + x + y);            //_4244
        System.out.println(" " + x + y + " ");      //_4244_
    }

    private static String foo() {
        return "foo";
    }
}
