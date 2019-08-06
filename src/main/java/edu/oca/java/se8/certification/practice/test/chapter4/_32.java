package edu.oca.java.se8.certification.practice.test.chapter4;

import java.util.Arrays;

public class _32 {
    
    private static String[] args = {"seed", "flower"};

    public static void main(String[] empty) {
        String one = args[0];
        Arrays.sort(args);
        System.out.println("sorted: "+ Arrays.asList(args));
        int result = Arrays.binarySearch(args, one);
        System.out.println(result); //1
    }
}
