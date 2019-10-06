package _008_TernaryOperator;

public class TernaryOperator {
    public static void main(String[] args){
        int numOfPets = 3;

        String status = (numOfPets<4) ? "Pet limit not exceeded" : "Too many pets";

        System.out.println(status);
    }
}
