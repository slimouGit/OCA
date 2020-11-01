package _052_GarbageCollector_Eligible;

/**
 * User: salim
 * Date: 01.11.2020 10:03
 */
public class CardBoard {
    CardBoard go(CardBoard cb){
        cb = null;
        return cb;
    }

    public static void main(String[] args){
        CardBoard c1 = new CardBoard();
        CardBoard c2 = new CardBoard();
        CardBoard c3 = c1.go(c2);
        c1 = null;
        System.out.println(null == c1);
        System.out.println(null == c2);
        System.out.println(null == c3);
    }
}
