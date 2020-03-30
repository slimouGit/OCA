package _001_007_InvokeFromStaticContext;

public class Frodo extends Hobbit {
    public static void main(String[] args){
        int myGold = 7;
        /**
         * Not possible to invoke non static method from static context

        System.out.println(countGold(myGold, 6));

         */
        System.out.println(new Frodo().countGold(myGold, 6));
    }
}
