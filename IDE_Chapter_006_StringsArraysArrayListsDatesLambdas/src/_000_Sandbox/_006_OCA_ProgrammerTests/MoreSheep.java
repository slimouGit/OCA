package _000_Sandbox._006_OCA_ProgrammerTests;

import java.util.function.Predicate;

public class MoreSheep {
    static boolean b = false;
    public static void main(String[] args){
        MoreSheep s = new MoreSheep();
        s.go(x -> b == false);
        s.go(x -> adder(4,2) >= 6);
    }

    private void go(Predicate<MoreSheep> e) {
        MoreSheep s2 = new MoreSheep();
        if(e.test(s2))
            System.out.print("true ");
        else
            System.out.print("false ");
    }
    static int adder(int x, int y){
        return x + y;
    }
}
