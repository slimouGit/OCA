package _039_LoopBreak;

/**
 * User: salim
 * Date: 09.10.2020 15:32
 */
public class LoopWithBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5)
                break;
            System.out.print(i + ", ");
        }
    }
}
