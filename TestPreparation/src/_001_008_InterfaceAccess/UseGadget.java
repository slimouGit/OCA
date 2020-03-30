package _001_008_InterfaceAccess;

public class UseGadget implements Gadget {
    /**
     * PUBLIC MODIFIER IS MISSING
    @Override
    void doStuff() {
        System.out.println("doStuff()");
    }
     **/
    @Override
    public void doPublicStuff() {
        System.out.println("doPublicStuff()");
    }
}
