package _005_1_SwitchStatement;

public class Flipper {
    public static void main(String[] args) {
        String o = "-";
        switch ("RED".toLowerCase()) {
            case "yellow":
                o += "y";
            case "red":
                o += "r";
            case "green":
                o += "g";
        }
        System.out.println(o); //-rg because there are no break statements
    }
}
