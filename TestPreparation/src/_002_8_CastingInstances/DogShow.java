package _002_8_CastingInstances;

public class DogShow {
    public static void main(String[] args){
        new DogShow().go();
    }

    void go() {
        new Hound().bark();         // Hound.bark() howl
        ((Dog) new Hound()).bark(); // Hound.bark() howl
        //((Dog) new Hound()).sniff(); // not possible => Class Dog doesnt have a sniff method
    }
}
