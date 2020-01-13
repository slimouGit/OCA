package _009_AnonymousArray;

public class AnnonymousArray {
        public static void main (String[]args){
            AnnonymousArray aa = new AnnonymousArray();
            aa.takesArray(new int[]{1, 2, 3, 4});
        }

    void takesArray(int[] someArray) {
            for(int x:someArray){
                System.out.println(x);
            }
    }
}
