package _035_Increment;

/**
 * User: salim
 * Date: 07.10.2020 18:20
 */
public class Calcs {
    int root;

    public Calcs(int root) {
        this.root = root++;
    }

    public static void main(String[] args){
        Calcs c = new Calcs(42);
        System.out.println(++c.root);
    }
}
