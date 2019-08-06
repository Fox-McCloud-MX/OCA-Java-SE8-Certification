package edu.oca.java.se8.certification.practice.test.chapter4;

import java.util.Arrays;

public class _17 {

    public static void main(String[] args) {
        String[] os = new String[]{"Mac", "Linux", "Windows"};
        Arrays.sort(os);
        System.out.println("os: " + Arrays.asList(os));
        System.out.println(Arrays.binarySearch(os, "Mac"));
    }
}
