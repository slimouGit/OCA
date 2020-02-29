package _000_Sandbox.accessModifier.Package_01;

public class Parent {
    //ACCESS FROM EACH CLASS IN EACH PACKAGE
    public void callMyName_public(String name){
        System.out.println("Hello Public " + name);
    }

    //ACCESS FROM EACH INHERTITATED CLASS IN EACH PACKAGE
    protected void callMyName_protected(String name){
        System.out.println("Hello Protected " + name);
    }

    //ACCESS FROM EACH INHERTITATED CLASS IN SAME PACKAGE
    void callMyName_default(String name){
        System.out.println("Hello Default " + name);
    }

    //ACCESS FROM SAME CLASS
    private void callMyName_private(String name){
        System.out.println("Hello Private " + name);
    }

    public static void main (String[] args){
        new Parent().callMyName_public("Vather");
        new Parent().callMyName_protected("Vather");
        new Parent().callMyName_default("Vather");
        new Parent().callMyName_private("Vather");
    }
}
