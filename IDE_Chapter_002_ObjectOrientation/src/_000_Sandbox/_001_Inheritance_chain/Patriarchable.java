package _000_Sandbox._001_Inheritance_chain;

public interface Patriarchable {
    default void iAmTheRealHeadOfFamily(){
        System.out.println("I am the boss!!!");
    }
}
