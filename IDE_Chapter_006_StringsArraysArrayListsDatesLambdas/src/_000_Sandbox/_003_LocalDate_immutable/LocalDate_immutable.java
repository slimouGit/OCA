package _000_Sandbox._003_LocalDate_immutable;

import java.time.LocalDate;
import java.time.Period;

public class LocalDate_immutable {
    public static void main(String[] args){
        LocalDate date1 = LocalDate.of(2019,01,01);
        System.out.println(date1);      //2019-01-01
        Period oneMonthMore = Period.ofMonths(1);
        date1.plus(oneMonthMore);
        System.out.println(date1);      //immutable, value wont change => 2019-01-01

        LocalDate date2 = date1.plus(oneMonthMore);
        System.out.println(date2);      //2019-02-01
    }
}
