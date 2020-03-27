package _000_Sandbox._006_OCA_ProgrammerTests;

public class Mystery {
    public static void main(String[] args) {
        for (int i = 0; true || false; i++) {
            System.out.print("I: " + i + " ");
            if (--i == 0 || i == 2) {
                System.out.print("Yes: " + i + " ");
                break;
            } else if (i++ % 2 == 0) {
                System.out.print("No: " + i + " ");
            }
        }
    }
}
