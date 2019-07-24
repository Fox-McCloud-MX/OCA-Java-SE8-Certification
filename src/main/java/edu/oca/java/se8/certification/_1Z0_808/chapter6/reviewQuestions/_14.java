package edu.oca.java.se8.certification._1Z0_808.chapter6.reviewQuestions;

import java.io.IOException;

public class _14 {
    public void ohNo() throws IOException {
        System.out.println("it's ok");
        //throw new IllegalArgumentException();
        //throw new java.io.IOException();
        throw new RuntimeException();
    }
}
