package _021_AccessWithDotOperator;

public class Frog {
    private static int frogCount = 0;

    public static int getFrogCount() {
        return frogCount;
    }

    public Frog() {
        frogCount += 1;
    }
}
