package _002_switch;

public class Switch {
    public static void main(String[] args){
        String s = "xyz";
        switch(s.length()){
            case 1:
                System.out.println("length is " + s.length());
                break;
            case 2:
                System.out.println("length is " + s.length());
                break;
            case 3:
                System.out.println("length is " + s.length());
                break;
            default:
                System.out.println("length is " + s.length());
        }
    }
}
