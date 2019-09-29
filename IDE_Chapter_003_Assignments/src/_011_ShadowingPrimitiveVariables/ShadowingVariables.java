package _011_ShadowingPrimitiveVariables;

public class ShadowingVariables {
    static int a = 42;
    public static void main(String[] args){
        ShadowingVariables sv = new ShadowingVariables();
        System.out.println("Unshadowed variable " + a);
        changeIt(a);
        System.out.println("Variable after shadowing " + a);
    }

    private static void changeIt(int a) {
        a = a + 200;
        System.out.println("Shadowed variable " + a);
    }

    /**
     * OUTPUT
     * Unshadowed variable 42
     * Shadowed variable 242
     * Variable after shadowing 42
     *
     * because changeIt() has a parameter named size, the local size variable is modified while the static
     * size variable is untouched.
     */
}
