package _003_7_GC;

public class Wind {
    int id;
    Wind(int i){
        id = i;
    }
    public static void main(String[] args){
        new Wind(3).go();
        //THREE WIND OBJECTS ARE ELIBBLE FOR GARBAGE COLLECTION HERE
    }

    private void go() {
        Wind w1 = new Wind(1);
        Wind w2 = new Wind(2);
        System.out.println(w1.id + " " + w2.id);    //1 2
    }
}
