package _000_Sandbox._001_Inheritance_chain;

public class Main {
    public static void main(String[] args){
        Child child = new Child();
        child.tellingWW2Stories();
        child.myRevolteTimeIn68();
        child.tellMeYourStories();
        child.iAmTheRealHeadOfFamily();
        System.out.println("--------------------------------");
        StepDaughter stepDaughter = new StepDaughter();
        stepDaughter.tellingWW2Stories();
        stepDaughter.myRevolteTimeIn68();
        stepDaughter.wanneBePartOfFamily();
        stepDaughter.iAmTheRealHeadOfFamily();
    }
}
