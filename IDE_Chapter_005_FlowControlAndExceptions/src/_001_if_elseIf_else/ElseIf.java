package _001_if_elseIf_else;

public class ElseIf {
    public static void main(String[] args) {
        int price = 400;
        if (price < 300){
            System.out.println("price<300");
        }else if(price < 400){
            System.out.println("price<400");
        }else{
            System.out.println("price>=400");
        }
    }
}
