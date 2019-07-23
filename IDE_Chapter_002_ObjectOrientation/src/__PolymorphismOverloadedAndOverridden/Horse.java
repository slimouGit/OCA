package __PolymorphismOverloadedAndOverridden;

public class Horse extends Animal{
    @Override
    public void eat() {
        System.out.println("A horse is eating");
    }

    public void eat(String s){
        System.out.println("The horse " + s + " is eating");
    }
}
