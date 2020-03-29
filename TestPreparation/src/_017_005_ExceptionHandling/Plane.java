package _017_005_ExceptionHandling;

public class Plane {
    static String s = "-";
    public static void main(String[] args){
        new Plane().s1();                   //1.
        System.out.println(s);              //6.        -c
    }

    private void s1() {
        try {
            s2();                           //2.
        }catch (Exception e){               //Exception is catched here
            s += "c";                       //5.
        }
    }

    private void s2() throws Exception {    //Exception is thrown to s1
        s3();                               //3.
        s+= "2";
        s3();
        s+= "2b";
    }

    private void s3() throws Exception {    //Exception is thrown to s2
        throw  new Exception();             //4.
    }
}
