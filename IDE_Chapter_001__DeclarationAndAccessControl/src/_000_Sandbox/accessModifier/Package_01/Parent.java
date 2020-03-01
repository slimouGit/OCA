package _000_Sandbox.accessModifier.Package_01;

public class Parent {
    //ACCESS FROM EACH CLASS IN EACH PACKAGE
    public String publicString = "publicString";
    //ACCESS FROM EACH INHERTITATED CLASS IN EACH PACKAGE
    protected String protectedString = "protectedString";
    //ACCESS FROM EACH INHERTITATED CLASS IN SAME PACKAGE
    String defaultString = "defaultString";
    //ACCESS FROM SAME CLASS
    private String privateString = "privateString";

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

        System.out.println(new Parent().publicString);
        System.out.println(new Parent().protectedString);
        System.out.println(new Parent().defaultString);
         System.out.println(new Parent().privateString);
    }
}
