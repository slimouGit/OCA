package _028_006_MutableOrNot;

public class Mounds {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        String s = new String();
        for(int i = 0; i<10;i++){
            s = " " + i;
            System.out.println(i + ". (String): " + s);
            sb.append(s);
            System.out.println(i + ". (same SB): " + sb);
        }
    }
}
