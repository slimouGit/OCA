package _002_001_SuperConstructor;

public class Bottom2 extends Top {
    public Bottom2(String s) {
        super(s); //THE SUPER CONSTRUCTOR IS NEEDED
        System.out.print("D");
    }

    public static void main(String[] args){
        new Bottom2("C");
        System.out.println(" ");
    }

}
