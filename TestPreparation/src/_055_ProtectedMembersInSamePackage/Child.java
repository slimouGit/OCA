package _055_ProtectedMembersInSamePackage;

/**
 * User: salim
 * Date: 01.11.2020 16:23
 */
public class Child extends Parent {
    public static void main(String[] args){
        useParent();

        Child c1 = new Child();
        System.out.println(c1.protectedNumber);
    }

    private static void useParent() {
        System.out.println(new Child().protectedNumber);
        System.out.println(new Child().publicNumber);

        System.out.println(new Parent().protectedNumber);
        System.out.println(new Parent().publicNumber);
    }
}
