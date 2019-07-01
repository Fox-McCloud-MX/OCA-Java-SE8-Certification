package edu.oca.java.se8.certification._1Z0_808.chapter3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

/*
Our zoo performs animal enrichment
activities to give the animals something fun to do. The head zookeeper has decided
to switch the toys every month. This system will continue for three months 
to see how it works out.
*/
public class Periods {
    public static void main(String[] args) {
        Periods periods = new Periods();
        
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        periods.performAnimalEnrichment(start, end);
        
        Period period = Period.ofMonths(1); // create a period
        periods.performAnimalEnrichment(start, end, period);
    }

    /*
    This code works fi ne. It adds a month to the date until it hits the end date.
    The problem is that this method can’t be reused. 
    Our zookeeper wants to try different schedules to see which works best.
    */
    private void performAnimalEnrichment(LocalDate start, LocalDate end) {
        LocalDate upTo = start;
        while (upTo.isBefore(end)) { // check if still before end
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plusMonths(1); // add a month
        }
    }
    
    /*
    The method can add an arbitrary period of time that gets passed in. 
    This allows us to reuse the same method for different periods of time as 
    our zookeeper changes her mind.
    */
    private void performAnimalEnrichment(LocalDate start, LocalDate end,
        Period period) { // uses the generic period
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("[PERIOD] -> give new toy: " + upTo);
            upTo = upTo.plus(period); // adds the period
        }
    }
    
    public void instance() {
        Period annually = Period.ofYears(1); // every 1 year
        Period quarterly = Period.ofMonths(3); // every 3 months
        Period everyThreeWeeks = Period.ofWeeks(3); // every 3 weeks
        Period everyOtherDay = Period.ofDays(2); // every 2 days
        Period everyYearAndAWeek = Period.of(1, 0, 7); // every year and 7 days
    }
    
    public void workingWithPeriods() {
        LocalDate date = LocalDate.of(2015, 1, 20);
        LocalTime time = LocalTime.of(6, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        Period period = Period.ofMonths(1);
        System.out.println(date.plus(period)); // 2015-02-20
        System.out.println(dateTime.plus(period)); // 2015-02-20T06:15
        System.out.println(time.plus(period)); // UnsupportedTemporalTypeException
    }
    
    
    
    
}
