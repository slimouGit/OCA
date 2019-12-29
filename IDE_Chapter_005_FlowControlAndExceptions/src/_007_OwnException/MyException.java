package _007_OwnException;

public class MyException extends Exception {
    public MyException(){
    }
    public MyException(String message){
        super(message);
    }
}
