package _003_12_VariableReferences;

public class Telescope {
    static int magnify = 2;
    public static void main(String[] args){
        go();
    }

    private static void go() {
        int magnify = 3;
        zoomIn();
    }

    private static void zoomIn() {
        magnify *= 5;
        zoomMore(magnify);
        System.out.println(magnify);    //10
    }

    private static void zoomMore(int magnify) {
        magnify *= 7;
    }
}
