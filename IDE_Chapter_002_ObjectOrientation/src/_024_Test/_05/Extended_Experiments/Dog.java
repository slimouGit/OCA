package _024_Test._05.Extended_Experiments;

/**
 * User: salim
 * Date: 24.08.2019 18:33
 */
public class Dog extends Animal {
    static {System.out.println("static dog");}
    {System.out.println("init dog");}

    public static void main(String[] args){
        /**
         * static animal
         * static dog
         * init animal
         */
        new Animal();

        /**
         * init animal
         */
        new Animal();

        /**
         * init animal
         * init dog
         */
        new Dog();
    }
}
