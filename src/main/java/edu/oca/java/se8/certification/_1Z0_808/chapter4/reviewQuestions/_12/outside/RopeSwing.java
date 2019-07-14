package edu.oca.java.se8.certification._1Z0_808.chapter4.reviewQuestions._12.outside;

import edu.oca.java.se8.certification._1Z0_808.chapter4.reviewQuestions._12.rope.*;
import static edu.oca.java.se8.certification._1Z0_808.chapter4.reviewQuestions._12.rope.Rope.*;

public class RopeSwing {
    private static Rope rope1 = new Rope();
    private static Rope rope2 = new Rope();

    {
        System.out.println(rope1.length);
    }

    public static void main(String[] args) {
        rope1.length = 2;
        rope2.length = 8;
        System.out.println(rope1.length);
    }
}