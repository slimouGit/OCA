package _005_Polymorphism_01;

/**
 * PlayerPiece IS-A:
 * An Object (since any object inherits from Object)
 * A GameShape (since PlayerPiece extends GameShape)
 * A PlayerPiece (since that’s what it really is)
 * An Animatable (since PlayerPiece implements Animatable)
 */
public class PlayerPiece extends GameShape implements Animatable {
    public void animate() {
        System.out.println("animating ...");
    }

    public void movePiece(){
        System.out.println("moving game piece");
    }
}
