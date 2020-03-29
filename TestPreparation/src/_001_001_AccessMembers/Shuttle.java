package _001_001_AccessMembers;

public class Shuttle extends Rocket {
    public static void main(String[] args){
        new Shuttle().go();
    }

    void go() {
        //Rocket.blastOff(); //not possible cause blastOff in Rocket is private
        blastOff();
    }

    private void blastOff(){
        System.out.println("sh-bang");
    }
}
