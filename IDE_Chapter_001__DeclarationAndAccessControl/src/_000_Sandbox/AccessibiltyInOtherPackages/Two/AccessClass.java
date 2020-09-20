package _000_Sandbox.AccessibiltyInOtherPackages.Two;

import _000_Sandbox.AccessibiltyInOtherPackages.One.OtherClass;

/**
 * User: salim
 * Date: 20.09.2020 18:04
 */
public class AccessClass {
    public static void main(String[] args){
        OtherClass o = new OtherClass();
        o.testItPublic();

        System.out.println(o.c);
    }
}
