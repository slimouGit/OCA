package _006_Interface;

/**
 * User: salim
 * Date: 10.06.2019 15:57
 */
public class Car implements Drivable{
    @Override
    public void driveCar(){
        System.out.println("Car is driving");
    }
}
