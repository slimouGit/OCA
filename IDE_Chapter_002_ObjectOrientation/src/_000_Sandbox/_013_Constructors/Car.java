package _000_Sandbox._013_Constructors;

public class Car extends Vehicle {
    private String color;
    private double power;

    public Car(int age, double power) {
        super(age);
        this.power = power;
    }

    public Car(int age, double power, String color){
        this(age, power);
        this.color = color;
    }
}
