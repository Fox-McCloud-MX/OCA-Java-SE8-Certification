package edu.oca.java.se8.certification.practice.test.chapter9;

import java.util.function.Predicate;

public class _28 {
    public static void main(String[] args) {
        //Predicate dash = c -> c.startsWith(" "); //c hasn't startWith
        Predicate<String> dash = (String c) -> c.startsWith(" ");
        System.out.println(dash.test("–"));
        
        //extra
        Predicate dash1 =  c -> true; //boolean needed
        
    }
}