package edu.oca.java.se8.certification._1Z0_808.chapter6;


/*
ExceptionInInitializerError:
    Thrown by the JVM when a static initializer throws an exception and doesn’t handle it

StackOverflowError: 
    Thrown by the JVM when a method calls itself too many times 
    (this is called infinite recursion because the method typically calls itself without end)

NoClassDefFoundError: 
    Thrown by the JVM when a class that the code uses is available at compile time but not runtime
*/
public class Errors {

    /* 
    ExceptionInInitializerError: 
    Exception in thread "main" java.lang.ExceptionInInitializerError
    Caused by: java.lang.ArrayIndexOutOfBoundsException: -1
     */
    static {
        int[] countsOfMoose = new int[3];
        int num = countsOfMoose[-1];
    }

    /*
    StackOverflowError:
    Exception in thread "main" java.lang.StackOverflowError
    */
    public static void doNotCodeThis(int num) {
        doNotCodeThis(1);
    }
}
