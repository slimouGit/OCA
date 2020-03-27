package _000_Sandbox._006_OCA_ProgrammerTests;

import java.util.ArrayList;
import java.util.List;

public class Basics {
    String name;
    Basics(String n){
        name = n;
    }
    public static void main(String[] args){
        List<Basics> x = new ArrayList<>();
        x.add(new Basics("lisa"));
        x.add(new Basics("john"));
        if(x.contains("john")) //Cant use contains here
            x.add(new Basics("helen"));
        System.out.println(x);
        System.out.println(x.size());

    }

}
