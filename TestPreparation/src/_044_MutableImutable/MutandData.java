package _044_MutableImutable;

/**
 * User: salim
 * Date: 11.10.2020 09:43
 */
public class MutandData {
    public static void main(String[] args){
        int intValue = 42;
        int intValueMutated = mutateValue(intValue);
        int [] intArray = {42};
        int [] intArrayMutated = mutateArray(intArray);

        System.out.println("intValue " + intValue);
        System.out.println("intArray " + intArray[0]);

        System.out.println("intValueMutated " + intValueMutated);
        System.out.println("intArrayMutated " + intArrayMutated[0]);

        System.out.println("intValue " + intValue);
        System.out.println("intArray " + intArray[0]);



    }


    private static int mutateValue(int x) {
       x = 43;
       return x;
    }

    private static int[] mutateArray(int[] x) {
        x[0] = 43;
        return x;
    }


}
