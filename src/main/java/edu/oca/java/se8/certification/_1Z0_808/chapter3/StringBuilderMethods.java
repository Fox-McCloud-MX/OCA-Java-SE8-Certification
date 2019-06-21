package edu.oca.java.se8.certification._1Z0_808.chapter3;

public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilderMethods stringBuilderMethods = new StringBuilderMethods();
        //stringBuilderMethods.multipleMethods();
        //stringBuilderMethods.append();
        stringBuilderMethods.insert();
    }
    
    //charAt(), indexOf(), length(), and substring()
    public void multipleMethods(){
        StringBuilder sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        int len = sb.length();
        char ch = sb.charAt(6);
        System.out.println(sub + " " + len + " " + ch); //anim 7 s.
    }
    
    public void append(){
        StringBuilder sb = new StringBuilder().append(1).append('c');
        sb.append("-").append(true);
        System.out.println(sb); // 1c-true
    }
    
    public void insert(){
        StringBuilder sb = new StringBuilder("animals");
        sb.insert(7, "-"); // sb = animals-
        sb.insert(0, "-"); // sb = -animals-
        sb.insert(4, "-"); // sb = -ani-mals
        System.out.println(sb);
        
        //java.lang.StringIndexOutOfBoundsException: String index out of range: 11
        sb.insert(11, "$"); 
        System.out.println(sb);
        
    }
}
