package _023_006_ArrayWithNullValue;

public class Hilltop {
    public static void main(String[] args){
        String[] horses = new String[5];
        horses[4] = null;
        for(int i = 0; i<horses.length;i++){
            if(i<args.length)                   //it runs from index 0 to 3 => the 5th element i null => Exception is thrown when toLowerCase
                horses[i] = args[i];
            System.out.println(horses[i].toLowerCase() + " ");
        }
    }
}
