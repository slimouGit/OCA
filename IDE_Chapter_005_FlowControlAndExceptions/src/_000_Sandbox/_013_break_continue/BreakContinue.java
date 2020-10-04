package _000_Sandbox._013_break_continue;

/**
 * User: salim
 * Date: 03.10.2020 18:39
 */
public class BreakContinue {
    public static void main(String[] args){
        int x = 0;
        int y = 0;
        while(x<10){
            x++;
            System.out.println(x);
            if(x==5){
                System.out.println("Nö, Ende hier " + x);
                break;
            }
        }
    }
}
