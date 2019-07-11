package edu.oca.java.se8.certification._1Z0_808.chapter4.initialization;

/*
1. If there is a superclass, initialize it first.

2. Static variable declarations and static initializers in the order they appear
in the file.

3. Instance variable declarations and instance initializers in the order they 
appear in the file.

4. The constructor.
*/

/*
1. NO
2. YES
    -count = 0
    -sout(count)
    -count+=10; sout(count)
3. YES
    -name = "Torchie"
    -sout(name)
4. YES
    sout("constructor")

*/
public class InitializationOrderSimple {

    private String name = "Torchie";

    {
        System.out.println(name);
    }
    private static int COUNT = 0;

    static {
        System.out.println(COUNT);
    }

    static {
        COUNT += 10;
        System.out.println(COUNT);
    }

    public InitializationOrderSimple() {
        System.out.println("constructor");
    }
}
