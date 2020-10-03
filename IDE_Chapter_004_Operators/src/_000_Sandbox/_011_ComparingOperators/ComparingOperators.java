package _000_Sandbox._011_ComparingOperators;

/**
 * User: salim
 * Date: 03.10.2020 09:44
 */
public class ComparingOperators {
    public static void main(String[] args){
        System.out.print("1<2 && 1<3: ");
        System.out.println(1<2 && 1<3);

        System.out.print("1<2 && 1>3: ");
        System.out.println(1<2 && 1>3);

        System.out.print("1<2 || 1<3: ");
        System.out.println(1<2 || 1<3);

        System.out.print("1<2 || 1>3: ");
        System.out.println(1<2 || 1>3);

        System.out.print("1>2 | 1<3: ");
        System.out.println(1>2 | 1<3);
    }
}
