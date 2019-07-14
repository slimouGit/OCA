package _000_Sandbox.Inheritance_chain;

public interface Patriarchable {
    default void iAmTheRealHeadOfFamily(){
        System.out.println("I am the boss!!!");
    }
}
