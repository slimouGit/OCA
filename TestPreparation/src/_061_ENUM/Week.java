package _061_ENUM;

/**
 * User: salim
 * Date: 01.11.2020 19:16
 */
public class Week {
    enum Weekdays{
        MONDAY("Montag"),TUESDAY("Dienstag"),WEDNESDAY("MITTWOCH"),THURSDAY("Donnerstag"),FRIDAY("Freitag"),SATURDAY("Samstag"),SUNDAY("Sonntag");

        private String tagesname;

        Weekdays(String tagesname) {
            this.tagesname = tagesname;
        }
    }

    public static void main(String[] args){
        Weekdays[] days = Weekdays.values();

        for(Weekdays day :Weekdays.values()){
            System.out.println(day.tagesname);
        }

        System.out.println(days[5]);
    }
}
