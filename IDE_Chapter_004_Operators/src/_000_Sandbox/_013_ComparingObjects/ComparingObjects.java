package _000_Sandbox._013_ComparingObjects;

/**
 * User: salim
 * Date: 03.10.2020 10:05
 */
public class ComparingObjects {
    public static void main(String[] args){

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();

        Apple apple3 = new Apple();
        Apple apple4 = apple3;

        System.out.print("Comparing 2 Objects: ");
        System.out.println(apple1 == apple2);

        System.out.print("Comparing 2 references Vas to 1 Object: ");
        System.out.println(apple3 == apple4);
    }
}
