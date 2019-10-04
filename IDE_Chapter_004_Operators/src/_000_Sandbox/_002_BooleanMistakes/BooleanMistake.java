package _000_Sandbox._002_BooleanMistakes;

public class BooleanMistake {
    public static void main(String[] args){
        boolean a = false;
        if(a = true){   // THERE IS NO COMPAREMENT, ONLY INITIALATION
            System.out.println("a is true");
        } else{
            System.out.println("a is false");
        }

        boolean b = false;
        if(b == true){
            System.out.println("b is true");
        } else{
            System.out.println("b is false");
        }

        int c = 1;
        //if(c = 0){ THIS ASSIGNMENT DONT WORKS
        if(c == 0){
            System.out.println("c is 0");
        } else{
            System.out.println("c is not 0");
        }
    }

    /**
     * OUTPUT
     * a is true
     * b is false
     * c is not 0
     */
}
