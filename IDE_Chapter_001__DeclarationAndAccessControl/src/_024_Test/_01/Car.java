package _024_Test._01;

public class Car implements Buyable {

    @Override
    public void buyCar(){
        //PRICE = 20000.00; not possible to change constants value
        //doors = 2;
        System.out.println("Car price is: " + PRICE + " with " + doors + " doors");
    }

    @Override
    public void sellCar() {
        
    }
}
