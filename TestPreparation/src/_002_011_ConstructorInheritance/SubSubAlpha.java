package _002_011_ConstructorInheritance;

public class SubSubAlpha extends Alpha {
    private SubSubAlpha(){
        s += "subsub";
    }

    public static void main(String[] args){
        new SubSubAlpha();
        System.out.print(s);
    }
}
