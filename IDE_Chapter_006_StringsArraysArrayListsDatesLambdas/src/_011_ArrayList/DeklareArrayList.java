package _011_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class DeklareArrayList {
    public static void main(String[] args){
        List<String> cities = new ArrayList<>();
        cities.add("London");
        cities.add("Paris");
        cities.add("Frankfurt");

        int indexFfm = cities.indexOf("Frankfurt");

        System.out.println(indexFfm);

        cities.add("Hannover");

        System.out.println(cities);
    }
}
