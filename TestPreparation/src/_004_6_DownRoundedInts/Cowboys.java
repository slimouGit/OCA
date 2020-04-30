package _004_6_DownRoundedInts;

public class Cowboys {
    public static void main(String[] args){
        int x = 12;
        int a = 5;
        int b = 7;
        
        System.out.println(x/a + " " + x/b);        //2 1

        System.out.println("" + x+a + " " + x/b);    //125 1

        System.out.println(x+a + " " + x/b);        //17 1
    }
}
