package _024_Test._10;

public class Tenor extends Singer {
    public static String sing(){
        return "Tenor";
    }

    public static void main(String[] args){
        Tenor t  = new Tenor();
        Singer s = new Tenor();

        System.out.println(t.sing() + " " + s.sing());
    }

    //OUTPUT: Tenor Singer
}
