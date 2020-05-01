package _006_2_StringArrayNullPointer;

public class Hilltop {
    public static void main(String[] args) {
        String[] horses = new String[5];
        printHorses(horses);
    }

    private static void printHorses(String[] horses) {
        horses[0] = "eyra";
        horses[1] = "vafi";
        horses[2] = "draumur";
        horses[3] = "kara";
        horses[4] = null;

        for (int i = 0;i<horses.length;i++){
            System.out.print(horses[i] + " ");                  //eyra vafi draumur kara null
        }
        System.out.print(" ");
        for (int i = 0;i<horses.length;i++){
            System.out.print(horses[i].toUpperCase() + " ");    //5th element is null, so toUpperCase throws a NullPointerException
        }
    }
}
