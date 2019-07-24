package _000_Sandbox._009_AbstractClassesAndMultipleInterfaces;

public class BeachBall extends Ball implements Customizable {
    @Override
    void playBall() {
        System.out.println("Play ball from abstract class Ball");
    }

    @Override
    public void useIt() {
        System.out.println("Use ball from interface Useable");
    }

    @Override
    public void moveIt() {
        System.out.println("Move ball from interface Moveable");
    }

    @Override
    public void pumpIt() {
        System.out.println("Pump ball from interface Pumpable");
    }

    @Override
    public void customizeBall() {
        System.out.println("Costomize my ball from interface Customizable");
    }
}
