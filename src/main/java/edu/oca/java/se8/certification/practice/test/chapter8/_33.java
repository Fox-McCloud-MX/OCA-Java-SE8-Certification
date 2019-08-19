package edu.oca.java.se8.certification.practice.test.chapter8;

public class _33 {

    public static void main(String[] args) {
        final Object exception = new Exception();
        final Exception data = (RuntimeException) exception;
        System.out.print(data);
    }
}
