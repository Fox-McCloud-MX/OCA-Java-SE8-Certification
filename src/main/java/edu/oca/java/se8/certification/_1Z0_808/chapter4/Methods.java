package edu.oca.java.se8.certification._1Z0_808.chapter4;

/*
Optional Specifiers.

static:         Covered later in this chapter. Used for class methods.

abstract:       Covered in Chapter 5. Used when not providing a method body.

final:          Covered in Chapter 5. Used when a method is not allowed to be 
                overridden by a subclass.

synchronized:   On the OCP but not the OCA exam.

native:         Not on the OCA or OCP exam. Used when interacting with code 
                written in another language such as C++.

strictfp:       Not on the OCA or OCP exam. Used for making fl oating-point 
                calculations portable.
*/

public class Methods {
    /* Declare methods */
    public void walk1() {}
    //default void walk2() {} // DOES NOT COMPILE
    //void public walk3() {} // DOES NOT COMPILE
    void walk4() {}
    
    /* Optional Specifiers */
    public void walk11() {}
    public final void walk2() {}
    public static final void walk3() {}
    public final static void walk41() {}
    //public modifier void walk5() {} // DOES NOT COMPILE
    //public void final walk6() {} // DOES NOT COMPILE
    final public void walk7() {}
    
    
    /* return statement */
    public void walk12() { }
    public void walk22() { return; }
    public String walk32() { return ""; }
    //public String walk42() { } // DOES NOT COMPILE
    //public walk52() { } // DOES NOT COMPILE
    //String walk62(int a) { if (a == 4) return ""; } // DOES NOT COMPILE
    
    /* method name */
    public void walk13() { }
    //public void 2walk() { } // DOES NOT COMPILE
    //public walk3 void() { } // DOES NOT COMPILE
    public void Walk_$() { }
    public void _Walk() { }
    public void $Walk() { }
    //public void() { } // DOES NOT COMPILE
    
    /* parameters list */
    public void walk14() { }
    //public void walk24 { } // DOES NOT COMPILE
    public void walk34(int a) { }
    //public void walk44(int a; int b) { } // DOES NOT COMPILE
    public void walk54(int a, int b) { }
    
    /* Optional Exception List */
    public void zeroExceptions() { }
    public void oneException() throws IllegalArgumentException { }
    public void twoExceptions() throws IllegalArgumentException, InterruptedException { }
    
    /* Method body. */
    public void walk15() { }
    //public void walk25; // DOES NOT COMPILE
    public void walk35(int a) { int name = 5; }
    
    /* Varargs*/
    //only allowed to have one vararg parameter per method.
    public void walk1(int... nums) { }
    public void walk2(int start, int... nums) { }
    //public void walk3(int... nums, int start) { } // DOES NOT COMPILE
    //public void walk4(int... start, int... nums) { } // DOES NOT COMPILE
    //walk2(1, null); // throws a NullPointerException
}
