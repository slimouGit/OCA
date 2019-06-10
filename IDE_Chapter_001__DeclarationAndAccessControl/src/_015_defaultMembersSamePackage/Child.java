package _015_defaultMembersSamePackage;

/**
 * User: salim
 * Date: 10.06.2019 14:59
 */
public class Child extends Parent {
    public void testIt(){
        System.out.println("x is " + x);
    }
    
    public void nonFailedTest(){
        Parent p = new Parent();
        System.out.println("x is " + p.x); //comiler Error
    }
}
