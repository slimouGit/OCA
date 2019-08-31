package _024_Test._08;

public class DogShow {
    public static void main(String[] args){
        new DogShow().go();
    }

    private void go() {
        new Hound().bark();

        ((Dog) new Dog()).bark(); //NOT NECCESSARY TO CAST
        ((Dog) new Hound()).bark(); //POSSIBLE CAUSE DOG HAS BARKI METHOD TOO => OVERRIDED
        //((Hount) new Dog()).bark(); //DOWNCASTING NOT POSSIBLE

//        ((Dog) new Hound()).sniff(); CLASS DOG HAS NO SNIFF METHOD

        new Hound().piss(); //POSSIBLE; HOUNT EXTENDS DOG
    }
}
