package _024_Test._09;


public class Redwood extends Tree {
    public static void main(String[] args){
        new Redwood().go();
    }

    private void go() {
        go2(new Tree(), new Redwood());
        go2((Redwood) new Tree(), new Redwood()); //Tree cannot be cast to Redwood
    }

    private void go2(Tree t1, Redwood r1) {
        Redwood r2 = (Redwood)t1; //Tree cannot be cast to Redwood
        Tree t2 = (Tree)r1;
    }

    //AN EXCEPTION IS THROWN AT RUNTIME

}
