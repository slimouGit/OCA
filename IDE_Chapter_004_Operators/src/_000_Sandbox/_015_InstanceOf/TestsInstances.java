package _000_Sandbox._015_InstanceOf;

/**
 * User: salim
 * Date: 03.10.2020 10:43
 */
public class TestsInstances {
    public static void main(String[] args){
        Fruit fruit = new Fruit();
        Apple apple = new Apple();

        System.out.println(apple instanceof Fruit);     //TRUE
        System.out.println(fruit instanceof Apple);     //FALSE

        System.out.println(apple instanceof Eating);     //TRUE
        System.out.println(fruit instanceof Eating);     //TRUE

    }
}
