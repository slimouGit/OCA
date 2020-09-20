package _000_Sandbox.ProtectedMembers.child;

import _000_Sandbox.ProtectedMembers.parent.Parent;

/**
 * User: salim
 * Date: 20.09.2020 18:33
 */
public class child extends Parent {
    public void testInheritance(){
        System.out.println("x " + x );
    }

    public void testInstance(){
        Parent parent = new Parent();
        //Protected member is not visible in new Instance
        //System.out.println("Parent x " + parent.x );
    }
}
