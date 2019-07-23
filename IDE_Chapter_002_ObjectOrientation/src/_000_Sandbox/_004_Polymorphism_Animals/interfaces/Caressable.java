package _000_Sandbox._004_Polymorphism_Animals.interfaces;

import _000_Sandbox._004_Polymorphism_Animals.Animal;

public interface Caressable {
    default void caressingAnimal(Animal animal){
        System.out.println("possible to caress this " + animal.getSpecies());
    }
}
