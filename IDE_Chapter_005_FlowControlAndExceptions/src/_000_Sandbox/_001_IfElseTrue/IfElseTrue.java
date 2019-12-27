package _000_Sandbox._001_IfElseTrue;

public class IfElseTrue {
    public static void main(String[] args){
        int x = 2;
        int y = 5;

        if(((x>3)&&(y<2)) | doStuff()){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

    private static boolean doStuff() {
        return true;
    }

    /**
     * OUT: true
     */
}
