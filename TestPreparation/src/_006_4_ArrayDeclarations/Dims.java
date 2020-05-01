package _006_4_ArrayDeclarations;

public class Dims {
    public static void main(String[] args){
        int[][] a = {{1,2},{3,4}};
        int[] b = (int[]) a[1];
        Object o1 = a;
        int[][] a2 = (int[][]) o1;
//        int[] b2 = (int[]) o1;  o1 refers to an int[][]
        System.out.println(b[1]);
        System.out.println(a[1][0]);
    }
}
