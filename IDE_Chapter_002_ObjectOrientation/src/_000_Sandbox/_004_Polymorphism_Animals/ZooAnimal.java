package _000_Sandbox._004_Polymorphism_Animals;

import _000_Sandbox._004_Polymorphism_Animals.interfaces.Caressable;

public class ZooAnimal extends Animal implements Caressable {
    public ZooAnimal(String species) {
        super(species);
    }

}
