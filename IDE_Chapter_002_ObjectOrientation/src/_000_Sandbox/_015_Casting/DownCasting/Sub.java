package _000_Sandbox._015_Casting.DownCasting;

public class Sub extends Super {
    public void SubSample() {
        System.out.println("method of sub class");
    }

    public static void main(String args[]) {
        Super obj = new Sub();
        Sub sub = (Sub) obj;
        sub.SubSample();
    }
}
