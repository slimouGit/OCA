package _000_Sandbox._004_InstanceOfFamily;

public class FamilyTester {
    public static void main(String[] args) {
        Mom mom = new Mom();
        Son son = new Son();

        testRelationship(mom);
        testRelationship(son);

    }

    private static void testRelationship(Object obj1) {
        if (obj1 instanceof Mom) {
            if (obj1 instanceof Son) {
                System.out.println(obj1.getClass() + " is instance of Son");
            } else {
                System.out.println(obj1.getClass() + " is NOT instance of Son");
            }
        }
        if (obj1 instanceof Son) {
            if (obj1 instanceof Son) {
                System.out.println(obj1.getClass() + " is instance of Mom");
            } else {
                System.out.println(obj1.getClass() + " is NOT instance of Mom");
            }
        }
    }
    /**
     * OUTPUT
     * class _000_Sandbox._004_InstanceOfFamily.Mom is NOT instance of Son
     * class _000_Sandbox._004_InstanceOfFamily.Son is instance of Son
     * class _000_Sandbox._004_InstanceOfFamily.Son is instance of Mom
     */
}
