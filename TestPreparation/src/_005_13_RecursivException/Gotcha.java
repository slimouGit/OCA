package _005_13_RecursivException;

public class Gotcha {
    public static void main(String[] args){
        new Gotcha().go();
        try{
            new Gotcha().go();
        }catch(Error e){
            System.out.println("ouch");
        }
        try{
            new Gotcha().go();
        }catch(Exception e){
            System.out.println("ouch");
        }
    }
    void go(){
        go();   //badly designed recursive method
    }
}
