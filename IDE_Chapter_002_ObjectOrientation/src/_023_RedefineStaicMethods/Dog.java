package _023_RedefineStaicMethods;

public class Dog extends Animal {

    //REDEFINE DO STOFF METHOD -> NO OVERRIDDING!!!
    static void doStuff(){
        System.out.println("dog");
    }

    public static void main(String[] args){
        Animal[] a = {new Animal(), new Dog(), new Animal()};

        for (int x = 0; x < a.length; x++){
            a[x].doStuff(); // -> all animals but no dogs
        }

        Dog.doStuff();
        Animal.doStuff();
    }
}
