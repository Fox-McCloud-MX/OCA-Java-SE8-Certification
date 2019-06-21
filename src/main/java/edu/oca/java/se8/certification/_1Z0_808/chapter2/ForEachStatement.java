package edu.oca.java.se8.certification._1Z0_808.chapter2;

import java.util.ArrayList;
import java.util.List;

/*
The right-hand side of the for-each loop statement must be a built-in Java array
or an object whose class implements java.lang.Iterable, which includes most of
the Java Collections framework.
 */
public class ForEachStatement {

    public static void main(String[] args) {
        ForEachStatement forEachStatement = new ForEachStatement();
        
        forEachStatement.forEach();
        
    }
    
    //Notice that in the second version, there is no update statement as it 
    //is not required when using the java.util.Iterator class.
    public void forEach(){
        List<Integer> values = new ArrayList();

        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);

        for (int value : values) {
            System.out.print(value + ", ");
        }
        for (java.util.Iterator<Integer> i = values.iterator(); i.hasNext();) {
            int value = i.next();
            System.out.print(value + ", ");
        }
    }
}
