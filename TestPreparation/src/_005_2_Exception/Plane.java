package _005_2_Exception;

public class Plane {
    static String s = "-";
    public static void main(String[] args){
        new Plane().s1();                   //1
        System.out.println(s);              //6 => -c
    }

    private void s1() {
        try{
            s2();                           //2
        }catch(Exception e){
            s += "c";                       //5
        }
    }

    private void s2() throws Exception {
        s3();                               //3
        s += "2";
        s3();
        s += "2b";
    }

    private void s3() throws Exception {
        throw new Exception();                 //4
    }
}
