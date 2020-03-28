package _016_005_SwitchWithStrings;

public class Flipper {
    public static void main(String[] args){
        String o = "-";
        switch ("RED".toLowerCase()){
            case "yellow":
                o += "y";
            case "red":
                o += "r";
            case "green":
                o += "g";
        }
        System.out.println(o); //-rg => break statements are missing too
    }
}
