package _012_UpCasting;

public class Main {
    public static void main(String[] args) {

        Dog d = new Dog();
        Animal a1 = d;
        Animal a2 = (Animal) d;

        Animal a3 = new Animal();

        a1.makeNoise();

        a2.makeNoise();

        a3.makeNoise();
    }
}
