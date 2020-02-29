package _000_Sandbox.interfaces_abstract_02;

public class MyGolf extends Golf {
    public static void main(String[] args){
        MyGolf myGolf = new MyGolf();

        //ABSTRACT METHOD IN ABSTRACT CLASS Vehicle
        myGolf.buyVehivle();

        //DEFAULT METHOD IN INTERFACE Colorizing
        myGolf.cleanCar();


        myGolf.colorize("red");

        myGolf.drive();
    }
}
