package OverwriteInterfaceMethods;

interface Hero {
    default String m1(){
        return "m1 ";
    }
}
