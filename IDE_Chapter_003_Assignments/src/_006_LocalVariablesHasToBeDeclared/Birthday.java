package _006_LocalVariablesHasToBeDeclared;

public class Birthday {
    static int month;

    public static void main(String[] args) {
        int year = 1980;
        int day;
        System.out.println("Year " + year);
        System.out.println("Month " + month);
        //System.out.println("Day " + day); WONT COMPILE, BECAUSE LOCAL VARIABLES HAS TO BE INITILIZEd
    }
}
