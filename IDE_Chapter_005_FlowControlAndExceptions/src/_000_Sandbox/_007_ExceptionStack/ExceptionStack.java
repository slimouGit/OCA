package _000_Sandbox._007_ExceptionStack;

public class ExceptionStack {
    public static void main(String[] args){
        doStff();
    }

    private static void doStff() {
        try {
            doMoreStuff();
        }catch(Exception e) {
        e.printStackTrace();
        }
        executeAfterException();

    }

    private static void doMoreStuff() throws Exception  {
        doStuffWithException();
    }

    private static void doStuffWithException() throws Exception {
        int x = 5/0;

    }

    private static void executeAfterException() {
        System.out.println("Exception happens");
    }
}
