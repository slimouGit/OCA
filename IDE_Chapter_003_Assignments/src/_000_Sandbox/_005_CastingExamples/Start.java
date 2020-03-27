package _000_Sandbox._005_CastingExamples;

public class Start {
    public static void main(String[] args){
        A a = new B();
        a.say();

        B b = new B();
        b.say();
        b.say("Mimi");

        C c = new C();
        c.say();
    }
}
