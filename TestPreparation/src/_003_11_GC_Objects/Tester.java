package _003_11_GC_Objects;

public class Tester {
    public static void main(String[] args){
        Beta b1 = new Beta();
        Beta b2 = new Beta();
        Alpha a1 = new Alpha();
        Alpha a2 = new Alpha();
        a1.b1 = b1;
        a1.b2 = b1;
        a2.b2 = b1;
        a1 = null;
        b1 = null;
        b2 = null;
        //HOW MANY OBJECTS WILL BE ELIGIBLE FOR GARBAGE COLLECTION
        System.out.println("a1 "+a1);
        System.out.println("a2 "+a2);
        System.out.println("b1 "+b1);
        System.out.println("b2 "+b2);
        System.out.println("a1.b1 "+a1.b1);
        System.out.println("a1.b2 "+a1.b2);
        System.out.println("a2.b2 "+a2.b2);
    }
}
