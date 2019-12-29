package _007_OwnException;

public class MyClass {
    public static void main(String[] args){
        try {
            new MyClass().doStuff();
        } catch (MyException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    private void doStuff() throws MyException {
        throw new MyException("Meine Exception wurde geworfen");
    }
}
