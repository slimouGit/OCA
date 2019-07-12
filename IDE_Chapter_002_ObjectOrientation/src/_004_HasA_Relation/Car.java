package _004_HasA_Relation;


public class Car extends Vehicle {
    private SteeringWheel wheel = new SteeringWheel();

    public void tut(){
        wheel.honk();
        new SteeringWheel().honk();
    }
}
