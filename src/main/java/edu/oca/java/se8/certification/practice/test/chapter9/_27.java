package edu.oca.java.se8.certification.practice.test.chapter9;

public class _27 {

    public static void main(String[] args) {
        String line = new String("-");
        String anotherLine = line.concat("-");
        System.out.print(line == anotherLine);
        System.out.print(" ");
        System.out.print(line.length());
    }
}
