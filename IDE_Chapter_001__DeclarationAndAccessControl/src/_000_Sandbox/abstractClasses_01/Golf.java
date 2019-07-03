package _000_Sandbox.abstractClasses_01;

public class Golf extends Car {
    @Override
    void refuelCar() {
        System.out.println("refuel my car with " + WHEELS + " wheels");
    }

    @Override
    void driveVehicle() {
        System.out.println("drive my car with " + WHEELS + " wheels");
    }

    public  static void main(String[] args){
        new Golf().refuelCar();
        new Golf().driveVehicle();
    }
}
