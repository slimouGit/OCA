package _006_13_LambdaPredicates;

import java.util.function.Predicate;

public class Sheep {
    public static void main(String[] args){
        Sheep s = new Sheep();
        s.go(x -> adder(6,2)<9);
        s.go(x -> adder(1,1)<adder(1,1));
        s.go(x -> adder(1,1)<adder(1,1)+1);

        }


    void go(Predicate<Sheep> e){
            Sheep s2 = new Sheep();
            if(e.test(s2)){
                System.out.println("true");
            }else{
                System.out.println("false");
            }

    }

    private static int adder(int x, int y) {
        return x + y;
    }
}
