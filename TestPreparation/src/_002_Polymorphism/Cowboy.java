package _002_Polymorphism;

public class Cowboy {
    public static void main(String[] args){
        new Cowboy().go();

    }

    private void go() {
        Huftier huftier = new Pferd();
        System.out.println(huftier.gattung);        //Huftier
        System.out.println(huftier.makeNoide());    //Pferd noise

        //POLYMORPHISM is onley for instance methods, not instance variables
    }
}
