package _024_Test._13;

public class ZooKeeper {
    public static void main(String[] args){
        new ZooKeeper().go();
    }

    public void go() {
        Mammal m = new Zebra();
        System.out.println(m.name + m.makeNoise());
    }

    //OUTPUT: furry bray
    //Polymorphism is only for instance methods => Zebra.makeNoise() = "bray"
    //not for instance variables => Mammal.name = "furry"
}
