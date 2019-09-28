package _000_Sandbox._002_ArraysInitialition;

public class ArrayInitialisation {
    static int [] year = new int[27];

    public static void main(String[] args){
        for(int i =0;i<27;i++){
            System.out.println("year[" + i + "] = " + year[i]);
        }
    }
    /**
     * OUTPUT
     * year[0] = 0
     * year[1] = 0
     * year[2] = 0
     * year[3] = 0
     * year[4] = 0
     * year[5] = 0
     * year[6] = 0
     * ...
     */
}
