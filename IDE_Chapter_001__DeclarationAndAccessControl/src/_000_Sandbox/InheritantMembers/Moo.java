package _000_Sandbox.InheritantMembers;

/**
 * User: salim
 * Date: 20.09.2020 18:19
 */
public class Moo extends Zoo  {
    public static void main(String[] args){
        //NOT POSSIBLE TO REFERENCE FROM STATIC CONTEXT
        //System.out.println(this.callMyCow());

        Zoo z = new Zoo();
        System.out.println(z.callMyCow());
    }
}
