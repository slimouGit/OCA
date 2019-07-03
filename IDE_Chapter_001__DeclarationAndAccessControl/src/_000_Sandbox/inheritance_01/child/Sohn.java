package _000_Sandbox.inheritance_01.child;


import _000_Sandbox.inheritance_01.parent.Vater;

public class Sohn extends Vater {


    public static void main(String[] args) {
        Vater vater = new Vater();
        System.out.println(vater.publicSwimming());
        System.out.println(vater.publicName);

        /**
         * PRTECTED MEMBERS FROM DIFFERENT PACKAGE ARE NOT VISIBLE
        System.out.println(vater.protectedSwimming());
        System.out.println(vater.protectedName);
         */

        System.out.println(vater.getDefaultName() + " über Getter");
    }
}
