package _007_InvokingSupertypeVersion;

public class Subclass extends Superclass {
    public void printYourself() {
        super.printYourself();
        System.out.println("Printing from subclass");

    }
}
