package _024_Test._10;

public class Tablet extends Electronic implements Gadget {
    @Override
    public void doStuff() {
        System.out.println("show book");
    }
    public static void main(String[] args){
        new Tablet().getPower();
        new Tablet().doStuff();
        new Tablet().setPower();
    }

    @Override
    void setPower() {
        System.out.println("set power");
    }
}
