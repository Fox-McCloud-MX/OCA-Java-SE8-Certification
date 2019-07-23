package edu.oca.java.se8.certification._1Z0_808.chapter6;

public class PrintingException {

    public static void main(String[] args) {
        try {
            hop();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        /*
        java.lang.RuntimeException: cannot hop
        cannot hop
        java.lang.RuntimeException: cannot hop
        at trycatch.Handling.hop(Handling.java:15)
        at trycatch.Handling.main(Handling.java:7)
        */
    }

    private static void hop() {
        throw new RuntimeException("cannot hop");
    }
}
