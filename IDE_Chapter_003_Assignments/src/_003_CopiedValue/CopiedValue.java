package _003_CopiedValue;

public class CopiedValue {
    public static void main(String[] args){
        int a = 10;
        int b = a;
        System.out.println("a: " + a + " b: "+ b);
        a = 42;
        System.out.println("a: " + a + " b: "+ b);
    }
}
