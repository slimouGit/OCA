package _050_CastingOrder;

/**
 * User: salim
 * Date: 01.11.2020 09:12
 */
public class Test {
    public static void main(String[] args){
        Super super1 = new Super();
        Super super2 = new Sub();
        Sub sub1 = new Sub();
        Sub sub2 = (Sub)new Super();

        super1.doIt();
        super2.doIt();
        sub1.doIt();
        ((Super)sub1).doIt();
        ((Sub)super2).doIt();
        ((Sub)super1).doIt();
    }
}
