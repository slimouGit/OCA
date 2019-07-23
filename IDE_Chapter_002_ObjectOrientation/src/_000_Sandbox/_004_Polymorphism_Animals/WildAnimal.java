package _000_Sandbox._004_Polymorphism_Animals;

import _000_Sandbox._004_Polymorphism_Animals.interfaces.Huntable;

public class WildAnimal extends Animal implements Huntable {
    public WildAnimal(String species) {
        super(species);
    }
}
