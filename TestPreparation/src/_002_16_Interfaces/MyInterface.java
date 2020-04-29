package _002_16_Interfaces;

public interface MyInterface {
    default int doStuff(){
        return 42;
    }

    static int doStaticStuff(){
        return 43;
    }
}
