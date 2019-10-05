package _000_Sandbox._004_InstanceOfFamily;

public class FamilyTester {
    public static void main(String[] args) {
        Mom mom = new Mom();
        Son son = new Son();

        testRelationship(mom);
        testRelationship(son);

    }

    private static void testRelationship(Object obj) {
        if (obj instanceof Mom) {
            if (obj instanceof Son) {
                System.out.println(obj.getClass() + " is instance of Son");
            } else {
                System.out.println(obj.getClass() + " is NOT instance of Son");
            }
        }
        if (obj instanceof Son) {
            if (obj instanceof Son) {
                System.out.println(obj.getClass() + " is instance of Mom");
            } else {
                System.out.println(obj.getClass() + " is NOT instance of Mom");
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
