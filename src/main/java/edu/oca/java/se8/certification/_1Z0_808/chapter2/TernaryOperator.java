package edu.oca.java.se8.certification._1Z0_808.chapter2;

/*
As of Java 7, only one of the right-hand expressions of the ternary operator 
will be evaluated at runtime. In a manner similar to the short-circuit 
operators, if one of the two righthand expressions in a ternary operator
performs a side effect, then it may not be applied at runtime.
*/
public class TernaryOperator {
    public static void main(String[] args) {
        TernaryOperator ternaryOperator = new TernaryOperator();
        
        ternaryOperator.leftHandIncrement();
        ternaryOperator.rightHandIncrement();
    }
    
    //Notice that since the left-hand boolean expression was true, only y was incremented.
    public void leftHandIncrement(){
        int y = 1;
        int z = 1;
        final int x = y<10 ? y++ : z++;
        System.out.println(y+","+z); // Outputs 2,1
    }
    
    //Notice that since the right-hand boolean expression was true, only y was incremented.
    public void rightHandIncrement(){
        int y = 1;
        int z = 1;
        final int x = y >= 10 ? y++ : z++;
        System.out.println(y + "," + z); // Outputs 1,2
    }
}
