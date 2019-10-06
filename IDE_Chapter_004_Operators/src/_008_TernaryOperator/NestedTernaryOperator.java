package _008_TernaryOperator;

public class NestedTernaryOperator {
    public static void main(String[] args){
        int sizeOfYard = 10;
        int numOfPets = 3;

        String status = (numOfPets<4) ? "Pet count is ok" : (sizeOfYard>8)?"Pet limit on the edge":"too many pets";

        System.out.println(status);
    }
}
