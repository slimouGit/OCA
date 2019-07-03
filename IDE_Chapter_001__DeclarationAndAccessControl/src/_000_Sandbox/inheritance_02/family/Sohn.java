package _000_Sandbox.inheritance_02.family;


public class Sohn extends Vater {


    public static void main(String[] args) {
        Vater vater = new Vater();
        System.out.println(vater.publicSwimming());
        System.out.println(vater.protectedSwimming());
        System.out.println(vater.publicName);
        System.out.println(vater.protectedName);
    }
}
