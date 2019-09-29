package _010_PassingPrimitiveVariables;

public class ReferenceTest {
    public static void main(String[] args){
        int a = 42;
        ReferenceTest rf = new ReferenceTest();
        System.out.println("Before modify " + a);
        rf.modify(a);
        System.out.println("After modify " + a);
    }

    private void modify(int a) {
        a = a +1;
        System.out.println("Modified " + a);
    }

    /**
     * OUTPUT
     * Before modify 42
     * Modified 43
     * After modify 42
     */
}
