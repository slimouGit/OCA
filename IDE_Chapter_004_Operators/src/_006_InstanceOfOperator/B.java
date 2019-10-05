package _006_InstanceOfOperator;

public class B extends A {
    public static void main(String[] args){
        A myA = new B();
        m2(myA);
    }

    private static void m2(A a) {
        if(a instanceof B){
            ((B)a).doStuff();
        }
    }

    private void doStuff() {
        System.out.println("'a' refers to 'B'");
    }
}
