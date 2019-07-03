package _000_Sandbox.inheritance_01.parent;


public class Vater {

    String defaultName = "default Hans"; //not visible in different package
    String protectedName = "protected Hans"; //not visible in different package
    public String publicName = "public Hans"; //visible in different package
    private String privateName = "private Hans";

    //visible in different package
    public String publicSwimming(){
        return "Ich schwimme öffentlich";
    }

    //protected not visible in different package
    protected String protectedSwimming(){
        return "Ich schwimme protected";
    }

    //visible in different package
    public String getDefaultName() {
        return defaultName;
    }
}
