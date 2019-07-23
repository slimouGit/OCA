package _009_OverriddenMethods_withObjects;

public class TestAnimals {

    public void doStuff(Animal a){
        System.out.println("I am an Animal");
    }

    public void doStuff(Horse h){
        System.out.println("I am a Horse");
    }

    public static void main(String[] args){
        TestAnimals ta = new TestAnimals();
        Animal animal = new Animal("Franz");
        Horse horse = new Horse("Peter");

        /**
        IT IS A HORSE BUT COMPILER SAYS ITS AN ANIMAL!!!
        Animal mutant = new Horse("Sibylle");
         */

        ta.doStuff(animal);
        ta.doStuff(horse);
    }
}
