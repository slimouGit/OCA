package _008_multidimensionalArray;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int[][] myArray = new int[3][];

        myArray[0] = new int[3];
        myArray[0][0] = 1;
        myArray[0][1] = 2;
        myArray[0][2] = 3;
        myArray[1] = new int[3];
        myArray[1][0] = 42;
        myArray[1][1] = 5;
        myArray[1][2] = 6;
        myArray[2] = new int[3];
        myArray[2][0] = 7;
        myArray[2][1] = 8;
        myArray[2][2] = 9;

//        System.out.println(myArray[1][0]);


        printMyArray(myArray);
    }

    private static void printMyArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println("arr["+i+"]["+j+"]" + arr[i][j]);
            }
        }
    }
}
