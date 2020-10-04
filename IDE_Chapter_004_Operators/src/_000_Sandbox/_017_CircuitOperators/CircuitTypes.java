package _000_Sandbox._017_CircuitOperators;

/**
 * User: salim
 * Date: 03.10.2020 11:13
 */
public class CircuitTypes {

    public static void main(String[] args){
        int[] testArray = new int[1];

        if(testArray.length == 1){
            System.out.println("testArray.length == 1");
        }

        if(testArray.length == 1 || testArray[2] == 42){
            System.out.println("no index out of bounds exception with short-circuit operator");
        }

        if(testArray.length == 1 | testArray[2] == 42){
            System.out.println("FAIL!!!");
        }
    }
}
