package _020_006_SwitchExample;

public class Ebb {
    static int x = 7;                           //1.
    public static void main(String[] args){
        String s = "";                          //3.
        for (int y = 0; y < 3; y++){
            x++;                                //4., 7., 9.
            switch (x){
                case 8: s += "8 ";
                case 9: s += "9 ";              //5.
                case 10: {s += "10 "; break;}   //6., 8.
                default: s += "d ";             //10.
                case 13: s+= "13 ";             //11.
            }
        }
        System.out.println(s);                  //12.           9 10 10 d 13
    }
    static {x++;}                               //2.
}
