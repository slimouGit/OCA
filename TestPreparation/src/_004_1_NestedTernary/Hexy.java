package _004_1_NestedTernary;

public class Hexy {
    public static void main(String[] args){
        int i = 42;
        String s = (i<40)?"life":(i>50)?"univers":"everything";
        System.out.print(s);    //everything
    }
}
