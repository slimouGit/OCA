package _005_Polymorphism_01;

public class PlayerPiece extends GameShape implements Animatable {
    public void animate() {
        System.out.println("animating ...");
    }

    public void movePiece(){
        System.out.println("moving game piece");
    }
}
