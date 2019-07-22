package _006_OverriddenMethods;

public class Horse extends Animal {
    @Override
    public void eat() {
        System.out.println("A Horse doesnt eat as each other animal");
    }

    public void buck(){
        System.out.println("Buck me, I am a horse");
    }
}
