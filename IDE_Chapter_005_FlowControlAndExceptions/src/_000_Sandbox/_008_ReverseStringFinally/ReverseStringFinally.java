package _000_Sandbox._008_ReverseStringFinally;

public class ReverseStringFinally {
    public static void main(String[] args) {
        try {
            new ReverseStringFinally().doStruff();
        } finally {
            System.out.println("programm finished");
        }

    }

    private void doStruff() {
        System.out.println(reverse("lager"));
    }

    private String reverse(String s) {
        String reverseString = "";

        for (int i = s.length() - 1; i >= 0; --i) {
            reverseString += s.charAt(i);
        }
        return reverseString;
    }
}
