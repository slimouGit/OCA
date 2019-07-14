package _000_Sandbox.Polymorphism_Animals;

public class Animal {
    String species;

    public Animal(String species){
        this.species = species;
    }

    String eating(String food, int weight){
        return this.species +  " eats " + weight + " kg of " + food + " a day";
    }

    void sleeping(){
        System.out.println(this.species + " is sleeping");
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
