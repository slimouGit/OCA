package _000_Sandbox.inheritance_02.family;


public class Vater {

    String defaultName = "default Hans"; //visible in same package
    public String publicName = "public Hans"; //visible in same package
    String protectedName = "protected Hans"; //visible in same package

    //visible in same package
    public String publicSwimming(){
        return "Ich schwimme öffentlich";
    }

    //visible in same package
    protected String protectedSwimming(){
        return "Ich schwimme protected";
    }
}
