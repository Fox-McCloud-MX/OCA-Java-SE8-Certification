package edu.oca.java.se8.certification.practice.test.chapter9;

import java.util.ArrayList;

public class _7 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("radical")
                .insert(7/*sb.length()*/, "robots"); //variable sb might not have been initialized
        System.out.println(sb);
    }
}
