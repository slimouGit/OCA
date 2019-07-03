package _000_Sandbox.interfaces_01;

/**
 * User: salim
 * Date: 03.07.2019 17:57
 */
public class Porsche implements Car {

    int WHEELS = 5;

    @Override
    public void drive() {
        System.out.println("I drive my car with " + WHEELS + " wheels");
        System.out.println("I drive my car with " + Car.WHEELS + " wheels");
    }

    @Override
    public void stopCar() {
        System.out.println("I stop driving my car");
    }

    public static void main(String[] args){
        new Porsche().drive();
        new Porsche().stopCar();

        new Porsche().parkingCar(); //is implimentated as default methos
    }

}
