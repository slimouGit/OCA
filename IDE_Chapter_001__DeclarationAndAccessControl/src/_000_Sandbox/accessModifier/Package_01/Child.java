package _000_Sandbox.accessModifier.Package_01;

public class Child extends Parent {
    public static void main(String[] args){
        new Child().callMyName_public("Franz");
        new Child().callMyName_protected("Franz");
        new Child().callMyName_default("Franz");

        /**
         * NO ACCESS TO PRIVATE MODIFIER IN DIFFERENT PACKAGE!!!
         *
         * new Child().callMyName_private("Franz");
         */
    }
}
