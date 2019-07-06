package _000_Sandbox.inheritance_03;


public class Frodo extends Hobbit {
    public static void main(String[] args) {
        int myGold = 40;
        /**
         * NOT POSSIBLE CANNOT BE INVOKE FROM STATIC CONTEXT

         System.out.println(countGold(myGold, 2));


         */


        //get access without inheritance
        Hobbit hobbit = new Hobbit();
        System.out.println("Hobbit: " + hobbit.countGold(myGold, hobbit.hobbitGold));


        System.out.println("Frodo: " + new Frodo().hobbitGold());
    }

    int hobbitGold() {
        //get access via inheritance
        return countGold(40, hobbitGold);
    }
}
