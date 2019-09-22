package _001_Casting_implicit_explicit;

public class Casting {
    public static void main(String[] args){
        int a = 100;
        long b = a;         //Implicit cast, an smaller one always fits in a larger one

        System.out.println("int " + a + " long " + b);

        float c = 100.001f;
        //int d = c;        //not possible without cast
        int e = (int)c;     //explicit cast, the smaller one might lose some of the bigger one

        System.out.println("float " + c + " int " + e);
    }
}
