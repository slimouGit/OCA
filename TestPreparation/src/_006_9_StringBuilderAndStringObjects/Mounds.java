package _006_9_StringBuilderAndStringObjects;

public class Mounds {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        String s = new String();
        for(int i = 0; i< 1000;i++){
            s = " " + i;
            sb.append(s);
        }
        //About 1000 Objects are created
    }
}
