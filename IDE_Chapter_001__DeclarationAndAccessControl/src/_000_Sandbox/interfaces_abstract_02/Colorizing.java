package _000_Sandbox.interfaces_abstract_02;

public interface Colorizing {
    abstract public void colorize(String color);

    //has not to be implemented
    default void cleanCar(){
        System.out.println("Car is cleaned");
    }
}
