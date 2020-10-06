package _002_001_InvokeOrderStaticInitConstructor;

public class Raptor extends Bird {
    static { System.out.println("2. static ");}        //1
    public Raptor(){
        System.out.println("Constructor Raptor ");              //7
    };
    {System.out.println("2. Init ");}                //6
    static { System.out.println("3. static ");}        //2
}
