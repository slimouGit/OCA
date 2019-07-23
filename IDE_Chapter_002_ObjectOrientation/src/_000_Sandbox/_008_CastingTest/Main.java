package _000_Sandbox._008_CastingTest;

public class Main {
    public static void main(String[] args){
        Animal a = new Dog();
        Dog d = (Dog) a;
        d.makeNoise();

        a.makeNoise();

        Animal b = new Dog();
        ((Dog) b).makeNoise();


    }
}
