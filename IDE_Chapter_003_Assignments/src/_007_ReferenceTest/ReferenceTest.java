package _007_ReferenceTest;

import java.awt.*;

public class ReferenceTest {
    public static void main(String[] args){
        Dimension a1 = new Dimension(5,10);
        System.out.println("a1.height: " + a1.height);
        Dimension b1 = a1;
        System.out.println("b1.height: " + b1.height);
        b1.height = 42;
        System.out.println("a1.height "+ a1.height + " after changed to b1");
        a1.height = 3;
        System.out.println("b1.height: " + b1.height);
    }
    /**
     * OUTPUT
     * a1.height: 10
     * b1.height: 10
     * a1.height 42 after changed to b1
     * b1.height: 3
     */
}
