package _024_Test._12;

public class House extends Building {
    House(){
        System.out.println("h ");
    }
    House(String name){
        this();
        System.out.println("hn " + name);
    }
    public static void main(String[] args){
        new House("x ");
    }

    //OUTPUT: b h hn x
    //constructors call their superclass constructors,
    // which executes first, and that constructor can be overloaded
}
