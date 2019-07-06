package _000_Sandbox.extendClasses_01;

public class Vehicle implements Drivable {



    @Override
    public void drive() {
        System.out.println("Drive my Vehicle");
    }

    @Override
    public void startEngine() {
        System.out.println("Start my Vehicle");
    }
}
