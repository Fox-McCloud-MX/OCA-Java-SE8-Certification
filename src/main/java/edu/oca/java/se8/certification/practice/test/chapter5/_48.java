package edu.oca.java.se8.certification.practice.test.chapter5;

public class _48 {

    public static void main(String[] args) {
        int result = 8;
        forw: { //change "for" word
            while (result > 7) {
                result++;
                do {
                    result--;
                } while (result > 5);
                break forw ;
            }
        }
        System.out.println(result);
    }
}
