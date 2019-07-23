package _000_Sandbox._004_Polymorphism_Animals.interfaces;

import _000_Sandbox._004_Polymorphism_Animals.Animal;

public interface Huntable {
    default void huntingAnimal(Animal animal){
        System.out.println("possible to hunt this " + animal.getSpecies());
    }
}
