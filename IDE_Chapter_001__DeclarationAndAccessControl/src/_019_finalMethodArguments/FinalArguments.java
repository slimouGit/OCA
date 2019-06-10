package _019_finalMethodArguments;

/**
 * User: salim
 * Date: 10.06.2019 16:16
 */
public class FinalArguments {
    public static void main(String[] args){
        FinalArguments fa = new FinalArguments();
        fa.myRecords(42, 3);
    }

    public void myRecords(int fileNumber, final int recNumber){
        fileNumber+=1;
        // recNumber+=1; NOT ALLOWED
    }
}
