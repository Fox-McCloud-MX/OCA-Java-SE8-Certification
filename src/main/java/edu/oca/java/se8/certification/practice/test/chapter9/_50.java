package edu.oca.java.se8.certification.practice.test.chapter9;

import java.time.LocalDate;

public class _50 {
    public static void main(String[] args) {
        LocalDate xmas = LocalDate.of(2016, 12, 25);
        //xmas.setYear(2017); LocalDate are inmutable
        System.out.println(xmas.getYear());
    }
}