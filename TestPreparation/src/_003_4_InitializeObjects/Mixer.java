package _003_4_InitializeObjects;

public class Mixer {
    private Mixer m1;
    Mixer(){}
    Mixer(Mixer m){
        m1 = m;
    }

    public static void main(String[] args){
        Mixer m2 = new Mixer();
        Mixer m3 = new Mixer(m2);  m3.go();
        Mixer m4 = m3.m1;  m4.go();         //m3.m1 is initialized with m2
        Mixer m5 = m2.m1;  m5.go();         //NULL POINTER, CAUSE m2.m1 instance variable never initialzed
    }

    private void go() {
        System.out.print("hi ");
    }
}
