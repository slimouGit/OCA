package _000_Sandbox._008_CastingTest;

public class Main {
    public static void main(String[] args){
        Animal a = new Dog();
        Dog d = (Dog) a;
        d.makeNoise();

        a.makeNoise();

        Animal b = new Dog();
        ((Dog) b).makeNoise();


        /**
         DOWNCASTING IS NOT POSSIBLE
         Animal c = new Animal();
         Dog cd = (Dog) c;
         cd.makeNoise();
         */

        // UPCASTIN IS POSSIBLE
        Dog e = new Dog();
        Animal f = (Animal) e; //CASTING IS NOT REQUIRED
        f.makeNoise();

        //UPCASTING WITHOUT AN EXPLICIT CAST IS POSSIBLE
        Animal g = e;
        e.makeNoise();


    }
}
