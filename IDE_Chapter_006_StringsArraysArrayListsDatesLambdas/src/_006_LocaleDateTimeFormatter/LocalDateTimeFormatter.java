package _006_LocaleDateTimeFormatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeFormatter {
    public static void main(String[] args){
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        System.out.println("-----------------------------------------");

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MMM dd, yyyy");
        System.out.println(dateTime.format(dtf1));  //Jan 04, 2020
        System.out.println("-----------------------------------------");

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("E MMM dd, yyyy G");
        System.out.println(dateTime.format(dtf2));  //a Jan 04, 2020 n. Chr.
        System.out.println("-----------------------------------------");

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("k:m:s A a");
        System.out.println(dateTime.format(dtf3));  //17:53:24 64404158 PM
        System.out.println("-----------------------------------------");


    }
}
