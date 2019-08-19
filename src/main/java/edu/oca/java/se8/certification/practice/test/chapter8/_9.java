package edu.oca.java.se8.certification.practice.test.chapter8;

public class _9 {
    public static void main(String officials[]) {
        try {
            System.out.print('A');
            throw new RuntimeException("Out of bounds!");
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.print('B');
            throw aioobe;
        } finally {
            System.out.print('C');
        }
    }
}