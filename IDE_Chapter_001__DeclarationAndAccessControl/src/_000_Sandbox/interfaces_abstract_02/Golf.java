package _000_Sandbox.interfaces_abstract_02;

public class Golf extends Car{
    @Override
    public void colorize(String color) {
        System.out.println("Your car is now " + color);
    }

    @Override
    public void drive() {
        System.out.println("You drive your car.");
    }

    @Override
    void buyVehivle() {
        System.out.println("You buy your car.");
    }

}
