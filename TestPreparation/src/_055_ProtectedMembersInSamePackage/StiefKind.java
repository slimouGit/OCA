package _055_ProtectedMembersInSamePackage;

import _055_ProtectedMembersInSamePackage.StiefMutter.StiefMutter;

/**
 * User: salim
 * Date: 01.11.2020 16:32
 */
public class StiefKind extends StiefMutter {
    public static void main(String[] args){
        useParent();

        StiefKind s1 = new StiefKind();
        System.out.println(s1.protectedNumber);
    }

    private static void useParent() {
        System.out.println(new StiefKind().protectedNumber);
        System.out.println(new StiefKind().publicNumber);

        System.out.println(new StiefKind().protectedNumber);
        System.out.println(new StiefKind().publicNumber);
    }
}
