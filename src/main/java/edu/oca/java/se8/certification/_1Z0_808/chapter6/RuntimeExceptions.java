package edu.oca.java.se8.certification._1Z0_808.chapter6;

/*
ArithmeticException: 
    Thrown by the JVM when code attempts to divide by zero

ArrayIndexOutOfBoundsException: 
    Thrown by the JVM when code uses an illegal index to access an array

ClassCastException: 
    Thrown by the JVM when an attempt is made to cast an exception to a subclass
    of which it is not an instance

IllegalArgumentException: 
    Thrown by the programmer to indicate that a method has been passed an 
    illegal or inappropriate argument

NullPointerException: 
    Thrown by the JVM when there is a null reference where an object is required

NumberFormatException:
    Thrown by the programmer when an attempt is made to convert a string to a 
    numeric type but the string doesn’t have an appropriate format
 */
public class RuntimeExceptions {

    public static void main(String[] args) {
        RuntimeExceptions runtimeExceptions = new RuntimeExceptions();

        runtimeExceptions.arithmeticException();
        runtimeExceptions.arrayIndexOutOfBoundsExceptionNegative();
        runtimeExceptions.arrayIndexOutOfBoundsExceptionPositive();
        runtimeExceptions.classCastException();
        runtimeExceptions.illegalArgumentException(-1);
        runtimeExceptions.nullPointerException();
        runtimeExceptions.numberFormatException();
        
    }

    /* Exception in thread "main" java.lang.ArithmeticException: / by zero */
    public void arithmeticException() {
        int answer = 11 / 0;
    }

    /* Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: -1 */
    public void arrayIndexOutOfBoundsExceptionNegative() {
        int[] countsOfMoose = new int[3];
        System.out.println(countsOfMoose[-1]);
    }

    /* Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3 */
    public void arrayIndexOutOfBoundsExceptionPositive() {
        int total = 0;
        int[] countsOfMoose = new int[3];
        for (int i = 0; i <= countsOfMoose.length; i++) {
            total += countsOfMoose[i];
        }
    }

    /* Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer */
    public void classCastException() {

        String type = "moose";
        //Integer number = (Integer) type; // DOES NOT COMPILE

        Object obj = type;
        Integer number = (Integer) obj;
    }

    /* Exception in thread "main" java.lang.IllegalArgumentException: # eggs must not be negative */
    public void illegalArgumentException(int numberEggs) {
        if (numberEggs < 0)
            throw new IllegalArgumentException("# eggs must not be negative");
    }
    
    /* Exception in thread "main" java.lang.NullPointerException */
    public void nullPointerException() {
        String name = null;
        System.out.println(name.length());
    }
    
    /* Exception in thread "main" java.lang.NumberFormatException: For input string: "abc" */
    public void numberFormatException() {
        Integer.parseInt("abc");
    }
}
