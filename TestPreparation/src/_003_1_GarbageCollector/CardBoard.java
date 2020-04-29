package _003_1_GarbageCollector;

public class CardBoard {
    Short story = 200;
    CardBoard go(CardBoard cb){
        cb = null;
        return cb;
    }

    public static void main(String[] args){
        CardBoard c1 = new CardBoard();
        CardBoard c2 = new CardBoard();
        CardBoard c3 = c1.go(c2);
        c1 = null;
        System.out.println("c1 " + c1);
        System.out.println("c2 " + c2);
        System.out.println("c3 " + c3);

        /**
         * c1 null
         * c2 _003_1_GarbageCollector.CardBoard@1f89ab83
         * c3 null
         */
    }
}
