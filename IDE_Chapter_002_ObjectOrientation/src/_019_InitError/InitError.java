package _019_InitError;

public class InitError {

    static int[] x = new int[4];

    /**
     * OUT OF BOUNCE EXCEPTION BY INITIALITION ARRAY INDEX NR 5

     static {x[4] = 5;}

     */

    static {
        x[0] = 1;
    }
    static {
        x[1] = 2;
    }
    static {
        x[2] = 3;
    }
    static {
        x[3] = 4;
    }

    public static void main(String[] args) {
        System.out.println(x.length);
        System.out.println(x[0]);

        for (int i : x) {
            System.out.println(i);

        }
    }
}
