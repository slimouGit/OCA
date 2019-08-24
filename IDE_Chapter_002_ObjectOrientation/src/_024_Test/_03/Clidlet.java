package _024_Test._03;

/**
 * User: salim
 * Date: 24.08.2019 16:37
 */
public class Clidlet extends Cliddex {
    public final void flipper(){
        System.out.println("Clidlet");
    }

    /**
     * FINAL METHOD IN CLIDDEX MUST NOT BE OVERWRITTEN
    void barking(){
        System.out.println("Barking from Cliddex");

    }
     **/

    void overrideMe(){
        System.out.println("u are overridden");

    }

    public static void main(String[] args){
        new Clidlet().flipper(); //NO ACCESS TO PRIVATE MEMBER IN CLIDDEX
        new Clidlet().barking();
        new Clidlet().overrideMe();
    }
}
