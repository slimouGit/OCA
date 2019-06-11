package _016_protectedMembers.child;

import _016_protectedMembers.parent.Parent;

/**
 * User: salim
 * Date: 10.06.2019 14:59
 */
public class Child extends Parent {
    public void testIt(){
        System.out.println("x is " + x);
    }

    public void failedTest(){
        Parent p = new Parent();
       // System.out.println("x is " + p.x); //comiler Error
    }
}
