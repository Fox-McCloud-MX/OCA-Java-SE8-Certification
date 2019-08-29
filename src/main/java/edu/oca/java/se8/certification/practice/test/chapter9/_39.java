package edu.oca.java.se8.certification.practice.test.chapter9;

public class _39 {

    public static void main(String[] args) {
        String happy = " :) - (: ";
        String really = happy.trim();
        System.out.println(happy + " " + happy.length());
        System.out.println(really+ " " + really.length());
        String question = "";
        
        question = happy.substring(0, happy.length() - 1);
        System.out.println(really.equals(question));
        
        question = happy.substring(0, happy.length());
        System.out.println(really.equals(question));
        
        question = happy.substring(1, happy.length() - 1);
        System.out.println(really.equals(question));
        
        question = happy.substring(1, happy.length());
        System.out.println(really.equals(question));
    }
}
