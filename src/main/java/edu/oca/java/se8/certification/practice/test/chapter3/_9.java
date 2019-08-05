package edu.oca.java.se8.certification.practice.test.chapter3;

public class _9 {

    public void calculateResult(Integer candidateA, Integer candidateB) {
        boolean process = candidateA == null || candidateA.intValue() < 10;
        //boolean value = candidateA && candidateB;
        //System.out.print(process || value);
    }

    public static void main(String[] unused) {
        new _9().calculateResult(null, 203);
    }
}
