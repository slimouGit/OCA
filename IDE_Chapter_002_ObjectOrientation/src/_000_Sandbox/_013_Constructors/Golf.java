package _000_Sandbox._013_Constructors;

public class Golf extends Car {

    private String model;

    public Golf(int age, double power, String color) {
        super(age, power, color);
    }

    public Golf(int age, double power, String color, String model){
        this(age, power, color);
        this.model = model;
    }


}
