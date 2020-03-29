package _025_ArrayInserts;

import java.util.ArrayList;

public class Sequence {
    public static void main(String[] args){
        ArrayList<String> myList = new ArrayList<>();
        myList.add("apple");
        myList.add("carrot");
        myList.add("banana");
        myList.add(1,"plum");
        System.out.print(myList); //[apple, plum, carrot, banana]
    }
}
