package edu.oca.java.se8.certification._1Z0_808.chapter4.immutable;

/*
When you are writing an immutable class, be careful about the return types. 
On the surface, this class appears to be immutable since there is no setter.
The problem is that it isn’t really

A solution is to make a copy of the mutable object. This is called a defensive copy.
 */
public class NotImmutable {

    private StringBuilder builder;

    public NotImmutable(StringBuilder b) {
        builder = b;
    }

    public StringBuilder getBuilder() {
        return builder;
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("initial");
        NotImmutable problem = new NotImmutable(sb);
        sb.append(" added");
        StringBuilder gotBuilder = problem.getBuilder();
        gotBuilder.append(" more");
        System.out.println(problem.getBuilder());
    }

    /* 
    A solution is to make a copy of the mutable object. This is called a defensive copy. 
    public NotImmutable(StringBuilder b) {
        builder = new StringBuilder(b);
    }

    public StringBuilder getBuilder() {
        return new StringBuilder(builder);
    }
    */
    
    /*
    Another approach for the getter is to return an immutable object:
    public String getValue() {
        return builder.toString();
    }
    */
}
