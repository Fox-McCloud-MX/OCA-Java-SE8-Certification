package edu.oca.java.se8.certification._1Z0_808.chapter2;

public class ReviewQuestions {

    public static void main(String[] args) {
        ReviewQuestions reviewQuestions = new ReviewQuestions();

        //reviewQuestions.questions8();
        //reviewQuestions.questions9();
        reviewQuestions.questions10();
    }

    public void questions8() {
        boolean x = true, z = true;
        int y = 20;
        x = (y != 10) ^ (z = false);
        System.out.println(x + ", " + y + ", " + z);
    }

    public void questions9() {
        for (int i = 0; i < 10;) {
            i = i++;
            System.out.println("Hello World");
        }
    }
    
    public void questions10() {
        int count = 0;
        ROW_LOOP:
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 2; col++) {
                if (row * col % 2 == 0) {
                    continue ROW_LOOP;
                }
                count++;
            }
        }
        System.out.println(count); //2
    }
}
