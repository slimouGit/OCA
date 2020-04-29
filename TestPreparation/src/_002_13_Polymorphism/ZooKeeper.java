package _002_13_Polymorphism;

public class ZooKeeper {
    public static void main(String[] args){
        new ZooKeeper().go();
    }

    private void go() {
        Mammal m = new Zebra();
        System.out.println(m.name + " " + m.makeNoise()); //furry  bray => Polymorphism is only for instance methods, not for instance variables

        Zebra z = new Zebra();
        System.out.println(z.name + " " + z.makeNoise()); //stripes  bray

        Mammal m2 = new Mammal();
        System.out.println(m2.name + " " + m2.makeNoise()); //furry  generic noise
    }
}
