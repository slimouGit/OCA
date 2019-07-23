package _008_OverloadingMethods;

public class TestAdder {
    public static void main(String[] args){
        Adder a = new Adder();
        int b = 27;
        int c = 15;
        int intResult = a.addThem(b,c);
        double doubleResult = a.addThem(27.0,3.0);

        System.out.println(intResult);
        System.out.println(doubleResult);

    }


}
