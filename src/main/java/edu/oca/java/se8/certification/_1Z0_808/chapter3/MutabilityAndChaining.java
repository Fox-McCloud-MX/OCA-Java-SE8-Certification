package edu.oca.java.se8.certification._1Z0_808.chapter3;

public class MutabilityAndChaining {
    
    public static void main(String[] args) {
        MutabilityAndChaining mutabilityAndChaining = new MutabilityAndChaining();
        
        //mutabilityAndChaining.onlyOneNewInstance();
        //mutabilityAndChaining.twoNewInstance();
        mutabilityAndChaining.sizeVsCapacity();
        //mutabilityAndChaining.internSimpleComparison();
        //mutabilityAndChaining.internComplexComparison();
    }
    
    public void onlyOneNewInstance(){
        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("a=" + a); //abcdefg
        System.out.println("b=" + b); //abcdefg
    }
    
    public void twoNewInstance(){
        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = new StringBuilder("de");
        b = b.append("f").append("g");
        System.out.println("a = " + a); //abc
        System.out.println("b = " + b); //defg
    }
    
    //size vs capacity
    //StringBuilder doesn't have size method.
    //StringBuilder have length method.
    public void sizeVsCapacity(){
        StringBuilder sb = new StringBuilder(5);
        System.out.println(sb.capacity()); //5
        System.out.println(sb.length()); //0
        
        sb.append("anim");
        System.out.println(sb.capacity()); //5
        System.out.println(sb.length()); //4
        
        sb.append("als");
        System.out.println(sb.capacity()); //12
        System.out.println(sb.length()); //7
    }
    
    public void internSimpleComparison(){
        // S1 refers to Object in the Heap Area  
        String s1 = new String("GFG"); // Line-1  
  
        // S2 refers to Object in String Pool Area 
        String s2 = s1.intern(); // Line-2  
          
        // Comparing memory locations 
        // s1 is in Heap 
        // s2 is in SCP 
        System.out.println(String.format("Comparing memory locations: %s", s1 == s2)); //true
        
        // Comparing only values 
        System.out.println(String.format("Comparing only values: %s", s1.equals(s2))); 
          
        // S3 refers to Object in the String Pool Area  
        String s3 = "GFG"; // Line-3  
  
        System.out.println(String.format("Comparing strings in String Pool: %s" , s2 == s3));  
    }
    
    public void internComplexComparison() {
        // S1 refers to Object in the Heap Area
        String s1 = new String("GFG"); // Line-1

        // S2 now refers to Object in Strinf Pool Area
        String s2 = s1.concat("GFG"); // Line-2
        System.out.println(s1 == s2); //false

        // S3 refers to Object in String Pool Area 
        String s3 = s2.intern(); // Line-3
        System.out.println(s2 == s3); //true

        // S4 refers to Object in the SCP Area  
        String s4 = "GFGGFG"; // Line-4
        System.out.println(s3 == s4); //true
    }
    
    public void appendCodePoint(){
        // create StringBuilder object 
        StringBuilder str
            = new StringBuilder("appendCodePoint");
        System.out.println("StringBuilder = "+ str);

        // Append 'C'(67) to the String 
        // ascii int value
        // A start in 65
        // a start in 97
        str.appendCodePoint(67);

        // Print the modified String 
        System.out.println("Modified StringBuilder = " + str);
    }
}
