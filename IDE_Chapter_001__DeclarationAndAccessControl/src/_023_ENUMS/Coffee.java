package _023_ENUMS;


public class Coffee {
    CoffeeSize size; //each instance of coffee has an enum

    public static void main(String[] args) {
        Coffee coffee1 = new Coffee();
        coffee1.size = CoffeeSize.BIG;

        Coffee coffee2 = new Coffee();
        coffee2.size = CoffeeSize.HUGE;

        System.out.println(coffee1.size.getSize());

        for (CoffeeSize cs : CoffeeSize.values()) {
            System.out.println(cs + " " + cs.getSize());
        }

    }
}
