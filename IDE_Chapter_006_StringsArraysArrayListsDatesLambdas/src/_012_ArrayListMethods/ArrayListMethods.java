package _012_ArrayListMethods;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args){
        List<String> myList = new ArrayList<>();

        myList.add("Z");
        myList.add("X");
        myList.add(1, "Y");
        myList.add(0, "W");
        System.out.println(myList); //[W, Z, Y, X]

        myList.clear();
        myList.add("a");
        myList.add("b");
        myList.add("c");
        System.out.println(myList); //[a,b,c]

        System.out.println(myList.contains("a"));

        System.out.println(myList.get(1));
        System.out.println(myList.indexOf("a"));

        System.out.println(myList);//[a, b, c]
        myList.remove(1);
        System.out.println(myList);//[a, c]



    }
}
