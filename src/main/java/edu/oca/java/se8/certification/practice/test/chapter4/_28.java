package edu.oca.java.se8.certification.practice.test.chapter4;

import java.util.Arrays;

public class _28 {

    static int[][] game = new int[6][6];

    public static void main(String[] args) {
        game[3][3] = 6;
        Object[] obj = game;
        
        /* OK */
        //System.out.println(Arrays.asList(obj));
        //obj[3] = new int[6];
        
        obj[3] = "X"; //Exception in thread "main" java.lang.ArrayStoreException: java.lang.String
        System.out.println(game[3][3]);
    }
}
