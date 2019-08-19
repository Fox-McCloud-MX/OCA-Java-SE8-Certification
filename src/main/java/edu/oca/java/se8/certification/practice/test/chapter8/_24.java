package edu.oca.java.se8.certification.practice.test.chapter8;

public class _24 {

    public void compute() throws Exception {
        throw new RuntimeException("Error processing request");
    }

    public static void main(String[] bits) {
        try {
            //new _24().compute();
            System.out.print("Ping");
        } catch (NullPointerException e) {
            System.out.print("Pong");
            throw e;
        }
    }
}
