package edu.oca.java.se8.certification._1Z0_808.chapter3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Dates {

    public static void main(String[] args) {
        Dates dates = new Dates();

        //dates.print();
        //dates.constructor();
        //dates.manipulatingLocalDate();
        //dates.chainingMethods();
        //dates.format();
        
        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        Period p = Period.of(1, 2, 3);
        d = d.minus(p);
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println(d.format(f));

    }

    public void print() {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
    }

    public void createLocalDate() {
        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2015, 1, 20);
    }

    public void createLocalTime() {
        LocalTime time1 = LocalTime.of(6, 15); // hour and minute
        LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
        LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds
    }

    public void createLocalDateTime() {
        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalTime time1 = LocalTime.of(6, 15); // hour and minute

        LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
    }

    //The date and time classes have private constructors 
    //to force you to use the static methods. The
    public void constructor() {
        //LocalDate d = new LocalDate(); // DOES NOT COMPILE

        //LocalDate.of(year, month, day);
        LocalDate.of(2015, Month.MARCH, 32); // throws DateTimeException

        /*
        java.time.DateTimeException: 
        Invalid value for DayOfMonth (valid values 1 - 28/31): 32
         */
    }

    public void manipulatingLocalDate() {
        //Plus Methods
        LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
        System.out.println(date); // 2014-01-20

        date.plusDays(2); //immutable
        System.out.println(date); // 2014-01-20

        date = date.plusDays(2);
        System.out.println(date); // 2014-01-22

        date = date.plusWeeks(1);
        System.out.println(date); // 2014-01-29

        date = date.plusMonths(1);
        System.out.println(date); // 2014-02-28

        date = date.plusYears(5);
        System.out.println(date); // 2019-02-28
    }

    public void manipulatingLocalDateTime() {
        //MinusMethods
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(5, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(dateTime); // 2020-01-20T05:15
        dateTime = dateTime.minusDays(1);
        System.out.println(dateTime); // 2020-01-19T05:15
        dateTime = dateTime.minusHours(10);
        System.out.println(dateTime); // 2020-01-18T19:15
        dateTime = dateTime.minusSeconds(30);
        System.out.println(dateTime); // 2020-01-18T19:14:30
    }

    public void chainingMethods() {
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20); //2010-1-20
        LocalTime time = LocalTime.of(5, 15); //05-15
        LocalDateTime dateTime = LocalDateTime.of(date, time) //2010-1-20T05-15
            .minusDays(1)
            .minusHours(10)
            .minusSeconds(30);
        System.out.println(dateTime); //2010-1-18T07-19:30
    }

    public void formattingLocalDate() {
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        System.out.println(date.getDayOfWeek()); // MONDAY
        System.out.println(date.getMonth()); // JANUARY
        System.out.println(date.getYear()); // 2020
        System.out.println(date.getDayOfYear()); // 20
    }

    public void format() {
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE)); //2020-01-20
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME)); //11:12:34
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)); //2020-01-20T11:12:34
    }

    public void predefinedFormats() {
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

        //print using shortDaateTime
        System.out.println(shortDateTime.format(dateTime)); // 1/20/20
        System.out.println(shortDateTime.format(date)); // 1/20/20
        System.out.println(shortDateTime.format(time)); // UnsupportedTemporalTypeException

        //print using own object
        System.out.println(dateTime.format(shortDateTime));
        System.out.println(date.format(shortDateTime));
        System.out.println(time.format(shortDateTime));
    }

    //SHORT and MEDIUM 
    //The other predefi ned formats involve time zones, which are not on the exam.
    public void dateTimeFormatter() {
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        
        DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        
        //FormatStyle.SHORT = dd/MM/yy 12hh:mm AM|PM
        //FormatStyle.MEDIUM = MONTH dd, yyyy 12hh:mm:ss AM|PM
        
        System.out.println(shortF.format(dateTime)); // 1/20/20 11:12 AM
        System.out.println(mediumF.format(dateTime)); // Jan 20, 2020 11:12:34 AM
    }
    
    public void dateTimeFormatterPattern() {
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        
        DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm");
        f.format(dateTime);
        f.format(date); //throw an exception.
        f.format(time);
    }
    
    public void parsingDatesAndTimes() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date = LocalDate.parse("01 02 2015", f);
        LocalTime time = LocalTime.parse("11:22");
        System.out.println(date); // 2015-01-02
        System.out.println(time); // 11:22
        
    }
}
