package _002_001_InvokeOrderStaticInitConstructor;

public class Bird {
    static { System.out.println("1. static ");}
    {System.out.println("1. Init ");}                //4
    public Bird(){System.out.println("Constructor Bird ");}   //5
}
