package _005_CalenderExamples;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class CalenderExamples {
    public static void main(String[] args) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        LocalDate mimiBiDay = LocalDate.of(1976, 03, 06);
        LocalDate slimouBiDay = LocalDate.of(1980, 04, 26);

        System.out.println("mimi b day");
        System.out.println(mimiBiDay.format(f));
        System.out.println("your birthday is " + mimiBiDay);
        System.out.println("its a  " + mimiBiDay.getDayOfWeek());
        long mimiDays = mimiBiDay.until(LocalDate.now(), ChronoUnit.DAYS);
        System.out.println("Days to now " + mimiDays);

        System.out.println("You ll reach 20000 days on " + mimiBiDay.plusDays(20_000));

        System.out.println("-----------------------------------------");

        System.out.println("slimou b day");
        System.out.println(slimouBiDay.format(f));
        System.out.println("your birthday is " + slimouBiDay);
        System.out.println("its a  " + slimouBiDay.getDayOfWeek());
        long slimouDays = slimouBiDay.until(LocalDate.now(), ChronoUnit.DAYS);
        System.out.println("Days to now " + slimouDays);

        System.out.println("You ll reach 20000 days on " + slimouBiDay.plusDays(20_000));

        System.out.println("-----------------------------------------");

        LocalDate d2000 = LocalDate.of(2_000, 1, 1);

        Period p2 = Period.between(d2000, LocalDate.now());
        System.out.println("Persiod since Y2K " + d2000.until(LocalDate.now(),ChronoUnit.DAYS));


    }
}
