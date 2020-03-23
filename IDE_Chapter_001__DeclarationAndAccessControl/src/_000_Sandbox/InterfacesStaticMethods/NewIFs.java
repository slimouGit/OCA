package _000_Sandbox.InterfacesStaticMethods;

public class NewIFs implements TestIF {

    @Override
    public String m3() {
        return "m3 ";
    }

    public static void main(String[] args){
        NewIFs n = new NewIFs();
        System.out.println(n.m1());
        /*
        System.out.println(n.m2());
        To invoke a static interface method, you must use the interface name,
        not a refernce
        */
        System.out.println(TestIF.m2());
        System.out.println(n.m3());
        System.out.println(n.m3());
    }
}
