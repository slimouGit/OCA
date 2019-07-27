package _020_Static;

public class FrogCounter {
    static int frogCount = 0;

    //CONSTRUCTOR
    public FrogCounter(){
        frogCount += 1;
    }

    void increaseFrogs(){
        frogCount += 1;
    }

    public static void main(String[] args){
        System.out.println("Amount of frogs: " + frogCount);
        new FrogCounter();
        new FrogCounter();
        new FrogCounter();
        System.out.println("Amount of frogs: " + frogCount);

        //experiment by using a seperate method to increase frogs
        //instance of class is to be created (+ Frog)
        //method is called (+ Frog)
        new FrogCounter().increaseFrogs();
        System.out.println("Amount of frogs: " + frogCount);

        new FrogCounter().increaseFrogs();
        System.out.println("Amount of frogs: " + frogCount);
    }
}
