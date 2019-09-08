package _000_Sandbox._012_Inheritance_ConstuctorsBehaviour;

public class FamiliyTest {
    public static void main(String[] args){
        new Son_1(12); //extends mother without no arg constructor
        new Son_2(10); //extends vather with a no ar constructor too
    }

    /*
    OUTPUT:
    Motthers age: 42
    Son 1 age: 12

    Son 2 age: 10 => extends vather with a no arg constructor,
    so no initialized super() is needed in son_2 and vathers age wont be printed
     */
}
