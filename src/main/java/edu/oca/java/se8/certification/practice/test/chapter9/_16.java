package edu.oca.java.se8.certification.practice.test.chapter9;

import java.util.function.Predicate;

public class _16 {
    Predicate<String> pred1 = s -> false;
    Predicate<String> pred2 = (s) -> false;
    //Predicate<String> pred3 = String s -> false; error
    Predicate<String> pred4 = (String s) -> false;
}