package _002_001_InvokeOrderStaticInitConstructor;

public class Hawk extends Raptor {
    public static void main(String[] args){
        System.out.println("3. pre ");         //3
        new Hawk();
        System.out.println("8. hawk ");           //8
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
