package _049_InvokeOrder;

public class InvokeOrder {
    public InvokeOrder() {
        System.out.println("Constructor");
    }
    static {System.out.println("Static");}
    {System.out.println("Init");}

    public static void main(String[] args){
        System.out.println("Main Method");
        new InvokeOrder();
    }

}
