package _040_DoWhile;

/**
 * User: salim
 * Date: 09.10.2020 15:37
 */
public class DoWhile {
    public static void main(String[] args){
        int i = 5, j = 3;
        do{
            System.out.print(i + " " + j + " ");
        }while (i++ == 5 || ++j ==3);

        for (int k = 0;k<3;k++){
            System.out.print(k);

        }


    }
}
