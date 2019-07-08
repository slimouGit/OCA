package _003_Inheritance_Polymorphism;

public class TestShape {
    public static void main(String[] args){
        PlayerPiece pp = new PlayerPiece();
        TilePiece tp = new TilePiece();
        pp.movePiece();
        tp.getAdjacent();

        doShapes(pp);
        doShapes(tp);
    }

    public static void doShapes(GameShape shape){
        shape.displayShape();
    }
}
