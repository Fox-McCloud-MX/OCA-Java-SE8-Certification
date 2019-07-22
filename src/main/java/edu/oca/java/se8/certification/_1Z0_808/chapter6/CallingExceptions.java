package edu.oca.java.se8.certification._1Z0_808.chapter6;

public class CallingExceptions {

    public static void main(String[] args) throws NoMoreCarrotsException { //declare exception
        eatCarrot();// DOES NOT COMPILE ist'n declare exception
    }

    public static void main(String args) {
        try {
            eatCarrot();
        } catch (NoMoreCarrotsException e) {// handle exception
            System.out.print("sad rabbit");
        }
    }

    private static void eatCarrot() throws NoMoreCarrotsException {
    }
}

class NoMoreCarrotsException extends Exception {
}
