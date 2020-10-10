package _038_LoopContinue;

/**
 * User: salim
 * Date: 09.10.2020 15:23
 */
public class LoopWithContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5)
                continue;
            System.out.print(i + ", ");
        }
    }
}
