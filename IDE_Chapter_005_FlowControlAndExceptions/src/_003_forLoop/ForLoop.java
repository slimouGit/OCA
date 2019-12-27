package _003_forLoop;

public class ForLoop {
    int x = 1;
    int y = 1;
    public static void main(String[] args){
        for(int x = 1, y = 1;(x<=10&&y<=10);x++,y++){
            System.out.println("x: " + x);
            System.out.println("y: " + y);
        }
    }
}
