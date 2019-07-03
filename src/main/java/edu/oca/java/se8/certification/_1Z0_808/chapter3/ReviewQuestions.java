package edu.oca.java.se8.certification._1Z0_808.chapter3;

//Answers page 342

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReviewQuestions {
    
    
    
    /*
    What is the result of the following code? (Choose all that apply)
    A. Compile error on line 14.
    B. Compile error on line 15.
    C. Compile error on line 16.
    D. Compile error on another line.
    E. ==
    F. equals
    G. An exception is thrown.
    */
    public void question10() {
        String a = "";
        a += 2;
        a += 'c';
        a += false;
        if ( a == "2cfalse") System.out.println("==");
        if ( a.equals("2cfalse")) System.out.println("equals");
    }
    
    public void question17() {
        ArrayList l = new ArrayList();
        
        /*A.*/ //int length1 = l.capacity; ERROR
        /*B.*/ //int length2 = l.capacity(); ERROR
        /*C.*/ //int length3 = l.length; ERROR
        /*D.*/ //int length4 = l.length(); ERROR
        /*E.*/ //int length5 = l.size; ERROR
        /*F.*/ int length6 = l.size();
        /*G. None of the above.*/
    }
    
    /*
    18. Which of the following are true? (Choose all that apply)
    -A. An array has a fixed size.
    B. An ArrayList has a fixed size.
    -C. An array allows multiple dimensions.
    -D. An array is ordered.
    -E. An ArrayList is ordered.
    F. An array is immutable.
    G. An ArrayList is immutable.
    */
    
    public void question25() {
        List<String> hex = Arrays.asList("30", "8", "3A", "FF");
        Collections.sort(hex); //[30, 3A, 8, FF]
        System.out.println(hex); 
        int x = Collections.binarySearch(hex, "8"); //2
        int y = Collections.binarySearch(hex, "3A");//1
        int z = Collections.binarySearch(hex, "4F");//-3
        System.out.println(x + " " + y + " " + z);//1 2 -3
    }
    
    /*Which of the following are true statements about the following code? 
    (Choose all that apply)
    
    [YES] A. The code compiles.
    [YES] B. The code throws a runtime exception.
    C. Exactly one of the add statements uses autoboxing.
    [YES] D. Exactly two of the add statements use autoboxing.
    E. Exactly three of the add statements use autoboxing.
    */
    public void question26() {
        List<Integer> ages = new ArrayList<>();
        ages.add(Integer.parseInt("5")); //use autoboxing
        ages.add(Integer.valueOf("6")); //use autoboxing
        ages.add(7); 
        ages.add(null);
        for (int age : ages) System.out.print(age); //throws a NullPointerException
    }
    
    public static void main(String[] args) {
        ReviewQuestions reviewQuestions = new ReviewQuestions();
        //reviewQuestions.question10();
        reviewQuestions.question25();
    }
}
