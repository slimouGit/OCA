package _001_009_InterfaceMethods;

interface MyInterface {
    //public static m1(){;}         no return type

    default void m2(){;}

    abstract int m3();

    //final short m4(){return 5;}   can not have method body

    //default long m5();            needs a method body

    static void m6() {;}

}
