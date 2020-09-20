package _000_Sandbox.AccessibiltyInOtherPackages.One;

/**
 * User: salim
 * Date: 20.09.2020 18:03
 */
public class OtherClass {

    //NOT VISIBLE
    String a = "default String";
    //NOT VISIBLE
    protected String b = "protected String";
    //IS VISIBLE
    public String c = "public String";
    //NOT VISIBLE
    private String d = "private String";


    //DEFAULT ACCESS NOT VISIBLE IN OTHER PACKAGE
    void testItDefault(){
        System.out.println("I am a default method in another package");
    }

    //PROTECTED ACCESS NOT VISIBLE IN OTHER PACKAGE
    protected void testItProtected(){
        System.out.println("I am a protected method in another package");
    }

    //PUBLIC ACCESS IS VISIBLE IN OTHER PACKAGE
    public void testItPublic(){
        System.out.println("I am a public method in another package");
    }
}
