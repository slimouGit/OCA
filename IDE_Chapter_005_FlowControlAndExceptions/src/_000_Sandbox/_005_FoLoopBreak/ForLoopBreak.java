package _000_Sandbox._005_FoLoopBreak;

public class ForLoopBreak {
    public static void main(String[] args){
        for(int i = 0; i<10;i++){
            System.out.println("Inside loop " + i);
            if(i==5){
                break;
            }

        }
            System.out.println("outside loop ");
    }
}
