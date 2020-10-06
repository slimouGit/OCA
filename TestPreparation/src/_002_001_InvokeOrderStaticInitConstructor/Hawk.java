package _002_001_InvokeOrderStaticInitConstructor;

public class Hawk extends Raptor {
    public Hawk(){
        System.out.println("Constructor Hawk ");              //7
    };
    public static void main(String[] args){
        System.out.println("Sysout after main ");         //3
        new Hawk();
        System.out.println("Sysout at the end of main ");           //8
    }

    /**
     * OUTPUT
     * 1. r1
     * 2. r4
     * 3. pre
     * 4. b1
     * 5. b2
     * 6. r3
     * 7. r2
     * 8. hawk
     */
}
