package _004_3_ShortCircuit;

public class Fork {
    public static void main(String[] args){
        if(args.length == 1 | args[1].equals("test")){
            System.out.println("test case");
        }else{
            System.out.println("production " + args[0]);
        }
    }
}

/**
 * run with: java Fork live2
 * An exception is thrown at runtime
 *
 * Because the short-circuit(||) is not used, both operands are evaluated.
 * args[1] throw an ArrayIndexOutOfVBoundsException
 */
