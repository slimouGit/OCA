package _010_PolymorphismOverloadedAndOverridden;

public class Main {
    public static void main(String[] args){
        Animal a = new Animal();
        a.eat();

        //reference Animal = new horse object
        Animal ah = new Horse();
        ah.eat();

        Horse h = new Horse();
        h.eat();
        h.eat("Marianne");
    }
}
