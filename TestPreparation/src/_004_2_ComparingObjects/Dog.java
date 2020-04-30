package _004_2_ComparingObjects;

public class Dog {
    String name;

    Dog(String s) {
        name = s;
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("Boi");
        Dog d2 = new Dog("Tyri");

        System.out.println((d1==d2));       //false

        Dog d3 = new Dog("Boi");

        d2 = d1;

        System.out.println((d1==d2));       //true
        System.out.println((d1==d3));       //false

        //The == operator tests for reference variable equality, not object equality

    }
}
