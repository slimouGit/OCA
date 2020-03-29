package _018_006_LoopAnArray;

public class Loopy {
    public static void main(String[] args) {
        case1();
        case2();
        case3();
    }

    private static void case1() {
        int[] x = {7, 6, 5, 4, 3, 2, 1};
        for (int y : x) {
            System.out.print(y + " ");
        }
    }

    private static void case2() {
        System.out.println("");
        int[] x = {7, 6, 5, 4, 3, 2, 1};
        for (int y = 0, z = 0; z < x.length; z++) {
            y = x[z];
            System.out.print(y + " ");
        }
    }

    private static void case3() {
        System.out.println("");
        int[] x = {7, 6, 5, 4, 3, 2, 1};
        int y = 0;
        for (int z = 0; z < x.length; z++) {
            y = x[z];
            System.out.print(y + " ");
        }
    }
}
