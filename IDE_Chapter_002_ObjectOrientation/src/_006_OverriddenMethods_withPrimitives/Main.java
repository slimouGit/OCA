package _006_OverriddenMethods_withPrimitives;

public class Main {
    public static void main(String[] args){
        Animal a = new Animal();
        Animal h = new Horse();
        a.eat();

        h.eat();
        h.animalisticBehaviour();

        /**
            h.buck();
            NOT POSSIBLE
         *
         */

        Horse h2 = new Horse();
        h2.buck();

        if(a instanceof Horse){
            System.out.println("a instanceof Horse");
        }
        if(h instanceof Animal){
            System.out.println("h instanceof Animal");
        }
    }
}
