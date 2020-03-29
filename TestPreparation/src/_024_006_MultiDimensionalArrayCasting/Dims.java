package _024_006_MultiDimensionalArrayCasting;

public class Dims {
    public static void main(String[] args){
        int[][] a = {{1,2},{3,4}};
        System.out.println(a[1].length);
        int[] b = (int[]) a[1];
        for(int x:b)  System.out.println(x);
        System.out.println(b);
    }
}
