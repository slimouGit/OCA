package _033_006_IntegerArrayList;

import java.util.ArrayList;
import java.util.List;

public class Jackets {
    public static void main(String[] args){
        List<Integer> myList = new ArrayList<>();
        myList.add(new Integer(42));
        myList.add(42);
//        myList.add("42");
        System.out.println(myList);
    }
}
