package _000_Sandbox._005_ArraylistMethods;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {

        List<Integer> myInts = new ArrayList<>();
        myInts.add(new Integer("1"));
        myInts.add(2);
        myInts.add(new Integer(3));
        System.out.println(myInts.indexOf(2));

        System.out.println(myInts.get(0));

        List<Long> longs = new ArrayList<>();
        longs.add(new Long(1));
        longs.add(2L);
        longs.add(new Long("3"));
        longs.add(4L);
        longs.remove(2);
        for (Long item : longs) {
            System.out.println(item);


            ArrayList<String> sa = new ArrayList<>();
            sa.add("a");
            sa.add("2");
            sa.add("3");
            String sb[] = new String[3];
            for (int x = 1; x < sa.size(); x++)
                sb[x] = sa.get(x);
            for (String s : sb)
                System.out.print(s + " ");


        }
    }
}
