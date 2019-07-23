package _012_UpCasting;

public class Main {
    public static void main(String[] args) {

        Dog d = new Dog();
        Animal a1 = d;
        Animal a2 = (Animal) d;

        a1.makeNoise();

        a2.makeNoise();
    }
}
