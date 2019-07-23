package _000_Sandbox._002_InheritMethodsOrNot;

public class Main {
    public static void main(String[] args){

        Dog d1 = new Dog();
        d1.drink();
        //D1 is not allowed to eat anything

        Animal d2 = new Dog();
        d2.drink();
        //D2 is not allowed to eat anything


        Animal d3 = new Animal();
        d3.drink();
        //D3 is not allowed to eat anything

    }
}
