package _000_Sandbox._004_LocalDate_methods;

import java.time.LocalDate;

public class LocalDate_methods {
    public static void main(String[] args){
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        LocalDate epochDay = LocalDate.ofEpochDay(2);
        System.out.println(epochDay);
    }
}
