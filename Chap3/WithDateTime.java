package Chap3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;

public class WithDateTime {
    public static void main(String[] args) {
        LocalDate.now(); // ouputs just the date now or current
        LocalTime.now(); // ouputs just the time now or current
        LocalDateTime.now(); // outputs both date and time now
        System.out.println(LocalDate.now()+" || "+LocalTime.now()+" || "+LocalDateTime.now());

        //dealing with date
        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20); // format year,month,day. Month here uses the enum
        LocalDate date2 = LocalDate.of(2015, 1, 20); // using the numeric for the month here 1 instead of enum Month.JANUARY
        System.out.println(date1);

        //dealing with time
        LocalTime time1 = LocalTime.of(6, 15); // hour and minute
        LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
        LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds
        System.out.println(time1 + "||"+time2 +"||"+time3);

        //dealing with both
        LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15); // setting date and time with all variables
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1); // using date and time variables

        //LocalDate d = new LocalDate(); // cannot compile because class has a private contructor, we are forced to use the static methods

        //date and time are immutable like string
        LocalDate date5 = LocalDate.of(2014, Month.JANUARY, 20);
        System.out.println(date5); // 2014-01-20
        date5 = date5.plusDays(2);
        System.out.println(date5); // 2014-01-22
        date5 = date5.plusWeeks(1); 
        System.out.println(date5); // 2014-01-29
        date5 = date5.plusMonths(1);
        System.out.println(date5); // 2014-02-28 not a leap year that is why we have 28 back instead of 29
        date5 = date5.plusYears(5);
        System.out.println(date5); // 2019-02-28

        //date and time formater - converting date and time to formatted string
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(dateTimeFormatter.format(dateTime));

        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println(dateTimeFormatter2.format(date));

        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        System.out.println(dateTimeFormatter3.format(time));

        //converting string to date
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date0 = LocalDate.parse("01 02 2015", f);
        LocalTime time0 = LocalTime.parse("11:22");
        System.out.println(date0); // 2015-01-02
        System.out.println(time0); // 11:22
    }
}
