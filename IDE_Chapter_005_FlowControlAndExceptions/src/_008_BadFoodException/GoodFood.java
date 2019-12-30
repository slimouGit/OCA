package _008_BadFoodException;

import java.util.ArrayList;
import java.util.List;

public class GoodFood {
    private List goodFood = new ArrayList();

    {
        this.goodFood.add("Fish");
        this.goodFood.add("Cheese");
    }

    public List getGoodFood() {
        return goodFood;
    }
}
