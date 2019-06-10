package _017_localVariablesAndAccessModifiers;

/**
 * User: salim
 * Date: 10.06.2019 15:25
 */
public class Foo {
    public static void main(String[] args) {
        doStuff();
    }

    static void doStuff() {
        final int x = 7;
        /**
            FAILED MODFIER!!!
            private int y = 8;
         *
         */
    }
}
