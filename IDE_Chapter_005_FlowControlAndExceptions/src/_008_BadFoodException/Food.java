package _008_BadFoodException;

public class Food {

    GoodFood goodFood = new GoodFood();

    public void tasteFood(String food) throws BadFoodException {
        if (goodFood.getGoodFood().contains(food)) {
            System.out.println(food + " ist lecker");
        } else {
            throw new BadFoodException(food + " ist nicht gut");
        }
    }
}
