package _000_Sandbox.InheritantMembers;

/**
 * User: salim
 * Date: 20.09.2020 18:19
 */
public class Moo extends Zoo  {
    public void useMyCow(){
        System.out.println(this.callMyCow());

        Zoo z = new Zoo();
        System.out.println(z.callMyCow());
    }

    public static void main(String[] args){
        Moo m = new Moo();
        m.useMyCow();
    }
}
