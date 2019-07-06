package _000_Sandbox.enums_02;


public class WeekDays {
    enum Days {
        MON("Montag"), TUE("Dienstag"), WED("Mittwoch"), THU("Donnerstag"), FRI("Freitag"), SAT("Samstag"), SON("Sonntag");

        private String weekday;

        Days(String weekday) {
            this.weekday = weekday;
        }

        public String getWeekday() {
            return weekday;
        }
    }

    public static void main(String[] args) {

        //initialize enum as an array
        Days[] day = Days.values();

        System.out.println("Day 1: " + day[0].getWeekday() + "\n");

        for (int i = 0; i < Days.values().length; i++) {
            System.out.println("Day " + i + ": " + day[i].getWeekday());
        }
    }
}
