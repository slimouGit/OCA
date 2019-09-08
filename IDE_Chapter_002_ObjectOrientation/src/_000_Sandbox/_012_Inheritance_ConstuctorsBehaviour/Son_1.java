package _000_Sandbox._012_Inheritance_ConstuctorsBehaviour;

public class Son_1 extends Mother {
    Son_1(int age){
        super(42); //has to be initialized,
        // because there is no no arg constructor in class mother
        {System.out.println("Son 1 age: " + age);}
    }
}
