package _000_OCA_Array_001;

public class Zippy {
    public static void main(String[] args){
        String[] x = {"42"};
        int[] a [] = {{1,2},{1}};
        Object c = new long[4];
        Object[] d = x;

        System.out.println("x = " + x[0]);
        System.out.println("a 0 0 = " + a[0][0]);
        System.out.println("a 0 1 = " + a[0][1]);
        System.out.println("a 1 0 = " + a[1][0]);
        System.out.println("c = " + c);
        System.out.println("d = " + d[0]);


    }
}
