package edu.oca.java.se8.certification.practice.test.chapter9;

public class _46 {
    public static void main(String[] args) {
        String e = "example";
        
        char a = '1';
        String b = "1";
        StringBuilder sb = new StringBuilder("1");
        
        e.replace(a, a);
        e.replace(b, b);
        e.replace(sb, sb);
    }
}