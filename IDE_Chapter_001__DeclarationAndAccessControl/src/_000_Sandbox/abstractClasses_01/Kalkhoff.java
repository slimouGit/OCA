package _000_Sandbox.abstractClasses_01;


public class Kalkhoff extends Bike {
    @Override
    void pushBike() {
        System.out.println("I push my bike with " + WHEELS + " wheels");
    }

    @Override
    void driveVehicle() {
        System.out.println("I drive my bike with " + WHEELS + " wheels");
    }

    public static void main(String[] args){
        new Kalkhoff().pushBike();

        Kalkhoff kalkhoff = new Kalkhoff();
        kalkhoff.driveVehicle();
    }
}
