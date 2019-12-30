package _008_BadFoodException;

public class TasteFood {

    public static void main(String[] args) {
       tasteFood("Cheese");
       tasteFood("Leberkäse");
    }

    private static void tasteFood(String food) {
        try {
            new Food().tasteFood(food);
        } catch (BadFoodException e) {
            e.printStackTrace();
        }
    }
}
