package _002_9_CastingClasses;

public class Redwood extends Tree {
    public static void main(String[] args){
        new Redwood().go();
    }

    void go() {
        go2(new Tree(), new Redwood());
        go2((Redwood)new Tree(), new Redwood());
    }

    private void go2(Tree t1, Redwood r1) {
        Redwood r2 = (Redwood)t1;
        Tree t2 = (Tree)r1;
    }
    /**
     * OUTPUT
     * Exception in thread "main" java.lang.ClassCastException: _002_9_CastingClasses.Tree cannot be cast to _002_9_CastingClasses.Redwood
     */
}
