package edu.oca.java.se8.certification._1Z0_808.chapter2;

public class ForStatement {
    public static void main(String[] args) {
        ForStatement forStatement = new ForStatement();
        
        //forStatement.infiniteFor();
        //forStatement.multipleTerms();
    }
    
    public void infiniteFor() {
        for (;;) {
            System.out.println("Infinite for");
        }
    }
    
    public void multipleTerms() {
        int x = 0;
        for (long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(y + " ");
        }
        System.out.print(x); //0 1 2 3 4
    }
    
    public void redeclaringVariable() {
        //int x = 0; // DOES NOT COMPILE
        for (long y = 0, x = 4; x < 5 && y < 10; x++, y++) { 
            System.out.print(x + " ");
        }
    }
    
    public void incompatibleDataTypes() {
        long y, x;
        //for(long y = 0, long x = 4; x < 5 && y<10; x++, y++) { // DOES NOT COMPILE
        for(y = 0, x = 4; x < 5 && y<10; x++, y++) { // COMPILE
            System.out.print(x + " ");
        }
    }
}
