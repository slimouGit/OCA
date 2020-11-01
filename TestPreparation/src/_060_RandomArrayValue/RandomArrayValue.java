package _060_RandomArrayValue;

/**
 * User: salim
 * Date: 01.11.2020 18:49
 */
public class RandomArrayValue {
    public static void main(String[] args){
        String s1 = makeRandomName();
        System.out.println(s1);
    }

    private static String makeRandomName() {
        int x = (int) (Math.random() * 5);
        String name = new String[] {"Peter", "Hans", "Maria", "Gundula", "Helge"}[x];
        return name;
    };
}
