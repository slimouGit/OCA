package _000_Sandbox.Inheritance_chain;

public class Main {
    public static void main(String[] args){
        Child child = new Child();
        child.tellingWW2Stories();
        child.myRevolteTimeIn68();
        child.tellMeYourStories();
        System.out.println("--------------------------------");
        StepDaughter stepDaughter = new StepDaughter();
        stepDaughter.tellingWW2Stories();
        stepDaughter.myRevolteTimeIn68();
        stepDaughter.wanneBePartOfFamily();
    }
}
