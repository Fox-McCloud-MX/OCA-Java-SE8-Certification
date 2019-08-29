package edu.oca.java.se8.certification.practice.test.chapter9;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class _47 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("-5");
        list.add("0");
        list.add("5");
        print(list, e -> e < 0);
    }

    public static void print(List<String> list, Predicate<Integer> p) {
        for (String num : list) {
            if (p.test(1/*num*/)) { //incompatible types: String cannot be converted to Integer
                System.out.println(num);
            }
        }
    }
}
