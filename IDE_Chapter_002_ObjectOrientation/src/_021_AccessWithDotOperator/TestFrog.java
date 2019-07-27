package _021_AccessWithDotOperator;

public class TestFrog {
    public static void main(String[] args){
        new Frog();
        new Frog();
        new Frog();
        System.out.println("from static "+ Frog.getFrogCount()); //static context -> Frog is 3
        new Frog();
        new Frog();
        System.out.println("from static "+ Frog.getFrogCount()); //static context -> Frog is 5

        new TestFrog().go(); // -> Frog is 5
        Frog f = new Frog(); // -> Frog becomes 6
        System.out.println("from ref var "+ f.getFrogCount()); //use reference var -> Frog is 6

    }

    private void go() {
        System.out.println("from instance "+ Frog.getFrogCount()); //instance context -> Frog is 5
    }
}
