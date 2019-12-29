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
        System.out.println("Exception was catched");
        }
        executeAfterException();

    }

    private static void doMoreStuff()   {
        doStuffWithException();
    }

    private static void doStuffWithException()  {
        int x = 5/0;

    }

    private static void executeAfterException() {
        System.out.println("Exception happens");
    }
}
