package _036_Interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * User: salim
 * Date: 07.10.2020 19:22
 */
public class Main implements I1 {
    @Override
    public void display() {
        System.out.println("final a " + a);
        System.out.println("static b " + b);
        System.out.println("default c " + c);
    }

    public static void main(String[] args){

        List<String> list = new ArrayList<>(2);
        System.out.println("list size " + list.size());
        list.add(0, "terer");
        list.add(1, "terer");
        System.out.println("list size " + list.size());
        Main m = new Main();
        m.display();

        System.out.println(m.a);

        m.displayDefault();
    }
}
