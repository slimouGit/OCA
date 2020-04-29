package _003_6_InstanceRefering;

public class Mirror {
    int size = 7;
    public static void main(String[] args){
        Mirror m1 = new Mirror();
        Mirror m2 = m1;
        int i1 = 10;
        int i2 = i1;
        go(m2, i2);
        System.out.println(m1.size + " " + i1); //8 10
    }

    private static void go(Mirror m, int i) {
        m.size = 8;     //size of Mirror Object will be changed
        i = 12;         //new variiable, origin i1 wont change
    }
}
