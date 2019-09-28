package _004_InheritanceAssignments;

public class Main {
    public static void main(String[] args){
        Parent parent = new Child();
        parent.doParentStuff();

        Child child = new Child();
        child.doChildtuff();
        child.doParentStuff();

        /*
        INCOMPATIBLE ASSIGNMENT!!!

        Child illegalChild = new Parent();

         */
    }
}
