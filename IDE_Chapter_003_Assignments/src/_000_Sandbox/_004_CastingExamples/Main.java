package _000_Sandbox._004_CastingExamples;

public class Main {
    public static void main(String[] args){
        // A vehicle cant do everything a car is doing in detail
        // Car car = new Vehicle();

        //A Vehicle can do everything a vehicle is doing
        Vehicle vehicle = new Car();
        vehicle.drive("Car");

        //A Car can do everything a vehicle and a car is doing
        Car car = new Car();
        car.drive("Car");
        car.closeDoors();

    }
}
