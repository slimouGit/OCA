package _000_Sandbox._003_ReferenceTests;

import java.awt.*;

public class ReferenceTest {
    int primitiveReference = 0;
    Dimension objectReference = new Dimension(0,0);

    public static void main(String[] args){
        ReferenceTest rt = new ReferenceTest();
        System.out.println("primitiveReference before change " + rt.primitiveReference);
        changePremitive(rt.primitiveReference);
        System.out.println("primitiveReference after change " + rt.primitiveReference);
        System.out.println("");
        System.out.println("objectReference before change " + rt.objectReference.width + " " + rt.objectReference.height);
        changeObject(rt.objectReference);
        System.out.println("objectReference after change " + rt.objectReference.width + " " + rt.objectReference.height);
    }

    private static void changePremitive(int primitiveReference) {
        primitiveReference = primitiveReference+42;
        System.out.println("changed priitiveReference " + primitiveReference);
    }

    private static void changeObject(Dimension objectReference) {
        objectReference.width = objectReference.width+42;
        objectReference.height = objectReference.height+42;
        System.out.println("changed objectReference " + objectReference.width + " " + objectReference.height);
    }

    /**
     * OUTPUT
     *
     * primitiveReference before change 0
     * changed priitiveReference 42
     * primitiveReference after change 0
     *
     * objectReference before change 0 0
     * changed objectReference 42 42
     * objectReference after change 42 42
     */

}
