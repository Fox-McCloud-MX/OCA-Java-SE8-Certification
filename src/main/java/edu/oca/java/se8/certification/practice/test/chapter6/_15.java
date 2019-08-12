package edu.oca.java.se8.certification.practice.test.chapter6;

import java.util.Arrays;

public class _15 {

    private int age = 18;

    private static void slalom(_15 racer, int[] speed, String name) {
        racer.age = 18;
        name = "Wendy";
        speed = new int[1];
        speed[0] = 11;
        racer = null;
        
        //System.out.println(racer); //null
        //System.out.println(speed[0]); //11
        //System.out.println(name); //Wendy
    }

    public static void main(String... mountain) {
        final _15 mySkier = new _15();
        mySkier.age = 16;
        final int[] mySpeed = new int[1];
        final String myName = "Rosie";
        slalom(mySkier, mySpeed, myName);
        
        System.out.println(mySkier.age); //18
        System.out.println(myName); //Rosie
        System.out.println(mySpeed[0]); //0
    }
}
