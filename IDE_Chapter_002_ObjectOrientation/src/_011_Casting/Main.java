package _011_Casting;

public class Main {
    public static void main(String[] args){
        Animal [] a = {new Animal(), new Dog(), new Animal()};

        for (Animal animal : a){
            //OK! EACH OBJECT IS AN ANIMAL, BUT DOG IS AN SPECIAL ANIMAL (he is barking)
            animal.makeNoise();
        }

        for (Animal animal : a){
            if(animal instanceof Dog){

                //DOWNCASTIN TO MORE SPECIFIC OBJECT

                //CAST LIKE THIS
                ((Dog) animal).playDead();
                //CAST LIKE THIS
                Dog d = (Dog) animal;
                d.playDead();


                //CAST LIKE THIS
                ((Dog) animal).makeNoise();
                //CAST LIKE THIS
                Dog d2 = (Dog) animal;
                d2.makeNoise();
            }
        }
    }
}
