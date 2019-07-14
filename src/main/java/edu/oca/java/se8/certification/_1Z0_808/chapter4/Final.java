package edu.oca.java.se8.certification._1Z0_808.chapter4;


/* 
The constructor is part of the initialization process, so it is allowed to 
assign final instance variables in it. By the time the constructor completes, 
all final instance variables must have been set.
*/
public class Final {

    private final int volume;
    private final String name = "The Mouse House";

    public Final(int length, int width, int height) {
        volume = length * width * height;
    }
    
    final static void method4() { }
    //public final int void method() { } //DOESN'T COMPILE
    public final int method() { return 0; } 
    static final void method3() { }
    
    //void final method55() {} //DOESN'T COMPILE
    final void method55() {} //DOESN'T COMPILE
    
}
