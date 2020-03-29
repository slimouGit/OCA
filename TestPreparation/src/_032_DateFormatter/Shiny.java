package _032_DateFormatter;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Shiny {
    public static void main(String[] args){
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MMM dd, yyyy");

        LocalDate d = LocalDate.of(2018, Month.JANUARY, 15);
        LocalDate d2 = d.plusDays(1);

        System.out.println(f1.format(d));   //Jan 15, 2018
        System.out.println(d2.format(f1));  //Jan 16, 2018

    }
}
