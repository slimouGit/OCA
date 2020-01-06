package _007_ArrayInitialization;

public class ArrayInitialize {
    public static void main(String[] args){
        int[] testScore = new int[5];
        printArray(testScore);
        testScore[2] = 42;
        printArray(testScore);
    }

    private static void printArray(int[] array) {
        System.out.println("array values:");
        for(int item:array){
            System.out.println(item);
        }
        System.out.println("----------------------");
    }
}
