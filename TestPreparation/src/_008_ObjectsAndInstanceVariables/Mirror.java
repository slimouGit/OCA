package _008_ObjectsAndInstanceVariables;

public class Mirror {
    int size = 7;
    public static void main(String[] args){
        Mirror m1 = new Mirror();
        Mirror m2 = m1;
        int i1 = 10;
        int i2 = 11;
        go(m2, i2);
        System.out.println("m1.size " + m1.size + " m2.size " + m2.size + " " + i1);
    }

    private static void go(Mirror m, int i) {
        m.size = 8;     //Object will be changed
        i = 12;         //Instance variable wont change => is a new variable
    }
}
