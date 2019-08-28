package _024_Test._06;

public class Chrome {
    public static void main(String[] args){
        X x1 = new X();
        X x2 = new Y();
        Y y1 = new Y();

        x1.do1();
        x2.do1();

        y1.do1();
        y1.do2();

        //Casting x2 to be of type y
        ((Y)x2).do2();

    }
}
