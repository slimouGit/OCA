package _001_002_ConstructorOverloading;

public class SubSubAlpha extends Alpha {
    private SubSubAlpha(){
        s += "subsub";
    }

    public static void main(String[] args){
        new SubSubAlpha();
        System.out.println(s);
    }
}
