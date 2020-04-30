package _004_5_OperationsForGivenResult;

public class Incr {
    public static void main(String[] args){
        Integer x = 7;
        Integer y = 2;

        //Target is 33

        x*=x;
        System.out.println(x);      //49
        y*=y;
        System.out.println(y);      //4
        y*=y;
        System.out.println(y);      //16
        x-=y;
        System.out.println(x);      //33
    }
}
