package _010_ArrayFalse;

public class ArrayFalse {
    public static void main(String[] args){
        int[][] books = new int[3][];
        int []numbers = new int[6];

        int aNumber = 42;

        /**
         * NOT OK => expecting an int array, not an int
        books[0] = aNumber;
         */

        books[0] = numbers;

    }
}
