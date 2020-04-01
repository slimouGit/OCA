package _002_10_ClassReferences;

public class Tenor extends Singer {
    public static String sing(){
     return "fa";
    };

    public String singNotStatic(){
        return "fa";
    };

    public static void main(String[] args){
        Tenor t = new Tenor();
        Singer s = new Tenor();
        System.out.println(t.sing() + " " + s.sing()); //fa la => polymorphism doesnt apply to static methods

        System.out.println(t.singNotStatic() + " " + s.singNotStatic()); //fa fa
    }
}
