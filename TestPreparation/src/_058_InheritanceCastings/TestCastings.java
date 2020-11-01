package _058_InheritanceCastings;

/**
 * User: salim
 * Date: 01.11.2020 17:45
 */
public class TestCastings {
    public static void main(String[] args){
        Super super1 = new Super();
        Sub sub1 = new Sub();

        super1.doSuperStuff();

        sub1.doSubStuff();
        sub1.doSuperStuff();

        Super super2 = new Sub();

        super2.doSuperStuff();

        Sub sub2 = (Sub)super2;
        sub2.doSuperStuff();
        sub2.doSubStuff();
    }
}
