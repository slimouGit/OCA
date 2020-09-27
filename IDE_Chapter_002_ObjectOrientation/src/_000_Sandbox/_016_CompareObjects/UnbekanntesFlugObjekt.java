package _000_Sandbox._016_CompareObjects;

/**
 * User: salim
 * Date: 27.09.2020 15:58
 */
public class UnbekanntesFlugObjekt {

    public static void main(String[] args) {
        UnbekanntesFlugObjekt ufo1 = new UnbekanntesFlugObjekt();
        UnbekanntesFlugObjekt ufo2 = new UnbekanntesFlugObjekt();

        System.out.println("Equal " + ufo1.equals(ufo2));


        System.out.println("Instance of " + isIstanceOf(ufo1));
        System.out.println("Instance of " + isIstanceOf(ufo2));
    }

    private static boolean isIstanceOf(UnbekanntesFlugObjekt obj) {
        return obj instanceof UnbekanntesFlugObjekt;
    }
}
