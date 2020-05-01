package _006_5_ArrayListInsertStatements;

import java.util.ArrayList;

public class Sequence {
    public static void main(String[] args){
        ArrayList<String> myList = new ArrayList<>();
        myList.add("apple");
        myList.add("carrot");
        myList.add("banana");
        System.out.println(myList);             //[apple, carrot, banana]
        myList.add(1,"plum");
        System.out.println(myList);             //[apple, plum, carrot, banana]
    }
}
