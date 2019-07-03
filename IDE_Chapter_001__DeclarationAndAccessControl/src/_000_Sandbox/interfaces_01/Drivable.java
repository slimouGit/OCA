package _000_Sandbox.interfaces_01;


public interface Drivable {

    void drive();

    default void parkingCar(){
      System.out.print("parking the car");
    };
}
