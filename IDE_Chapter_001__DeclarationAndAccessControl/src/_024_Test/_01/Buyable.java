package _024_Test._01;

public interface Buyable extends Sellable {
    //Variables in interface allways
    //public static final
    double PRICE = 42000.00;
    int doors = 4;

    void buyCar();
}
