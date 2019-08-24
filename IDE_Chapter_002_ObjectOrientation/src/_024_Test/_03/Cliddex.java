package _024_Test._03;

/**
 * User: salim
 * Date: 24.08.2019 16:36
 */
public class Cliddex {

    //CANT USED IN SUBCLASS
    private final void flipper(){
        System.out.println("Clidder");
    }

    //CANT BE OVERWRITTEN IN SUBCLASS
    final void barking(){
        System.out.println("Barking from Cliddex");

    }

    //CAN BE OVERWRIDDEN IN SUBCLASS
    void overrideMe(){
        System.out.println("want to be overridden");
    }
}
