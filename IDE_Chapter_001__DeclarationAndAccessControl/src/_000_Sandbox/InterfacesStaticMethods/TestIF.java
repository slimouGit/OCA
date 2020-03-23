package _000_Sandbox.InterfacesStaticMethods;

public interface TestIF {
    default String m1(){return "m1 ";}
    static String m2() {return "m2 ";}
    public String m3();
}
