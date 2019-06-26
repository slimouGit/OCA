package _024_Test._09;

public class Frodo extends Hobbit {

    public static void main(String[] args){
        int myGold = 7;

        /**
            NOT POSSIBLE FROM STATIC CONTEXT
            System.out.println(countGold(myGold, 6));
         */

        Hobbit hobbit = new Hobbit();
        System.out.println(hobbit.countGold(myGold, 6));

    }


    int giveMeMyGold(){
        return countGold(3,2);
    }
}
