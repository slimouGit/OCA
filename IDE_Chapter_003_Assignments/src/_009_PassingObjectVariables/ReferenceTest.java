package _009_PassingObjectVariables;

import java.awt.*;

public class ReferenceTest {
    public static void main(String[] args){
        Dimension d = new Dimension(42,42);
        ReferenceTest rf = new ReferenceTest();
        System.out.println("Before d.height " + d.height);
        rf.modify(d);
        System.out.println("After d.height " + d.height);
    }

    private void modify(Dimension d) {
        d.height = d.height + 1;
        System.out.println("Modified d.height " + d.height);
    }

    /**
     * OUTPUT
     * Before d.height 42
     * Modified d.height 43
     * After d.height 43
     */
}
