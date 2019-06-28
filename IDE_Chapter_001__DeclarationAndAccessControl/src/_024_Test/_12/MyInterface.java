package _024_Test._12;


public interface MyInterface {
    //public static m1(){;} NO RETURN TYPE
    default void m2(){;}
    abstract int m3();
    //final short m4(){return 5;} CANNOT HAVE METHOD BODY
    //default long m5(); //NEEDS A METHOD BODY
    static void m6(){;}


}
