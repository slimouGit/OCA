package _006_OverriddenMethods;

public class Animal {
    public void eat(){
        System.out.println("Generic animal is eating");
    }

    //final methos cant be overridden
    final void animalisticBehaviour(){
        System.out.println("each animal has an animalistic behaviour");
    }
}
