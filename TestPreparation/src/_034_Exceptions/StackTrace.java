package _034_Exceptions;

/**
 * User: salim
 * Date: 27.09.2020 15:45
 */
public class StackTrace {

    public static void main(String[] args){
        try {
            doSomething();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERROR-MESSAGE " + e.getMessage());
        }
    }

    private static void doSomething() throws Exception {
        throw new Exception("Something went wrong");
    }
}
