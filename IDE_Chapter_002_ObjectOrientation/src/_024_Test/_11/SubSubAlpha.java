package _024_Test._11;

public class SubSubAlpha extends Alpha {
    private SubSubAlpha(){
        s += "subsub ";
    }
    public static void main(String[] args){
        new SubSubAlpha();
        System.out.println(s);
    }

   // OUTPUT  alpha subsub
}
