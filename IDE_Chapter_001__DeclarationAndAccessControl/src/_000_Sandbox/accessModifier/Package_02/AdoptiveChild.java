package _000_Sandbox.accessModifier.Package_02;

import _000_Sandbox.accessModifier.Package_01.Parent;

public class AdoptiveChild extends Parent {

    public static void main(String[] args){
        new AdoptiveChild().callMyName_public("adobtive Herbert");
        new AdoptiveChild().callMyName_protected("adobtive Herbert");

        /**
         * NO ACCESS TO DEFAULT OR PRIVATE MODIFIER IN DIFFERENT PACKAGE!!!
         *
         * new AdoptiveChild().callMyName_default("adobtive Herbert");
         *
         * new AdoptiveChild().callMyName_private("adobtive Herbert");
         */


    }
}
