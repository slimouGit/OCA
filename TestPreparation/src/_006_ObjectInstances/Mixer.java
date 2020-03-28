package _006_ObjectInstances;

public class Mixer {
    Mixer(){};
    Mixer(Mixer m){m1 = m;
    System.out.println("Mixer: " + m);};
    Mixer m1;

    public static void main(String[] args){
        Mixer m2 = new Mixer();
        Mixer m3 = new Mixer(m2);   m3.go();
        Mixer m4 = m3.m1;           m4.go();
        Mixer m5 = m2.m1;           m5.go(); //Exception, because m2 object m1 is never initialized
    }

    private void go() {
        System.out.println("hi");
    }

}
