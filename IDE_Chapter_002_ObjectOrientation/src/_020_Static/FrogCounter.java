package _020_Static;

public class FrogCounter {
    static int frogCount = 0;

    int nonStaticFrogCounter = 0;

    //CONSTRUCTOR
    public FrogCounter(){
        frogCount += 1;
    }

    void increaseFrogs(){
        frogCount += 1;
    }

    int increaseNonStaticFrogCounter(){
       return nonStaticFrogCounter +=1;
    }

    public static void main(String[] args){
        System.out.println("Amount of frogs: " + frogCount);
        new FrogCounter();
        new FrogCounter();
        new FrogCounter();
        System.out.println("Amount of frogs: " + frogCount);
        System.out.println("Amount of frogs: " + frogCount);

        //experiment by using a seperate method to increase frogs
        //instance of class is to be created (+ Frog)
        //method is called (+ Frog)
        new FrogCounter().increaseFrogs();
        System.out.println("Amount of frogs: " + frogCount); // 2 more frogs

        //test non static frog counter
        System.out.println("Amount of non static frogs: " + new FrogCounter().increaseNonStaticFrogCounter()); //frogcount wont increase, each call creates a new instance
        System.out.println("Amount of non static frogs: " + new FrogCounter().increaseNonStaticFrogCounter());
        System.out.println("Amount of non static frogs: " + new FrogCounter().increaseNonStaticFrogCounter());


    }
}
