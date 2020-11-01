package _048_Overridden;

/**
 * User: salim
 * Date: 01.11.2020 08:49
 */
public class Clidlet extends Clidder {
    public final void flipper(){
        System.out.println("Clidlet");
    };
    public static void main(String[] args){
        new Clidlet().flipper();
    };
}
