package _002_001_InvokeOrderStaticInitConstructor;

public class Raptor extends Bird {
    static { System.out.println("1. r1 ");}        //1
    public Raptor(){
        System.out.println("7. r2 ");              //7
    };
    {System.out.println("6. r3 ");}                //6
    static { System.out.println("2. r4 ");}        //2
}
