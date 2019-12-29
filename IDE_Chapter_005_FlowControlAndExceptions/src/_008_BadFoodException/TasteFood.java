package _008_BadFoodException;

import java.util.ArrayList;
import java.util.List;

public class TasteFood {
    static List goodFood = new ArrayList();

    public static void main(String[] args) {
        goodFood.add("Fish");
        goodFood.add("Cheese");
        testFood("Fish");
        testFood("Leberkäse");
    }

    private static void testFood(String food) {
        if (goodFood.contains(food)) {
            System.out.println(food + " ist lecker");
        } else {
            try {
                throw new BadFoodException(food + " ist widerlich");
            } catch (BadFoodException e) {
                e.printStackTrace();
            }
        }
    }
}
