package _000_Sandbox._001_NumericAssignments;

public class NumericAssignments {
    public static void main(String[] args){
        int x = 0x0001;
        System.out.println("0x0001 \t\t" + x); //1

        int y = 0x7fffffff;
        System.out.println("0x7fffffff \t" + y); //2147483647

        int z = 0xDeadCafe;
        System.out.println("0xDeadCafe \t" + z); //-559035650

        int w = 0xCafe;
        System.out.println("0xCafe \t\t" + w); //51966
    }
}
