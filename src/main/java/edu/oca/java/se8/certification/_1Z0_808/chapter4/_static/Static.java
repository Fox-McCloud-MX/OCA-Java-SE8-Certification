
package edu.oca.java.se8.certification._1Z0_808.chapter4._static;

import java.util.ArrayList;

public class Static {
    private static final ArrayList<String> values = new ArrayList<>();

    private static final int NUM_SECONDS_PER_HOUR;

    //The static initializer runs when the class is fi rst used.
    static {
        int numSecondsPerMinute = 60;
        int numMinutesPerHour = 60;
        NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;
    }
    
    public static void main(String[] args) {
        values.add("changed1");
        values.add("changed2");
        values.add("changed3");
        
        System.out.println(values);
    }
}
