package _004_LabeledBreak;


public class LabeledBreak {
    public static void main(String[] args) {
        boolean isTrue = true;
        outer:
        for (int i = 0; i < 5; i++) {
            while (isTrue) {
                System.out.println("Hello");
                break outer;
            }
            System.out.println("Outer loop");
        }
            System.out.println("Bye bye");
    }
}
