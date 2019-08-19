package edu.oca.java.se8.certification.practice.test.chapter8;


public class _10 {
    public void openDrawbridge() throws Exception { // p1
        try {
            throw new Exception("Circle");
        } catch (Exception e) {
            System.out.print("Opening!");
        } finally {
            System.out.print("Walls"); // p2
        }
    }

    public static void main(String[] moat) {
        //new _10().openDrawbridge(); // p3
    }
}