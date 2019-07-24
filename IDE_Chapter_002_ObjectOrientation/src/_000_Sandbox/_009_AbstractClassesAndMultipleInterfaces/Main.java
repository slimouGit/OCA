package _000_Sandbox._009_AbstractClassesAndMultipleInterfaces;

public class Main {
    public static void main(String[] args){
        BeachBall bb = new BeachBall();

        bb.pumpIt();        //FROM ABSTRACT CLASS BALL AND INTERFACE USEABLE (INDIRECTLY)
        bb.moveIt();        //FROM ABSTRACT CLASS BALL AND INTERFACE USEABLE (INDIRECTLY)
        bb.useIt();         //FROM ABSTRACT CLASS BALL AND INTERFACE USEABLE (DIRECTLY)
        bb.playBall();      //FROM ABSTRACT CLASS BALL
        bb.customizeBall(); //FROM INTERFACE CUSTOMIZABLE (DIRECTLY)
        bb.myBall();        //USING DEFAULT METHOD FROM INTERFACE CUSTOMIZABLE (DIRECTLY)
    }
}
