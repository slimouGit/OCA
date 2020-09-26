package _000_Sandbox._015_Casting.UpCasting;

public class Sub extends Super {
    public void SubSample() {
        System.out.println("method of sub class");
    }

    public static void main(String args[]) {
        Super obj =(Super) new Sub();
        obj.SuperSample();
    }
}
