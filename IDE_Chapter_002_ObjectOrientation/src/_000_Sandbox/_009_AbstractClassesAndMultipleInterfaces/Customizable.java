package _000_Sandbox._009_AbstractClassesAndMultipleInterfaces;

public interface Customizable {
    void customizeBall();

    default void myBall(){
      System.out.println("This is my customized blue ball");
    };
}
